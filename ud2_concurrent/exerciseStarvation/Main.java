package ud2_concurrent.exerciseStarvation;

public class Main {
    public static void main(String[] args) {
        Monedero m = new Monedero(100); // Saldo inicial 100€
        for (int i=0; i<10; i++){ //Creamos e iniciamos a 10 personas
            new Persona(m, i).start();
        }
    }
}
