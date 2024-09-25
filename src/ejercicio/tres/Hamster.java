package ejercicio.tres;

public class Hamster extends Thread{

    private String nombre;
    private Jaula jaula;

    public Hamster(String nombre, Jaula jaula) {
        this.nombre = nombre;
        this.jaula = jaula;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 4; i++){
                jaula.comer(nombre);
                Thread.sleep(1000);
                jaula.correr(nombre);
                Thread.sleep(1000);
                jaula.descansar(nombre);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(nombre + " fue interrumpido.");
        }
    }

}
