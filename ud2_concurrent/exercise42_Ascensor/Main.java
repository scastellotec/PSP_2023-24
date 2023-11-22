package ud2_concurrent.exercise42_Ascensor;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Ascensor a = new Ascensor(300);
        Random r = new Random();

        for(int i=0; i<10; i++){
            new Thread(new Persona(String.valueOf(i), r.nextInt(50,100),a)).start();
        }
    }
}
