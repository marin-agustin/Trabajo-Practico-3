package ejercicio.dos;

public class Main {

    public static void main(String[] args) {

        CuentaEnergia ce = new CuentaEnergia();

        CriaturaOscura co = new CriaturaOscura(ce);
        Sanador s = new Sanador(ce);

        Thread CriaturaOscura = new Thread(co, "Criatura Oscura");
        Thread Sanador = new Thread(s, "Sanador");

        CriaturaOscura.start();
        Sanador.start();

    }
}
