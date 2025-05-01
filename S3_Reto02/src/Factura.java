import java.util.Optional;

// Clase que representa una factura simple
public class Factura {
    // Atributos privados (encapsulados)
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    // Constructor: inicializa una nueva factura
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;

        // Si el RFC es null, se usa Optional.empty() para evitar errores
        if (rfc == null) {
            this.rfc = Optional.empty();
        } else {
            this.rfc = Optional.of(rfc);
        }
    }

    // Método público para obtener el resumen de la factura
    public String getResumen() {
        String resumen = "Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        // Se verifica si el RFC está presente
        resumen += "RFC: " + rfc.orElse("[No proporcionado]");
        return resumen;
    }
}
