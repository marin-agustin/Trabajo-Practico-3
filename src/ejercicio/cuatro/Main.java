package ejercicio.cuatro;

public class Main {

    public static void main(String[] args) {
        ParqueTematico parque = new ParqueTematico();

        Persona p1 = new Persona(parque);
        Persona p2 = new Persona(parque);
        Persona p3 = new Persona(parque);
        Persona p4 = new Persona(parque);
        Persona p5 = new Persona(parque);
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }

}
