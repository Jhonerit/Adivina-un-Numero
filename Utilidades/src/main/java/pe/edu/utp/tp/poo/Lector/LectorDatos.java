package pe.edu.utp.tp.poo.Lector;

import java.util.Scanner;

public class LectorDatos {

    public static String leerCadena(String mensaje) {
        Scanner lector = new Scanner(System.in);
        String entrada;

        do {
            System.out.println(mensaje);
            entrada = lector.nextLine();
        } while (entrada.isEmpty());

        return entrada;
    }

    public static int leerEntero(String mensaje, int minimo, int maximo) {

        Scanner lector = new Scanner(System.in);
        int entrada = -1;

        do {
            System.out.println(mensaje);
            try {
                entrada = lector.nextInt();

            } catch (Exception e) {
                System.out.println("Ingreso inválido.");
            }
        } while (entrada < minimo || entrada > maximo);
        return entrada;
    }
}
