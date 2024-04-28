package v000;

public class Reglas {
    private int[][] reglas = {
        { 0, 1, 1 },
        { -1, 0, -1 },
        { -1, 1, 0 }
    };

    public int resultadoJugada(Pieza jugada1, Pieza jugada2) {
        return reglas[jugada1.ordinal()][jugada2.ordinal()];
    }
}
