package ud3_parallel.example0;

public class Contador implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++)
            System.out.println("Numero: "+i);
    }
}
