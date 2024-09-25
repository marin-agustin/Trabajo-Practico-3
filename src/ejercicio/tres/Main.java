package ejercicio.tres;

public class Main {

    public static void main(String[] args) {

        // Crear la jaula compartida
        Jaula jaula = new Jaula();

        // Crear varios hámsters
        Hamster hamster1 = new Hamster("Agustin", jaula);
        Hamster hamster2 = new Hamster("Franco",jaula);
        Hamster hamster3 = new Hamster("Marcos",jaula);

        // Iniciar los hilos
        hamster1.start();
        hamster2.start();
        hamster3.start();
    }

}
