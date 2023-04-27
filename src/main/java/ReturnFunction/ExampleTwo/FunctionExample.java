package ReturnFunction.ExampleTwo;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> xMultiply = times -> x -> x * times;

        Function<Integer, Integer> timesFour = xMultiply.apply(4);
        System.out.println(timesFour.apply(10));

        Function<Integer, Integer> timesThree = xMultiply.apply(3);
        System.out.println(timesThree.apply(10));
    }
}
