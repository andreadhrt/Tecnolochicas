import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombreMedicamento;
        double precio, totalSinDescuento, descuento, totalConDescuento;
        int cantidad;

        // Entrada de datos
        System.out.print("Ingrese el nombre del medicamento: ");
        nombreMedicamento = leer.nextLine();

        System.out.print("Ingrese el precio del medicamento: ");
        precio = leer.nextDouble();

        System.out.print("Ingrese la cantidad de medicamentos: ");
        cantidad = leer.nextInt();
        leer.nextLine();

        totalSinDescuento = precio * cantidad;

        // Uso del operador ternario
        descuento = (totalSinDescuento > 500) ? totalSinDescuento * 0.15 : 0;
        totalConDescuento = totalSinDescuento - descuento;

        // Alamacenamos true o false de acuerdo a si la condicion se cumple
        boolean aplicaDescuento = totalSinDescuento > 500;

        // Impresion de los datos
        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        leer.close();
    }
}
