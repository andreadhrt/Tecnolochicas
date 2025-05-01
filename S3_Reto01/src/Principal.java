// 🧪 Clase principal donde probamos el sistema de vuelo
public class Principal {
    public static void main(String[] args) {
        // 👤 Creamos un pasajero
        Pasajero p1 = new Pasajero("Ana Martínez", "MX123456");

        // ✈️ Creamos un vuelo
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // ✅ Intentamos reservar el asiento
        if (vuelo.reservarAsiento(p1)) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        }

        // 📝 Mostramos el itinerario
        System.out.println(vuelo.obtenerItinerario());
        System.out.println();

        // ❌ Cancelamos la reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // 📝 Mostramos el itinerario de nuevo
        System.out.println(vuelo.obtenerItinerario());
        System.out.println();

        // 📋 Reservamos de nuevo con sobrecarga (nombre y pasaporte)
        vuelo.reservarAsiento("Mario Gonzalez", "MX789012");

        // 📝 Mostramos el itinerario final
        System.out.println(vuelo.obtenerItinerario());
    }
}
