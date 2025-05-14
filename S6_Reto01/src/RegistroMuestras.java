import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class RegistroMuestras {
    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden de llegada
        ArrayList<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        listaMuestras.add("Homo sapiens"); // muestra repetida

        // Paso 2: HashSet para obtener las especies únicas procesadas
        HashSet<String> especiesUnicas = new HashSet<>(listaMuestras);

        // Paso 3: HashMap para asociar ID de muestra con el nombre del investigador
        HashMap<String, String> mapaInvestigadores = new HashMap<>();
        mapaInvestigadores.put("M-001", "Dra. López");
        mapaInvestigadores.put("M-002", "Dr. Hernández");
        mapaInvestigadores.put("M-003", "Dra. Gómez");

        // Paso 4: Mostrar los resultados en consola

        System.out.println("📥 Lista de muestras en orden de llegada:");
        for (String especie : listaMuestras) {
            System.out.println("- " + especie);
        }

        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\n🧑‍🔬 ID de muestra → Investigador responsable:");
        for (String id : mapaInvestigadores.keySet()) {
            System.out.println("- " + id + " → " + mapaInvestigadores.get(id));
        }

        // Paso adicional: búsqueda de un investigador por ID de muestra
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n🔍 Ingresa un ID de muestra para buscar (ej. M-002): ");
        String idBusqueda = scanner.nextLine();

        if (mapaInvestigadores.containsKey(idBusqueda)) {
            System.out.println("✅ El investigador responsable de " + idBusqueda + " es: " + mapaInvestigadores.get(idBusqueda));
        } else {
            System.out.println("⚠️ No se encontró información para el ID: " + idBusqueda);
        }

        scanner.close();
    }
}