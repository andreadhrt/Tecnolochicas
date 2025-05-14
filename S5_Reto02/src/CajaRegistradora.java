public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[] {
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(200.0, false) // Fallo simulado
        };

        for (MetodoPago pago : pagos) {
            if (pago instanceof Autenticable) {
                Autenticable auth = (Autenticable) pago;
                if (auth.autenticar()) {
                    pago.procesarPago();
                    pago.mostrarResumen();
                }
                System.out.println(); // Separador visual
            }
        }
    }
}
