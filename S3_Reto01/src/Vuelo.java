// ✈️ Clase que representa un vuelo
public class Vuelo {
    // 🔐 Atributos privados
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;  // Puede ser null si no hay reserva

    // 🛠️ Constructor: inicializa un nuevo vuelo
    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null; // Al inicio, nadie ha reservado
    }

    // 📦 Método para reservar con objeto Pasajero
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        }
        return false; // Ya está reservado
    }

    // 🔁 Método sobrecargado para reservar con nombre y pasaporte
    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    // ❌ Método para cancelar la reserva
    public void cancelarReserva() {
        asientoReservado = null;
    }

    // 📝 Devuelve información del vuelo y del pasajero
    public String obtenerItinerario() {
        String info = "✈️ Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.getNombre();
        } else {
            info += "Pasajero: [Sin reserva]";
        }
        return info;
    }
}
