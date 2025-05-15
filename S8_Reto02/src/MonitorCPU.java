import java.util.*;

// Excepción personalizada
class ConsumoCriticoException extends Exception {
    public ConsumoCriticoException(String mensaje) {
        super(mensaje);
    }
}

// Clase principal
public class MonitorCPU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> consumosRegistrados = new HashSet<>();

        try {
            System.out.println("🔍 Monitoreo de servidores (escribe 'fin' para terminar):");

            while (true) {
                System.out.print("Ingresa el consumo de CPU (%): ");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }

                try {
                    int consumo = Integer.parseInt(entrada);

                    // Validación de rango
                    if (consumo < 0 || consumo > 100) {
                        System.out.println("❌ Error: El consumo debe estar entre 0% y 100%.");
                        continue;
                    }

                    // Validación de duplicado
                    if (!consumosRegistrados.add(consumo)) {
                        System.out.println("⚠️ Advertencia: Ese consumo ya fue registrado.");
                        continue;
                    }

                    // Validación de consumo crítico
                    if (consumo > 95) {
                        throw new ConsumoCriticoException("🚨 Alerta crítica: El consumo de CPU es mayor al 95%.");
                    }

                    System.out.println("✅ Consumo registrado correctamente.");

                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Ingresa un valor numérico válido.");
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                }
            }

        } finally {
            scanner.close();
            System.out.println("🛑 Monitoreo finalizado. Recursos liberados.");
        }
    }
}
