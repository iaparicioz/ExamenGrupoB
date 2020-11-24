import java.util.Random;

public class Jugador extends Thread {
    Batalla batalla;

    public Jugador(Batalla batalla) {
        this.batalla=batalla;
    }


    @Override
    public void run() {
        try {
            Batalla.addJugador(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
