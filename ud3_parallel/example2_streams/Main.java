package ud3_parallel.example2_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        System.out.println("Example 1");
        memberNames.stream()
                .filter((x)->x.startsWith("A"))
                .map((a)->a.toUpperCase())
                .sorted()
                .forEach((x)-> System.out.println(x));

        System.out.println("Example 2");
        List namesUpperCase = memberNames.stream()
                .map((a)->a.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        namesUpperCase.forEach(System.out::println);

        System.out.println("Example 3");
        Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
    }
}
