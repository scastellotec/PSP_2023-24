package ud2_concurrent.Exercise2;

public class Counter {

    private int number;

    public Counter() {
        this.number = 0;
    }

    public synchronized void incrementNumber(){
        number++;
    }

    public int getNumber(){
        return number;
    }
}
