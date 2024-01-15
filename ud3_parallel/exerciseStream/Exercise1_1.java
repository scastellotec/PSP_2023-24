package ud3_parallel.exerciseStream;

public class Exercise1_1 {
    public static void main(String[] args) {
        MyFunctionalInterface addNumbers = (a,b)-> System.out.println(a+b);
        MyFunctionalInterface multiplieNumbers = (a,b)-> System.out.println(a*b);

        addNumbers.operate(3,4);
        multiplieNumbers.operate(3,4);

    }
}
