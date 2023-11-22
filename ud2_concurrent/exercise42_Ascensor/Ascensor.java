package ud2_concurrent.exercise42_Ascensor;

public class Ascensor {

    private int max_weight;
    private int actual_weight;

    public Ascensor(int max_weight) {
        this.max_weight = max_weight;
        actual_weight = 0;
    }

    public synchronized void subir(int personaWeight, String name) throws InterruptedException {
        while(max_weight < actual_weight + personaWeight){
            System.out.println(name + "("+personaWeight+") - " + actual_weight + "/" + max_weight  + "Too much weight");
            wait();
        }
        actual_weight += personaWeight;
        System.out.println(name + "("+personaWeight+") - " + actual_weight + "/" + max_weight  + " has enter the lifter");
    }

    public synchronized void bajar(int personaWeight, String name){
        actual_weight -= personaWeight;
        System.out.println(name + "("+personaWeight+") - " + actual_weight + "/" + max_weight  + " leaves the lifter");
        notifyAll();
    }
}
