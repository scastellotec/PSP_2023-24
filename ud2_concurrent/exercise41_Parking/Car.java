package ud2_concurrent.exercise41_Parking;

public class Car implements Runnable{

    private Parking parking;
    private String name;

    public Car(Parking parking, String name) {
        this.parking = parking;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is trying to park ");
            parking.enterParking(name);
            Thread.sleep(3000);
            parking.leaveParking(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
