package ejercicio.seis;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arreglo = new int[50000];
        llenarArreglo(arreglo);

        Acumulador acumulador = new Acumulador();

        Sumador s0 = new Sumador(0, 4999, arreglo, acumulador);
        Sumador s1 = new Sumador(5000, 9999, arreglo, acumulador);
        Sumador s2 = new Sumador(10000, 14999, arreglo, acumulador);
        Sumador s3 = new Sumador(15000, 19999, arreglo, acumulador);
        Sumador s4 = new Sumador(20000, 24999, arreglo, acumulador);
        Sumador s5 = new Sumador(25000, 29999, arreglo, acumulador);
        Sumador s6 = new Sumador(30000, 34999, arreglo, acumulador);
        Sumador s7 = new Sumador(35000, 39999, arreglo, acumulador);
        Sumador s8 = new Sumador(40000, 44999, arreglo, acumulador);
        Sumador s9 = new Sumador(45000, 49999, arreglo, acumulador);

        s0.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();
        s7.start();
        s8.start();
        s9.start();

        try {
            s0.join();
            s1.join();
            s2.join();
            s3.join();
            s4.join();
            s5.join();
            s6.join();
            s7.join();
            s8.join();
            s9.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("La suma total del arreglo es: " + acumulador.getAcumulado());

    }

    private static void llenarArreglo(int[] arreglo) {
        Random random = new Random();

        for(int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(10) + 1;
        }

    }

}
