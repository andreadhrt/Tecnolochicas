public class PagoTransferencia extends MetodoPago implements Autenticable {
    private boolean validacionExternaExitosa;

    public PagoTransferencia(double monto, boolean validacionExternaExitosa) {
        super(monto);
        this.validacionExternaExitosa = validacionExternaExitosa;
    }

    @Override
    public boolean autenticar() {
        if (validacionExternaExitosa) {
            System.out.println("✅ Autenticación exitosa.");
            return true;
        } else {
            System.out.println("❌ Fallo de autenticación. Transferencia no válida.");
            return false;
        }
    }

    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando transferencia por $" + monto);
    }
}