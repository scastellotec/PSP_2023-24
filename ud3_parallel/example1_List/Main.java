package ud3_parallel.example1_List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList people = new ArrayList();
        people.add("Sara");
        people.add("Sergio");
        people.add("David");
        people.add("Mario");
        people.add("Eva");
        people.add("Antonio");
        people.add("Christian");

        // Imperative way to loop through the AraryLIST
        for(int i=0; i< people.size(); i++){
            System.out.println("Mode 1: " + people.get(i));
        }

        // Using a foreach
        for (Object person : people) {
            System.out.println("Mode 2: " + person);
        }

        // Using lambda expression
        people.forEach((a)-> System.out.println("Mode 3: " + a));

        System.out.println("Mode 4:");
        // Using lambdas and method reference
        people.forEach(System.out::println);
    }
}
