package ud2_concurrent.Exercise49_Carpenter;

public class consumidorCoche implements Runnable{

    private Almacen a;

    public consumidorCoche(Almacen a) {
        this.a = a;
    }

    @Override
    public void run() {
        while(true){
            try {
                a.creaCoche();
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
