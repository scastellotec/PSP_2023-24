package ud1_processes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el comando: ");
        String comando = sc.nextLine();

        ProcessBuilder pBuilder = new ProcessBuilder(comando);
        Process p = pBuilder.start();

        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
