package ud2_concurrent.exerciseStarvation;

public class Persona extends Thread{

    private int id;
    private Monedero monedero;
    private int miDinero;

    public Persona(Monedero monedero, int id) {
        this.monedero = monedero;
        this.id = id;
        this.miDinero = 0;
    }

    @Override
    public void run() {
        for(int i=0; i<4; i++){
            try {
                miDinero += monedero.sacarDinero(10);
            } catch (InterruptedException e) { }
        }
        System.out.println(id+" "+miDinero);
        //Al finalizar muestra el dinero que cada hilo ha podido sacar
    }
}


