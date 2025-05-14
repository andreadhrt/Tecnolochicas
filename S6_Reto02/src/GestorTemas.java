import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class GestorTemas {
    public static void main(String[] args) {
        // Lista concurrente de temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        // Agregamos algunos temas
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Repositorio concurrente de recursos por tema
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        // Ordenar alfabéticamente (Comparable)
        Collections.sort(temas);
        System.out.println("🗂️ Temas ordenados alfabéticamente:");
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        // Ordenar por prioridad (Comparator)
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("\n🔥 Temas ordenados por prioridad:");
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        // Mostrar recursos por tema
        System.out.println("\n🔗 Repositorio de recursos:");
        for (String titulo : recursos.keySet()) {
            System.out.println("🔸 " + titulo + " → " + recursos.get(titulo));
        }
    }
}
