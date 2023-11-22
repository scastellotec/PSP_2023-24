package ud2_concurrent.exerciseStarvation;

public class Monedero {

    private int cantidad;

    public Monedero(int cantidad) {
        this.cantidad = cantidad;
    }

    public int sacarDinero(int dineroAsacar) throws InterruptedException {
        if (cantidad >= dineroAsacar){ // Comprobamos que haya suficiente dinero
            cantidad -= dineroAsacar;
            //Thread.sleep(100);
            return dineroAsacar;
        } else {
            return 0;
        }
    }
}
