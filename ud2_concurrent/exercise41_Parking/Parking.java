package ud2_concurrent.exercise41_Parking;

public class Parking {

    private int free_spaces;
    public Parking(int i) {
        this.free_spaces = i;
    }

    public synchronized void enterParking(String name) throws InterruptedException {
        while(free_spaces<=0){
            System.out.println(name + " is waiting");
            wait();
            System.out.println(name + " retries to park");
        }
        free_spaces--;
        System.out.println(name + " has parked");
    }

    public synchronized void leaveParking(String name){
        System.out.println(name + " leaves the parking");
        free_spaces++;
        notifyAll();
    }
}
