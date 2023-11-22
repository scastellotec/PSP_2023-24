package ud2_concurrent.Exercise49_Carpenter;

public class Main {
    public static void main(String[] args) {
        Almacen a = new Almacen(0,0);
        new Thread(new generadorRuedas(a)).start();
        new Thread(new generadorRuedas(a)).start();

        new Thread(new generadorChasis(a)).start();
        new Thread(new consumidorCoche(a)).start();
        new Thread(new consumidorCoche(a)).start();


    }
}
