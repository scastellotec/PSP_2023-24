package ud2_concurrent.exercise41_Parking;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking(4);

        for(int i=1; i<10; i++) {
            new Thread(new Car(parking, String.valueOf(i))).start();
        }

    }
}
