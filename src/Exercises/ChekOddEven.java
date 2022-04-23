package Exercises;

/* Write a program called CheckOddEven which prints
"Odd Number" if the int variable “number” is odd, or
“Even Number” otherwise. The program shall always print
 “bye!” before exiting.

Try number = 0, 1, 88, 99, -1, -2 and verify your results.
 */
public class ChekOddEven {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 88, 99, -1, -2};

        for (int number :
                numbers) {
            System.out.print("The number " + number + " is ");
            System.out.println(number % 2 == 0 ? "Even Number" : "Odd Number");
        }
    }
}
