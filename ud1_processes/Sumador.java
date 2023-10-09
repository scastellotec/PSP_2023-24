package ud1_processes;

public class Sumador {
    public static void main(String[] args) {
        if(args.length !=0) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int resultado = 0;
            for (int i = num1; i <= num2; i++) {
                resultado += i;
            }

            System.out.println(resultado);
        }
    }
}
