package ud2_concurrent.exercise3;

public class Main {

    public static void main(String[] args) {
        SharedBuffer shared = new SharedBuffer();

        Thread producer = new Thread(new Producer(shared));
        Thread consumer = new Thread(new Consumer(shared));

        producer.start();
        consumer.start();
    }
}
