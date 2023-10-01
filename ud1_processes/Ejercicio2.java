package ud1_processes;

public class Ejercicio2 {
    /**
     * Utiliza el objeto Runtime para obtener información
     * del equipo donde se ejecuta el programa.
     * Muestra la información acerca del número de procesadores disponibles.
     */

    public static void main(String[] args) {
        System.out.println("Num procesadores disponibles: "+Runtime.getRuntime().availableProcessors());
    }
}
