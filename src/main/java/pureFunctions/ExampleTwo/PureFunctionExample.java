package pureFunctions.ExampleTwo;

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
