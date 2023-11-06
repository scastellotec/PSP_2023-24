package ud2_concurrent.Exercise2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Counter c2 = new Counter();

        Thread t1 = new Thread(new Worker(c));
        Thread t2 = new Thread(new Worker(c));
        Thread t3 = new Thread(new Worker(c));
        Thread t4 = new Thread(new Worker(c));
        Thread t5 = new Thread(new Worker(c));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("Hemos contado: "+c.getNumber());

    }
}
