// 5. Crear una clase llamada Principal y crear dos objetos
// de tipo entrada.
// 6. Llamar al metodo para mostar la informacion en la consola
public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Obra de teatro", 450.0);
        Entrada entrada2 = new Entrada("Concierto", 3100.0);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        // Reto adicional
        Entrada_Record entrada3 = new Entrada_Record("Sinfonica", 1200.0);
        System.out.println(entrada3);
    }
}
