import java.util.Random;
import java.util.concurrent.Semaphore;

public class Batalla {

    private static Jugador perdedor;

    private static final int MAX_AVAILABLE = 10;
    private static final Semaphore available = new Semaphore(MAX_AVAILABLE, false);


    private Jugador jugador;

    public static void addJugador(Jugador jugador) throws InterruptedException {
        try {
            available.acquire();
            int duracion = new Random().nextInt(4000) + 1000;
            System.out.println("Entra en la batalla el jugador " + jugador.getName() + " y ha dormido " + duracion);
            jugador.sleep(duracion);
            if (perdedor == null) {
                //soy el primero en meterme no habia nadie

                System.out.println(jugador.getName() + " ha sido el primer hilo en meterse");
                perdedor = jugador;
                System.out.println("Upssss, me han eliminado, soy el " + jugador.getName() + " al menos he conseguido un bonus :)");
            } else {
                System.out.println("Upssss, me han eliminado, soy el " + jugador.getName());
            }
            available.release();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}




