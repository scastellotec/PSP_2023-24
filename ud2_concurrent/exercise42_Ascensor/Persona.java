package ud2_concurrent.exercise42_Ascensor;

public class Persona implements Runnable{

    private String name;
    private int weight;
    private Ascensor ascensor;

    public Persona(String name, int weight, Ascensor ascensor) {
        this.name = name;
        this.weight = weight;
        this.ascensor = ascensor;
    }

    @Override
    public void run() {
        try {
            ascensor.subir(weight, name);
            Thread.sleep(3000);
            ascensor.bajar(weight, name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
