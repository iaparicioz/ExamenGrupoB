public class Main {
    /*Vamos a simular un torneo de Battle Royale, estilo Warzone.
    En resumen, entran 10 jugadores (hilos) de los que solo puede quedar uno.
        Sin embargo, inicialmente, se crean 15 jugadores (hilos) de los cuales solo los 10 primeros más rápidos entran
    a la batalla de inmediato. Los demás tendrán que esperar a que haya hueco.

        Nada más entrar cada hilo duerme por entre 1 y 5 segundos.

        El primero hilo que acabe consiguen un bonus.

        Los 5 últimos mueren, dando paso a los hilos que estaban esperando.

        Cuando todos los hilos hayan acabado, cada uno de los hilos saca un número aleatorio
    que será la puntuación y se lo entrega a alguna clase que se encargue de calcular al ganador.
        La puntuación que hubieran sacado los hilos que tenían bonus vale doble.
        Gana el hilo que más puntos haya conseguido.

    Planteamiento del problema (5)

    Entrada de los jugadores (2)

    Cálculo del bonus y el remplazo (1)

    Cálculo del ganador (2)

    Atención: Debes utilizar elementos de concurrencia para resolver estos problemas,
    evitando arraylist y otros objetos de ese estilo en la concurrencia.
     */

    public static void main(String [] args){
        Batalla b = new Batalla();
        for (int i=0; i<15;i++){
            Jugador j = new Jugador(b);
            j.setName("Hilo " + i);
            j.start();

        }
    }
}
