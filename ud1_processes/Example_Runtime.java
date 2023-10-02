package ud1_processes;

public class Example_Runtime {
    public static void main(String[] args) {

        // Listado de los ejemplos
        // Example 1
        /*
        try {
            Process process = Runtime.getRuntime().exec("Notepad.exe notas.txt");

            System.out.println("I'm waiting for the process to finish");
            process.waitFor();
            System.out.println("The process has finished");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        */

        // Example 2
        /*
        try {
            Process process = Runtime.getRuntime().exec("ping www.google.com");

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int codigoRetorno = process.exitValue();
            System.out.println("Fin de la ejecución: " + codigoRetorno);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        */

        // Example 3
        String so = System.getProperty("os.name");
        String comando;
        // Determinar comando Windows o Linux
        if (so.equals("Linux")) {
            // Some code here
            comando = "ifconfig";
        } else {
            // Some other code here
            comando = "ipconfig";
        }
        System.out.println("The Os is: "+so + " and the command: "+comando);


    }
}
