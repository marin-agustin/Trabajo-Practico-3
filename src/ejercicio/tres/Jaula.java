package ejercicio.tres;

import java.util.concurrent.Semaphore;

class Jaula {

    /*
     // Creación de los semáforos, uno para cada recurso compartido.
    private Semaphore plato = new Semaphore(1);
    private Semaphore rueda = new Semaphore(1);
    private Semaphore hamaca = new Semaphore(1);

    // Método para que el hámster coma del plato
    public void comer(String nombre) throws InterruptedException {
        plato.acquire();  // Solicita el acceso al plato
        System.out.println(nombre + " está comiendo.");
        Thread.sleep(1000);  // Simula el tiempo de comer
        System.out.println(nombre + " terminó de comer.");
        plato.release();  // Libera el plato
    }

    // Método para que el hámster corra en la rueda
    public void correr(String nombre) throws InterruptedException {
        rueda.acquire();  // Solicita el acceso a la rueda
        System.out.println(nombre + " está corriendo en la rueda.");
        Thread.sleep(1000);  // Simula el tiempo de correr
        System.out.println(nombre + " terminó de correr.");
        rueda.release();  // Libera la rueda
    }

    // Método para que el hámster descanse en la hamaca
    public void descansar(String nombre) throws InterruptedException {
        hamaca.acquire();  // Solicita el acceso a la hamaca
        System.out.println(nombre + " está descansando en la hamaca.");
        Thread.sleep(1000);  // Simula el tiempo de descansar
        System.out.println(nombre + " terminó de descansar.");
        hamaca.release();  // Libera la hamaca
    }
     */

    // Método sincronizado para comer
    public synchronized void comer(String nombreHamster) throws InterruptedException {
        System.out.println(nombreHamster + " está comiendo...");
        System.out.println(nombreHamster + " terminó de comer.");
    }

    // Método sincronizado para correr en la rueda
    public synchronized void correr(String nombreHamster) throws InterruptedException {
        System.out.println(nombreHamster + " está corriendo en la rueda...");
        System.out.println(nombreHamster + " terminó de correr.");
    }

    // Método sincronizado para descansar en la hamaca
    public synchronized void descansar(String nombreHamster) throws InterruptedException {
        System.out.println(nombreHamster + " está descansando en la hamaca...");
        System.out.println(nombreHamster + " terminó de descansar.");
    }

}