package ud1_processes;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
    /**
     * Modifica el programa de la IP y que guarde el resultado en un txt
     */
    public static void main(String[] args) {

        // Determinar si usar comando Windows o Linux
        String so = System.getProperty("os.name");
        String comando;
        if (so.equals("Linux")) {
            comando = "ifconfig";
        } else {
            comando = "ipconfig";
        }

        try {
            ProcessBuilder pb = new ProcessBuilder();
            pb.command(comando);
            // Redirect output to this file.
            pb.redirectOutput(new File("test.txt"));
            pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
