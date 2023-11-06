package ud2_concurrent.exercise3;

public class Consumer implements Runnable{
    private SharedBuffer s;

    public Consumer(SharedBuffer s) {
        this.s = s;
    }

    @Override
    public void run() {
        for(int i=0; i<25; i++){
            try {
                System.out.println(s.read());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
