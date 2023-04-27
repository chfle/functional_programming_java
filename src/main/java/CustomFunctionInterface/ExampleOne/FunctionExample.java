package CustomFunctionInterface.ExampleOne;

public class FunctionExample {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add3 = (x, y, z) -> x + y + z;
        Integer result = add3.apply(1, 2, 3);

        System.out.println(result);
    }
}
