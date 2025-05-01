// 👤 Clase que representa a un pasajero de avión
public class Pasajero {
    // 📋 Atributos del pasajero
    private String nombre;
    private String pasaporte;

    // 🛠️ Constructor: crea un pasajero con su nombre y pasaporte
    public Pasajero(String nombre, String pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    // 🎯 Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // 🎯 Getter para el pasaporte
    public String getPasaporte() {
        return pasaporte;
    }
}
