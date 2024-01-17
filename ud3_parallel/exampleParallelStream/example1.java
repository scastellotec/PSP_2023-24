package ud3_parallel.exampleParallelStream;
import java.util.Arrays;
import java.util.stream.IntStream;
public class example1 {
    public static void main(String[] args) {
        System.out.println("Using Sequential Stream");
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        IntStream intArrStream = Arrays.stream(array);
        intArrStream.forEach(s->{
            System.out.println(s+" "+Thread.currentThread().getName());
        });

        System.out.println("Using Parallel Stream");
        IntStream intParallelStream=Arrays.stream(array).parallel();
        intParallelStream.forEach(s->{
            System.out.println(s+" "+Thread.currentThread().getName());
        });
    }
}
