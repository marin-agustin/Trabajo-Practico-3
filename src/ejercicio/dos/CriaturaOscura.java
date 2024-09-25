package ejercicio.dos;

import ejercicio.uno.VerificarCuenta;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CriaturaOscura implements Runnable {

    private CuentaEnergia ce;
    private int energia = 3;

    public CriaturaOscura(CuentaEnergia ce) {
        this.ce = ce;
    }

    public void drenar() throws InterruptedException {
        if (ce.getEnergia() >= 3) {
            System.out.println(Thread.currentThread().getName() + " esta drenando " + this.energia + " de energia");
            Thread.sleep(1000);
            ce.drenarEnergia(this.energia);
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
                this.drenar();
                if(this.ce.getEnergia() < 0) {
                    System.out.println("La energia es negativa");
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(VerificarCuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }



}
