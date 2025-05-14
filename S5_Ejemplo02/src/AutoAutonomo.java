public class AutoAutonomo extends Vehiculo {
    SensorGPS gps;
    Camara camara;
    SistemaIA ia;
    Motor motor;

    public AutoAutonomo(String marca) {
        super(marca);
        this.gps = new SensorGPS();
        this.camara = new Camara();
        this.ia = new SistemaIA();
        this.motor = new Motor();
    }

    public void iniciarAutonomia() {
        System.out.println("🤖 Modo autónomo activado.");
        gps.localizar();
        camara.detectarObstaculos();
        ia.tomarDecision();
        motor.arrancar();
    }

    public class SensorGPS {
        public void localizar() {
            System.out.println("📍 GPS: posición actual obtenida.");
        }
    }

    public class Camara {
        public void detectarObstaculos() {
            System.out.println("📷 Cámara: obstáculos detectados en el camino.");
        }
    }

    public class SistemaIA {
        public void tomarDecision() {
            System.out.println("🧠 IA: trayectoria calculada.");
        }
    }

    public class Motor {
        public void arrancar() {
            System.out.println("🚗 Motor: velocidad regulada y marcha iniciada.");
        }
    }
}