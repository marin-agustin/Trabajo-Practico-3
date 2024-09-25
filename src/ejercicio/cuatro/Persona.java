package ejercicio.cuatro;

public class Persona extends Thread{

    private ParqueTematico parqueTematico;

    public Persona(ParqueTematico parqueTematico) {
        this.parqueTematico = parqueTematico;
    }

    public int reservar() {
        int reservaFallida = -1;
        int numeroAleatorio = (int) (Math.random() * 100);
        if (this.parqueTematico.reservarArea(numeroAleatorio)) {
            return numeroAleatorio;
        } else {
            return reservaFallida;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                int reserva = this.reservar();
                if(reserva != -1) {
                    System.out.println("Se ha reservado con exito el asiento: " + reserva);
                } else {
                    System.out.println("Asiento " + reserva + " ya esta reservado");
                }
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }

}
