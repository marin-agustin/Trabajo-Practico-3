package ejercicio.uno;

public class CuentaBanco {

    private int balance = 50;

    public CuentaBanco() {

    }

    public int getBalance() {
        return this.balance;
    }

    public void retiroBancario(int retiro){
        balance -= retiro;
    }

}
