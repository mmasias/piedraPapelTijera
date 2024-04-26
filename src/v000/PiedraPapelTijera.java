package v000;

class PiedraPapelTijera {

    private Jugador[] jugadores;

    public PiedraPapelTijera() {
        jugadores = new Jugador[2];
        jugadores[0] = new Jugador("Bill Gates");
        jugadores[1] = new Jugador("Steve Jobs");
    }

    public void jugar() {
        do {
            jugadores[0].juegaCon(jugadores[1]);
        } while (jugadores[0].partidasGanadas() < 3 && jugadores[1].partidasGanadas() < 3);
        jugadores[0].verEstadisticas();
        jugadores[1].verEstadisticas();
    }

    public static void main(String[] args) {

        new PiedraPapelTijera().jugar();
    }
}