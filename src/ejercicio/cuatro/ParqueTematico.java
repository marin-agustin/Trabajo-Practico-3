package ejercicio.cuatro;

public class ParqueTematico {

    private boolean[] areas = new boolean[100];

    public synchronized boolean reservarArea(int lugar) {
        System.out.println(Thread.currentThread().getName() + " esta intentando reservar un area");
        if (!areas[lugar]) {
            areas[lugar] = true;
            return true;
        } else {
            return false;
        }
    }

}
