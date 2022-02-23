package ArrayExercisesCodeWars;

public class OddOrEven {
    public static void main(String[] args) {
        int array1[] = {0};
        int array2[] = {0, 1, 4};
        int array3[] = {0, -1, -5};
        System.out.println(oddOrEven(array1));
        System.out.println(oddOrEven(array2));
        System.out.println(oddOrEven(array3));

    }

    public static String oddOrEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (sum % 2) == 0 ? "even" : "odd";
    }
}
/*Task:
Given a list of integers, determine whether the sum of its elements
is odd or even.

Give your answer as a string matching "odd" or "even".
If the input array is empty consider it as: [0] (array with a zero).

Examples:
Input: [0]
Output: "even"

Input: [0, 1, 4]
Output: "odd"

Input: [0, -1, -5]
Output: "even"*/