import java.io.*;
import java.nio.file.*;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        Path rutaLog = Paths.get("errores.log");
        Path rutaRegistroFallos = Paths.get("registro_fallos.txt");

        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        // Análisis del archivo con manejo de errores
        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    totalErrores++;
                }
                if (linea.contains("WARNING")) {
                    totalWarnings++;
                }
            }

            // Cálculo de porcentaje
            int totalRelevantes = totalErrores + totalWarnings;
            double porcentaje = totalLineas > 0
                    ? ((double) totalRelevantes / totalLineas) * 100
                    : 0;

            // Mostrar resumen
            System.out.println("📊 Resumen del análisis:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + totalErrores);
            System.out.println("Cantidad de advertencias: " + totalWarnings);
            System.out.printf("Porcentaje de líneas con errores o advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.err.println("❌ Error al procesar el archivo: " + e.getMessage());

            // Escribir mensaje de error en registro_fallos.txt
            try {
                Files.writeString(rutaRegistroFallos,
                        "Error al leer errores.log: " + e.getMessage() + System.lineSeparator(),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException ex) {
                System.err.println("❌ También falló al escribir en registro_fallos.txt: " + ex.getMessage());
            }
        }
    }
}
