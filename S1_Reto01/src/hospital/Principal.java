package hospital;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.print("Ingrese el nombre del paciente: ");
        paciente.nombre = leer.nextLine(); // Leer cadenas

        System.out.print("Ingrese la edad del paciente: ");
        paciente.edad = leer.nextInt(); // Leer enteros
        leer.nextLine(); // Limpia el buffer

        System.out.print("Ingrese el numero de expediente: ");
        paciente.numeroExpediente = leer.nextLine(); // Leer cadenas

        leer.close();

        // Imprime la información del paciente después de haberla pedido
        paciente.mostrarInformacion();
    }
}
