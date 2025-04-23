// 1. Crear una clase llamada Entrada
public class Entrada {
    // 2. Declarar los atributos
    String evento;
    double precio;

    // 3. Crear un Constructor
    public Entrada(String evento, double precio) {
        this.evento = evento;
        this.precio = precio;
    }

    // Método publico para mostrar los datos
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: " + precio);
    }
}
