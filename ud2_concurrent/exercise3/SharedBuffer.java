package ud2_concurrent.exercise3;

public class SharedBuffer {

    private String character;
    private boolean isReadable = false;

    public synchronized void write(String a) throws InterruptedException {
        while (isReadable == true){
            wait();
        }
        character = a;
        isReadable = true;
        notifyAll();
    }

    public synchronized String read() throws InterruptedException {
        while (isReadable == false) {
            wait();
        }
        isReadable = false;
        notifyAll();
        return character;
    }
}
