package ud3_parallel.exerciseStream;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class exercise2_3 {
    public static void main(String[] args) {
            Country france = new Country("France", 65_235_184L);
            var canada = new Country("Canada", 37_653_095L);
            var uk = new Country("United Kingdom", 67_791_734L);

            var people = asList(
                    new Person("Peter", 30, "MALE", france),
                    new Person("John", 50, "MALE", canada),
                    new Person("May", 12, "FEMALE", france),
                    new Person("Tiff", 23, "NON_BINARY", uk),
                    new Person("Azul", 15, "FEMALE", france),
                    new Person("Samantha", 67, "FEMALE", canada));

            //2.3.1 Flat nestedPersonCollection into a single collection

            //2.3.2 Obtain the sum of all ages
            int ageTotal = people.stream()
                    .map(x -> x.getAge())
                    .mapToInt(x->x)
                    .sum();

            System.out.println("Total age: "+ageTotal);

            //2.3.3 Group people by nationality
            //2.3.4 Join people's names separated by underscore

            //2.3.5 Obtain canadian males
            people.stream()
                    .filter(x->x.getGender()=="MALE")
                    .filter(x->x.getCountry().getName().equalsIgnoreCase("canada"))
                    .forEach(x->System.out.println(x.getName()));

            List<Person> canadaMales = people.stream()
                .filter(x->x.getGender()=="MALE")
                .filter(x->x.getCountry().getName().equalsIgnoreCase("canada"))
                .collect(Collectors.toList());

            canadaMales.forEach(x->System.out.println(x.getName()));

    }
}
