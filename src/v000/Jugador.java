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
        } else if(miJugada<suJugada){
            jugador.gana();
        } else {
            jugador.empate();
        }  
    }

    private void empate() {
        System.out.println("Empate");
    }

    private void gana(){
        this.puntos++;
        System.out.println("Gana " + this.nombre);
    }

    private int lanzamiento() {
        return (int) (Math.random * 3);
    }

    public int partidasGanadas() {

    }

    public void verEstadisticas() {

    }

}
