package ejercicio.siete;

import java.util.concurrent.Semaphore;

public class ImpresionABC {

    private static final Semaphore semA = new Semaphore(1);
    private static final Semaphore semB = new Semaphore(0);
    private static final Semaphore semC = new Semaphore(0);

    static class HiloA extends Thread {
        private int veces;

        public HiloA(int veces) {
            this.veces = veces;
        }

        @Override
        public void run() {
            try {
                semA.acquire();
                for (int i = 0; i < veces; i++) {
                    System.out.print("A");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                semB.release();
            }
        }
    }

    static class HiloB extends Thread {
        private int veces;

        public HiloB(int veces) {
            this.veces = veces;
        }

        public void run() {
            try {
                semB.acquire();
                for (int i = 0; i < veces; i++) {
                    System.out.print("B");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                semC.release();
            }
        }
    }

    static class HiloC extends Thread {
        private int veces;

        public HiloC(int veces) {
            this.veces = veces;
        }

        public void run() {
            try {
                semC.acquire();
                for (int i = 0; i < veces; i++) {
                    System.out.print("C");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                semA.release();
            }
        }
    }

    public static void main(String[] args) {
        int vecesA = 4;
        int vecesB = 2;
        int vecesC = 5;

        Thread hiloA = new HiloA(vecesA);
        Thread hiloB = new HiloB(vecesB);
        Thread hiloC = new HiloC(vecesC);

        hiloA.start();
        hiloB.start();
        hiloC.start();
    }

}
