package pe.edu.utp.tp.poo.OperacionJuego;

public class ComprobarGanador {

    public boolean ValidarGanador(int numeroGenerado, int numeroJugador){

        boolean ganador = false;

        if (numeroJugador == numeroGenerado){
            ganador = true;
        }
        return ganador;
    }
}
