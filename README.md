# functional_programming_java

## FAQ

### Why should we use functional programming?

Functional programming in Java can lead to more concise 
and expressive code, as it emphasizes the use of 
functions and immutable data structures. 
Additionally, it can help reduce the 
likelihood of errors and improve the overall maintainability of code.

### Can we use oop and functional programming together? 

Yes, it is possible to use object-oriented programming (OOP) and functional programming (FP) together.

### How can functional programming help us?

functional programming encourages 
breaking down complex problems into smaller, 
more manageable functions that can be composed 
and combined to solve larger problems. 
This approach can help improve code modularity and make 
it easier to reason about and test individual components of a program.

### What is Immutability?

A variable does never change in functional programming 

Example

```java
final int x = 4; // this does never change 
```

### What are pure functions?

A pure function is a function that always returns the same output 
for a given input, without causing any side effects. 
It does not modify any external state or variables and does not 
rely on external state or variables. This makes pure functions 
easier to test, reason about, and parallelize.

Example 1
```java
public int add(int x, int y) {
   return x + y;
}
```
Example 2
```java
import java.util.Arrays;

public class PureFunctionExample {
   public static void main(String[] args) {
      int[] arr = {5, 3, 8, 2, 1};
      int[] sortedArr = sort(arr);
      System.out.println(Arrays.toString(sortedArr));
   }

   public static int[] sort(int[] arr) {
      int[] newArr = arr.clone();
      Arrays.sort(newArr);
      return newArr;
   }
}
```
Example 3

```java
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
```

### What are First-Class functions?

In programming, first-class functions refer to the ability of a 
programming language to treat functions as first-class citizens,
which means that functions can be treated like any other variable 
or data type. This means that functions can be assigned to variables, 
passed as arguments to other functions, and returned as values from 
functions.

Example 1

```java
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
```

### How can we define a function without a class?

We can define a function without a class by using lambdas

Example 1

```java
public class LambdaExample {
    public static void main(String[] args) {
        Function<Integer, Integer> someFunction = x -> x + 2;
        Integer result = someFunction.apply(2);
        System.out.println(result);
    }
}
```

Example 2

```java
public class LambdaExample {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        int sum = add.apply(5, 10);
        System.out.println("The sum is: " + sum);
    }
}
```

### How can we use a function with more than 2 arguments or with 0 arguments?

We can define such a functional interface with multiple type parameters, as there is no built-in type for it.

Example 1

```java
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}

public class FunctionExample {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add3 = (x, y, z) -> x + y + z;
        Integer result = add3.apply(1, 2, 3);

        System.out.println(result);
    }
}
```

Example 2

```java
@FunctionalInterface
public interface VoidFunction<R>{
    R apply();
}

public class FunctionExample {
    public static void main(String[] args) {
        VoidFunction<String> sayHello = () -> "Hello";
        String result = sayHello.apply();
        System.out.println(result);
    }
}
```

### How can we use functions as an arguments?

Example 1

```java
package FunctionAsArgument.ExampleOne;

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
```

Example 2

```java
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
```

### How to use a function as a return type

Example 1

```java
public class FunctionExample {
    public static void main(String[] args) {
        VoidFunction<VoidFunction<String>> greet = () -> () -> "Hello";

        System.out.println(greet.apply().apply());
    }
}
```

Example 2

```java
public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> xMultiply = times -> x -> x * times;

        Function<Integer, Integer> timesFour = xMultiply.apply(4);
        System.out.println(timesFour.apply(10));

        Function<Integer, Integer> timesThree = xMultiply.apply(3);
        System.out.println(timesThree.apply(10));
    }
}
```

### What are Higher-order Functions?

Higher-order functions are functions that either take other 
functions as parameters or return functions as their results. 
They enable more concise and abstract code that can be reused in 
multiple contexts.

```java
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
```