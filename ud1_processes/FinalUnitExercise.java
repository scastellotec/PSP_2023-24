package ud1_processes;

import java.io.IOException;

public class FinalUnitExercise {
    public static void main(String[] args) throws IOException {
        String command = "ipconfig"; //Or whatever you need to execute in a different process

        ProcessBuilder processBuilder = new ProcessBuilder(command); // You can add parameters if needed

        // You might need to add some code to show the output on the screen or saved it in a file, etc.

        processBuilder.start();


    }
}
