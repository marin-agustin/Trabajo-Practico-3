package ejercicio.seis;

public class Sumador extends Thread{

    private int inicio;
    private int fin;
    private int[] arreglo;
    private Acumulador acumulador;

    public Sumador(int inicio, int fin, int[] arreglo, Acumulador acumulador){
        this.inicio = inicio;
        this.fin = fin;
        this.arreglo = arreglo;
        this.acumulador = acumulador;
    }

    @Override
    public void run() {
        int sumaParcial = 0;

        for (int i = inicio; i <= fin; i++) {
            sumaParcial += arreglo[i];
        }

        acumulador.acumular(sumaParcial);

    }

}
