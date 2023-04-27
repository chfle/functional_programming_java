package FunctionAsArgument.ExampleOne;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(100);

        Function<Integer, Integer> square = n -> n * n;

        ArrayList<Integer> squaredNumbers = map(numbers, square);


        System.out.println(squaredNumbers);
    }

    public static ArrayList<Integer> map(ArrayList<Integer> numbers, Function<Integer, Integer> func) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            result.add(func.apply(number));
        }
        return result;
    }
}
