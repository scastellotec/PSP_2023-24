package ud3_parallel.exerciseStream_1;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
public class Main {
    public static void main(String[] args) {
        List<String> names = asList("John", "Jack", "Jacob");

        // Exercise 2.1.1
        System.out.println("Exercise 2.1.1");
        names.stream()
                .map(n -> "Hello "+n)
                .forEach(x -> System.out.println(x)); // System.out::println

        // Exercise 2.1.2
        System.out.println("Exercise 2.1.2");
       List<String> captainNames = names.stream()
                .map(n -> "Captain "+n)
                .collect(Collectors.toList());

       captainNames.forEach(System.out::println);

        // Exercise 2.1.3
        System.out.println("Exercise 2.1.3");
        names.stream()
                .filter(n -> n.startsWith("Ja"))
                .forEach(n -> System.out.println(n)); // System.out::println

        List<Integer> numbers = asList(1, 2, 3, 4);
        // Exercise 2.1.4
        System.out.println("Exercise 2.1.4");
        numbers.stream()
                .filter(n -> n%2==0)
                .forEach(System.out::println);

        // Exercise 2.1.5
        System.out.println("Exercise 2.1.5");
        Integer suma = numbers.stream()
                .mapToInt(x -> x)
                .sum();

        OptionalDouble avg = numbers.stream()
                .mapToInt(x -> x)
                .average();

        OptionalInt min = numbers.stream()
                .mapToInt(x -> x)
                .min();

        OptionalInt max = numbers.stream()
                .mapToInt(x -> x)
                .max();

        System.out.println("Suma "+suma);
        System.out.println("AVG "+avg);
        System.out.println("Min "+min);
        System.out.println("Max "+max);


    }
}
