package ud2_concurrent.Exercise49_Carpenter;

public class generadorChasis implements Runnable{

    private Almacen a;

    public generadorChasis(Almacen a) {
        this.a = a;
    }

    @Override
    public void run() {
        while(true){
            try {
                a.addChasis();
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
