package ReturnFunction.ExampleOne;

public class FunctionExample {
    public static void main(String[] args) {
        VoidFunction<VoidFunction<String>> greet = () -> () -> "Hello";

        System.out.println(greet.apply().apply());
    }
}
