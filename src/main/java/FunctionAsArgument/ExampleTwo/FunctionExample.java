package FunctionAsArgument.ExampleTwo;

public class FunctionExample {
    public static void main(String[] args) {

        String result = Processor.process(new Processor() {
            @Override
            public String apply(String input) {
                return input.toLowerCase().replaceAll("\\s", "");
            }

            @Override
            public String process(String input) {
                return apply(apply(input));
            }

        }, "Christian Lehnert was here, Hiiii");

        System.out.println(result);
    }

    private interface Processor {
        String apply(String input);

        String process(String input);

        static String process(Processor p, String input) {
            return p.process(input);
        }
    }
}

