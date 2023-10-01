package ud1_processes;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int num1 = sc.nextInt();
        System.out.print("Escribe otro numero: ");
        int num2 = sc.nextInt();

        System.out.println( System.getProperty("user.dir"));

        ProcessBuilder pb = new ProcessBuilder("java","-cp",".","C:\\Users\\sergi\\IdeaProjects\\PSP_2023-24\\out\\production\\PSP_2023-24\\ud1_processes\\Sumador", " "+num1, " "+num2);
        pb.inheritIO();
        Process p = pb.start();
    }
}
