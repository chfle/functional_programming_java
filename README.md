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