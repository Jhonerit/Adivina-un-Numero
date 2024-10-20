package pe.edu.utp.tp.poo.OperacionJuego;

public class Generador {

    private int numeroGenerado;

    public int getNumeroGenerado() {
        return numeroGenerado;
    }

    public void GenerarNumerosAleatorios(){
        numeroGenerado = (int)(Math.random()*100)+1;
    }

}
