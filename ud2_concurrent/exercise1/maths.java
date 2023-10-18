package ud2_concurrent.exercise1;

import java.util.Random;
import java.util.Scanner;

public class maths implements Runnable{
    @Override
    public void run() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int score = 0;

        while(!Thread.interrupted()){
            int num1 = rand.nextInt(50);
            int num2 = rand.nextInt(50);
            int realSolution = num1 + num2;
            System.out.print(num1 + " + " + num2 + " = ");
            int userSolution = sc.nextInt();

            if(userSolution == realSolution){
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("Your score is: " + score);
    }
}
