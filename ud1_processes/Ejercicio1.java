package ud1_processes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    /**
        Realiza un programa en Java que muestre la dirección IP
        a través de la consola del sistema operativo (Windows o Linux)
        muestre su resultado por pantalla.
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
            Process process = Runtime.getRuntime().exec(comando);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
