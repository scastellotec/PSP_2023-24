package ud1_processes;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {

        // We ask the user to type the numbers
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        String num1 = sc.nextLine();
        System.out.print("Escribe otro numero: ");
        String num2 = sc.nextLine();*/
        String num1 = "4";
        String num2 = "50";

        ProcessBuilder pb = new ProcessBuilder("java","Sumador", num1, num2);
        pb.inheritIO();
        pb.start();
    }
}
