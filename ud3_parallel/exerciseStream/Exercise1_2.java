package ud3_parallel.exerciseStream;

import java.util.function.Predicate;

public class Exercise1_2 {
    public static void main(String[] args) {
        Predicate<Integer> oddOrEven = number -> (number % 2 == 0);
        System.out.println(oddOrEven.test(3));
        System.out.println(oddOrEven.test(4));
    }
}
