package ud2_concurrent.exercise1;

public class main {
    public static void main(String[] args) throws InterruptedException {
        // Start he Thread for the operations loop
        Thread operationThread = new Thread(new maths());
        operationThread.start();
        // Wait for 10 second before trying to stop the operations thread
        Thread.sleep(10000);
        // Suggesting to operations thread to stop
        operationThread.interrupt();
        // Making sure the operations thread has finished before printing the Game Over
        operationThread.join();
        System.out.println("Game over");
    }
}
