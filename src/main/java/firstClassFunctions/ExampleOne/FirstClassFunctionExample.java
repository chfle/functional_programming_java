package firstClassFunctions.ExampleOne;

import java.util.function.Function;

public class FirstClassFunctionExample {
    protected static class SimpleMath {
        public static Integer multiplyByThree(Integer x) {
            return x * 3;
        }
    }
    public static void main(String[] args) {
        Function<Integer, Integer> simpleAdd = SimpleMath::multiplyByThree;
        Integer x = 2;

        // In order to utilize the function, you must make use of the apply method.
        System.out.println(simpleAdd.apply(3));
    }
}
