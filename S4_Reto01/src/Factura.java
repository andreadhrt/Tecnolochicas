import java.util.Objects;

public class Factura {
    private String folio;
    private String cliente;
    private double total;

    // Constructor
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Método toString()
    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    // Método equals() basado en folio
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Factura factura = (Factura) obj;
        return folio.equals(factura.folio);
    }

    // Método hashCode() basado en folio
    @Override
    public int hashCode() {
        return Objects.hash(folio);
    }
}
