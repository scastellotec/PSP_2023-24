package ud3_parallel.example0;

public class Main {
    public static void main(String[] args) {

      /*  // LONGEST WAY TO CODE THIS
        Contador contador = new Contador();
        Thread t1 = new Thread(contador);
        t1.start();

        // LESS LONG
        Thread t2 = new Thread(new Contador());
        t2.start();

        // EVEN SHORTER, But far from lambdas
        // This is called anonymous class
        new Thread(new Contador()).start();
*/
        // In order to skip writing contador.java we need lambdas
        new Thread(()->{
            for(int i=0; i<10; i++)
                System.out.println("Numero: "+i);
        }).start();
    }
}
