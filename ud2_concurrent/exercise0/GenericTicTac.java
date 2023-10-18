package ud2_concurrent.exercise0;

public class GenericTicTac implements Runnable{
    String message;

    public GenericTicTac(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
