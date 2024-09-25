package ejercicio.seis;

public class Acumulador {

    private int acumulador = 0;

    public Acumulador() {}

    public synchronized void acumular(int sumaParcial) {
        System.out.println(Thread.currentThread().getName() + " entrego su suma: " + sumaParcial);
        acumulador += sumaParcial;
        System.out.println("El estado actual del acumulador es: " + acumulador);
    }

    public int getAcumulado() {
        return this.acumulador;
    }

}
