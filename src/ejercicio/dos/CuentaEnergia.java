package ejercicio.dos;

public class CuentaEnergia {

    private int energia = 10;

    public CuentaEnergia() {}

    public int getEnergia() {
        return this.energia;
    }

    public void drenarEnergia(int cantidad) {
        this.energia -= cantidad;
    }

    public void revitalizarEnergia(int cantidad) {
        this.energia += cantidad;
    }
}
