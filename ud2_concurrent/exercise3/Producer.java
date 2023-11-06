package ud2_concurrent.exercise3;

public class Producer implements Runnable{

    private SharedBuffer s;
    private String message = "Hello, how are you doing?";

    public Producer(SharedBuffer s) {
        this.s = s;
    }

    @Override
    public void run() {
        for(int i=0; i<message.length(); i++){
            try {
                s.write(String.valueOf(message.charAt(i)));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
