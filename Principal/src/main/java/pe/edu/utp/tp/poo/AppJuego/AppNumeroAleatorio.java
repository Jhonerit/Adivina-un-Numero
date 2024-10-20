package pe.edu.utp.tp.poo.AppJuego;

import pe.edu.utp.tp.poo.Lector.LectorDatos;
import pe.edu.utp.tp.poo.OperacionJuego.Generador;
import pe.edu.utp.tp.poo.OperacionJuego.ComprobarGanador;

public class AppNumeroAleatorio {

    public static void main(String[] args) {

        Generador generar = new Generador();
        ComprobarGanador validar = new ComprobarGanador();

        String nombre;
        int numero, numeroAleatorio;
        boolean ganador;

        nombre = LectorDatos.leerCadena("Ingresa tu nombre");
        System.out.println("Bienvenido al juego ADIVINA EL NUMERO");
        System.out.println("=========================================");
        generar.GenerarNumerosAleatorios();
        numeroAleatorio = generar.getNumeroGenerado();
        System.out.println(numeroAleatorio);
        System.out.println("Numero aleatorio generado.. adivina cual es");
        do {
            ganador = false;
            numero = LectorDatos.leerEntero("Ingresa tu numero",1,100);
            ganador = validar.ValidarGanador(numeroAleatorio,numero);
        } while (!ganador);

        System.out.println(nombre + " Ganaste..!");


    }
}
