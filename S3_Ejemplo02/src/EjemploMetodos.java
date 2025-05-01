public class EjemploMetodos {

    // 1️⃣ Método sin parámetros y sin retorno
    public void mostrarBienvenida() {
        System.out.println("👋 Bienvenido al sistema");
    }

    // 2️⃣ Método con parámetros y sin retorno
    public void mostrarSuma(int a, int b) {
        int resultado = a + b;
        System.out.println("➕ La suma es: " + resultado);
    }

    // 3️⃣ Método con parámetros y con retorno
    public int obtenerSuma(int a, int b) {
        return a + b;
    }

    // 4️⃣ Paso por valor (tipos primitivos)
    public void duplicar(int numero) {
        numero = numero * 2;
        System.out.println("Dentro del método: " + numero);
    }

    // 5️⃣ Paso por referencia (objetos)
    public static class Persona {
        String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }
    }

    public void cambiarNombre(Persona p) {
        p.nombre = "Nuevo nombre";
    }

    // 6️⃣ Sobrecarga de métodos
    public void saludar() {
        System.out.println("👋 Hola");
    }

    public void saludar(String nombre) {
        System.out.println("👋 Hola, " + nombre);
    }

    // Método principal para probar todo
    public static void main(String[] args) {
        EjemploMetodos ejemplo = new EjemploMetodos();

        // 1️⃣
        ejemplo.mostrarBienvenida();

        // 2️⃣
        ejemplo.mostrarSuma(10, 20);

        // 3️⃣
        int suma = ejemplo.obtenerSuma(5, 7);
        System.out.println("🧮 Resultado: " + suma);

        // 4️⃣
        int x = 10;
        ejemplo.duplicar(x);
        System.out.println("Fuera del método: " + x);  // x no cambia

        // 5️⃣
        Persona persona = new Persona("Mario");
        ejemplo.cambiarNombre(persona);
        System.out.println("Nombre actualizado: " + persona.nombre);

        // 6️⃣
        ejemplo.saludar();              // Hola
        ejemplo.saludar("Mario");       // Hola, Mario
    }
}
