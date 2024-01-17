package ud4_networking.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            // Abro mi puerto 666 y este proceso recogerá las peticiones que lleguen.
            ServerSocket servidorSocket = new ServerSocket(6666);

            while(true){
                System.out.println("Servidor inicializado. Esperando clientes");

                /* Cuando cliente se conecte me comunicaré con el a través del socket que devuelve el método accept() */
                Socket socket = servidorSocket.accept();

                // Abro los stream de comunicación
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                System.out.println("Se ha conectado un cliente");
                salida.println("Bienvenido a mi servidor");
                System.out.println(entrada.readLine());

                // Hago las tareas correspondientes a mi servidor.
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
