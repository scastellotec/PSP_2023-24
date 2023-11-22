package ud2_concurrent.Exercise49_Carpenter;

public class generadorRuedas  implements Runnable{

    private Almacen a;

    public generadorRuedas(Almacen a) {
        this.a = a;
    }

    @Override
    public void run() {
        while(true){
            try {
                a.addRueda();
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
