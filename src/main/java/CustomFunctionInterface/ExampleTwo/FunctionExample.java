package CustomFunctionInterface.ExampleTwo;

public class FunctionExample {
    public static void main(String[] args) {
        VoidFunction<String> sayHello = () -> "Hello";
        String result = sayHello.apply();
        System.out.println(result);
    }
}
