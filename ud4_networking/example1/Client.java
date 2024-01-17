package ud4_networking.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // Creo la coenxión con el servidor
            Socket socket = new Socket("localhost", 6666); // Abro conexión

            // Con este buffer leo los datos que me envia el servidor
            BufferedReader bufferEntrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Con este buffer escribo y envío al servidor
            /* El parametro true indica el autoflush, es decir, que por cada println
            * que escriba se enviará al servidor sin necesidad de usar la funciín flush() */
            PrintWriter bufferSalida = new PrintWriter(socket.getOutputStream(), true);

            // Leo un dato del servidor y lo muestro por pantalla
            System.out.println(bufferEntrada.readLine());

            // Envío un dato al servidor
            bufferSalida.println("hola");

            socket.close(); // Cierro el conexión
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
