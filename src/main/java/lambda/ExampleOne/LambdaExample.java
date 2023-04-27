package lambda.ExampleOne;

import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {
        Function<Integer, Integer> someFunction = x -> x + 2;
        Integer result = someFunction.apply(2);
        System.out.println(result);
    }
}
