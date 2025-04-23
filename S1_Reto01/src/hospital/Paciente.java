package hospital;

public class Paciente {
    String nombre;
    int edad;
    String numeroExpediente;

    public void mostrarInformacion() {
        System.out.println("\nInformación del paciente");
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Número de expediente: " + numeroExpediente);
    }
}
