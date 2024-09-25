package ejercicio.dos;

import ejercicio.uno.VerificarCuenta;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sanador implements Runnable {

    private CuentaEnergia ce;
    private int energia = 3;

    public Sanador(CuentaEnergia ce) {
        this.ce = ce;
    }

    public void sanar() throws InterruptedException {
        if (ce.getEnergia() >= 3) {
            System.out.println(Thread.currentThread().getName() + " esta sanando " + this.energia + " de energia");
            Thread.sleep(1000);
            ce.revitalizarEnergia(this.energia);
            System.out.println(Thread.currentThread().getName() + " dreno la energia");
            System.out.println(Thread.currentThread().getName() + " la energia restante es de: " + ce.getEnergia());
        } else {
            System.out.println("No hay suficiente energia para drenar");
            System.out.println("Su energia actual es de: " + ce.getEnergia());
            Thread.sleep(1000);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                this.sanar();
                if(this.ce.getEnergia() < 0) {
                    System.out.println("La energia es negativa");
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(VerificarCuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


}
