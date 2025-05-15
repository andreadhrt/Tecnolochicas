import java.util.Scanner;

// INTERFACES

interface TransicionHistoria {
    void avanzarEscena(String decision);
}

interface GestorDialogo {
    void mostrarDialogo(String texto);
}

interface LogicaDecision {
    String obtenerDecision();
}

// IMPLEMENTACIONES

class TransicionSimple implements TransicionHistoria {
    @Override
    public void avanzarEscena(String decision) {
        if ("1".equals(decision)) {
            System.out.println("🌅 Transición: El héroe se aventura hacia el bosque misterioso.");
        } else {
            System.out.println("🏰 Transición: El héroe decide regresar al castillo.");
        }
    }
}

class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String texto) {
        System.out.println("🗨️ Personaje: \"" + texto + "\"");
    }
}

class DecisionBinaria implements LogicaDecision {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String obtenerDecision() {
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Ir al bosque");
        System.out.println("2. Regresar al castillo");
        System.out.print("Elige (1 o 2): ");
        return scanner.nextLine();
    }
}

// CLASE PRINCIPAL

public class MainNarrativa {
    private TransicionHistoria transicion;
    private GestorDialogo dialogo;
    private LogicaDecision logica;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision logica) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.logica = logica;
    }

    public void ejecutarEscena() {
        dialogo.mostrarDialogo("Nos encontramos en una encrucijada.");
        String decision = logica.obtenerDecision();
        transicion.avanzarEscena(decision);
        dialogo.mostrarDialogo("Tu decisión marcará el destino del reino...");
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa narrativa = new MainNarrativa(transicion, dialogo, decision);
        narrativa.ejecutarEscena();
    }
}
