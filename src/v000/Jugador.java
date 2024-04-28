package v000;

public class Jugador {
    private int puntos;
    private String nombre;
    private Pieza[] piezas;
    private int[][] reglas = {
            { 0, 1, 1 },
            { -1, 0, -1 },
            { -1, 1, 0 }
    };

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.piezas = Pieza.values();
    }

    public void juegaCon(Jugador jugador) {
        int miJugada = this.lanzamiento();
        int suJugada = jugador.lanzamiento();

        System.out.println(
                "[" + this.nombre + "] saca [" + piezas[miJugada] + "] / [" + jugador.nombre + "] saca ["
                        + piezas[suJugada] + "]");

        int ganador = reglas[miJugada][suJugada];

        if (ganador == 1) {
            this.gana();
        } else if (ganador == -1) {
            jugador.gana();
        } else {
            empate();
        }
    }

    private void empate() {
        System.out.println("Empate");
    }

    private void gana() {
        this.puntos++;
        System.out.println("Gana " + this.nombre);
    }

    private int lanzamiento() {
        return (int) (Math.random() * piezas.length);
    }

    public int partidasGanadas() {
        return this.puntos;
    }

    public void verEstadisticas() {
        System.out.println("Jugador " + nombre);
        System.out.println(puntos + " puntos...");
    }
}
