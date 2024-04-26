package v000;

public class Jugador {

    public Jugador(String nombre) {

    }

    public void juegaCon(Jugador jugador) {

        int miJugada = this.lanzamiento();
        int suJugada = jugador.lanzamiento();
        String descripcion = "";

        if(miJugada>suJugada){
            this.gana();
            descripcion = "Gano " + this.nombre;
        } else if(miJugada<suJugada){
            jugador.gana();
            descripcion = "Gano " + jugador.nombre;
        } else {
            descripcion = "Empate!";
        }
        System.out.println(descripcion);
    }

    private int lanzamiento() {
        return (int) (Math.random * 3);
    }

    public int partidasGanadas() {

    }

    public void verEstadisticas() {

    }

}
