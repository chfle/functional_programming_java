package higherOrderFunctions.exampleOne;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> applyTwice = x -> x * 2;

        Consumer<Function<Integer, Integer>> printResult = f -> {
            int result = f.apply(5);
            System.out.println(result);
        };

        printResult.accept(applyTwice); // Output: 10
    }
}
