public abstract class UnidadEmergencias {
    protected String nombre;

    public UnidadEmergencias(String nombre) {
        this.nombre = nombre;
    }

    public void activarUnidad() {
        System.out.println("🚨 Activando unidad: " + nombre);
    }

    public abstract void responder();
}
