package pureFunctions.ExampleThree;

public class PureFunctionExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverse(str);
        System.out.println(reversedStr);
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
