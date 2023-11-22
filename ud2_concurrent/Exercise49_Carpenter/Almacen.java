package ud2_concurrent.Exercise49_Carpenter;

public class Almacen {

    private int numero_ruedas;
    private int numero_max_ruedas;

    private int numero_chasis;
    private int numero_max_chasis;

    public Almacen(int numero_ruedas, int numero_chasis) {
        this.numero_ruedas = numero_ruedas;
        this.numero_max_ruedas = 6;
        this.numero_chasis = numero_chasis;
        this.numero_max_chasis = 3;
    }

    public synchronized void addRueda() throws InterruptedException {
        while(numero_ruedas>=numero_max_ruedas){
            wait();
        }
        numero_ruedas++;
        System.out.println("Add rueda "+numero_ruedas);
        notifyAll();
    }

    public synchronized void addChasis() throws InterruptedException {
       while(numero_chasis>=numero_max_chasis){
            wait();
        }
        numero_chasis++;
        System.out.println("Add chasis "+numero_chasis);
        notifyAll();
    }

    public synchronized void creaCoche() throws InterruptedException {
        while(numero_chasis<1 || numero_ruedas < 4){
            wait();
        }
        numero_chasis -= 1;
        numero_ruedas -= 4;
        System.out.println("Creo coche "+numero_ruedas + " - " +numero_chasis);
        notifyAll();
    }
}
