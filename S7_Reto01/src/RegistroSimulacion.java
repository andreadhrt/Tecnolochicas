import java.io.IOException;
import java.nio.file.*;

public class RegistroSimulacion {

    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("config/parametros.txt");

        guardarParametros(rutaArchivo);
        if (Files.exists(rutaArchivo)) {
            System.out.println("✅ Archivo creado correctamente.");
            leerParametros(rutaArchivo);
        } else {
            System.out.println("❌ No se pudo crear el archivo.");
        }
    }

    public static void guardarParametros(Path rutaArchivo) {
        // Parámetros a guardar
        String contenido = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        try {
            // Crear carpeta "config" si no existe
            Path carpeta = rutaArchivo.getParent();
            if (!Files.exists(carpeta)) {
                Files.createDirectories(carpeta);
            }

            // Escribir parámetros en el archivo
            Files.write(rutaArchivo, contenido.getBytes());
            System.out.println("📝 Parámetros guardados en: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("⚠️ Error al guardar parámetros: " + e.getMessage());
        }
    }

    public static void leerParametros(Path rutaArchivo) {
        try {
            String contenido = Files.readString(rutaArchivo);
            System.out.println("\n📄 Contenido del archivo:");
            System.out.println(contenido);
        } catch (IOException e) {
            System.err.println("⚠️ Error al leer el archivo: " + e.getMessage());
        }
    }
}
