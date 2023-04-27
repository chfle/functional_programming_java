package lambda.ExampleTwo;

import java.util.function.*;

public class LambdaExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        int sum = add.apply(5, 10);
        System.out.println("The sum is: " + sum);
    }
}

