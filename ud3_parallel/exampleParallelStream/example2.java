package ud3_parallel.exampleParallelStream;

import java.util.ArrayList;
import java.util.List;
public class example2 {
    public static void main(String[] args) {
        // Get the current time start
        long currentTime=System.currentTimeMillis();

        List<Integer> data = new ArrayList<Integer>();

        for (int i = 0; i < 100000; i++) {
            data.add(i);
        }

        long sum = data.stream().parallel()
                .map(i ->(int)Math.sqrt(i))
                .map(number->performComputation(number))
                .reduce(0,Integer::sum);

        // Print out the total sum
        System.out.println(sum);
        // Get the current time end
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken:"+(endTime-currentTime)/(1000*60)+" minutes");
    }

    public static int performComputation(int number){
        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            int div=(number/i);
            sum+=div;

        }
        return sum;
    }
}
