package ud3_parallel.exerciseStream;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class exercise2_2 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("John", 50));
        people.add(new Person("May", 12));
        people.add(new Person("Tiff", 23));
        people.add(new Person("Azul", 15));
        people.add(new Person("Samantha", 67));

        //2.2.1 Convert names to uppercase and print them on the screen
        System.out.println("2.2.1");
        people.stream()
                .map(p -> p.getName())
                .map(p -> p.toUpperCase())
                .forEach(System.out::println);

        System.out.println("2.2.1 alternative way");
        people.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);








        //2.2.2 Obtain people's names with length less than 4
        System.out.println("2.2.2");
        people.stream()
                .map(Person::getName)
                .filter(x -> x.length()<4)
                .forEach(System.out::println);

        //2.2.3 Obtain the age of the oldest person
        System.out.println("2.2.3");
        int maxAge = people.stream()
                .map(Person::getAge)
                .mapToInt(x -> x)
                .max()
                .orElse(0);

        System.out.println(maxAge);

        System.out.println("2.2.3 Alternative way");
        people.stream()
                .map(Person::getAge)
                .max(Integer::compareTo)
                .ifPresent(System.out::println);

        //2.2.4 Create a people summary (average age, min age, max age, amount of people)
        System.out.println("2.2.4");
        people
                .stream()
                .mapToInt(Person::getAge)
                .average()
                .ifPresent(avg -> System.out.printf("Average: %.2f\n", avg));

        people
                .stream()
                .mapToInt(Person::getAge)
                .min()
                .ifPresent(min -> System.out.printf("Min: %d\n", min));

        people
                .stream()
                .mapToInt(Person::getAge)
                .max()
                .ifPresent(max -> System.out.printf("Max: %d\n", max));

        int ageSum = people
                .stream()
                .mapToInt(Person::getAge)
                .sum();

        long count = people
                .stream()
                .mapToInt(Person::getAge)
                .count();

        var count2 = people
                .stream()
                .mapToInt(Person::getAge)
                .count();

        System.out.println("Sum: "+ ageSum);
        System.out.println("Count: "+ count);


    }
}
