package ud2_concurrent;

public class Example0 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");

        // Method1: Call a different Thread to be executed
        MyFirstThread thread1 = new MyFirstThread();
        thread1.start();

        // Method2: Call a different Thread using Runnable
        MyFirstRunnable runnable = new MyFirstRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        // Simulate an interruption
        /*Thread.sleep(3000);
        thread1.interrupt();
        thread2.interrupt();*/

        thread1.join();
        thread2.join();

        System.out.println("End");
    }
}
