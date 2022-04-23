/**
 * Find the sums of the running odd numbers and even numbers from a given
 * lowerbound to an upperbound. Also compute their absolute difference.
 */
package BasicSyntax;

public class OddEvenSum {
    public static void main(String[] args) {
        // Declare variables
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;// Define the bounds
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff; // absolute difference between the two sums

        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
            number++;
        }

        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }

        System.out.println("Sum of odd numbers from " + LOWERBOUND + " to "
                + UPPERBOUND + " is: " + sumOdd);
        System.out.println("Sum of even numbers from " + LOWERBOUND + " to "
                + UPPERBOUND + " is: " + sumEven);
        System.out.println("The absolute difference between the two sums is: " + absDiff);
    }
}
