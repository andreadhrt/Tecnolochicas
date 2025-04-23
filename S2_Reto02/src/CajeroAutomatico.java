import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double saldo = 1000.0;
        int opc;

        do {
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción (1-4): ");
            opc = leer.nextInt();
            leer.nextLine(); // limpia el buffer

            switch (opc) {
                case 1:
                    System.out.println("Su saldo es: $" + saldo);
                    leer.nextLine(); // Enter para poder visualizar la informacion antes de continuar
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double deposito = leer.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor que cero.");
                        leer.nextLine(); // Enter para poder visualizar la informacion antes de continuar
                    }
                    saldo += deposito;
                    System.out.println("Depósito exitoso. Su saldo actual es: $" + saldo);
                    leer.nextLine(); // Enter para poder visualizar la informacion antes de continuar
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double retiro = leer.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor que cero.");
                        leer.nextLine(); // Enter para poder visualizar la informacion antes de continuar
                    }
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente. Tu saldo es: $" + saldo);
                        leer.nextLine(); // Enter para poder visualizar la informacion antes de continuar
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                        leer.nextLine(); // Enter para poder visualizar la informacion antes de continuar
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el Cajero Automático :)");
                    break;
                default:
                    System.out.println("Opción no válida, seleccione una opción del 1 al 4.");
                    break;
            }

        } while (opc != 4);
    }
}
