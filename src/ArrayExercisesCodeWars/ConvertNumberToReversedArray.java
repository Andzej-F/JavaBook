package ArrayExercisesCodeWars;

import java.util.Arrays;

public class ConvertNumberToReversedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(0)));
        System.out.println(Arrays.toString(digitize(1)));
        System.out.println(Arrays.toString(digitize(34)));
        System.out.println(Arrays.toString(digitize(348597)));
        System.out.println(Arrays.toString(digitize(11)));
        System.out.println(11 / 10);
    }

    public static int[] digitize(long n) {
        if (n < 10 && n > -10) {
            int number = (int) n;
            int array[] = {number};
            return array;
        }

        // get length for the array
        int count = 0;
        long number = n;
        while (number >= 1) {
            number /= 10;
            count++;
        }

        int i = 0;
        int array[] = new int[count];
        while (n >= 1) {
            array[i] = (int) (n % 10);
            n /= 10;
            i++;
        }

        return array;
    }
}
/*Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits
of this number within an array in reverse order.

Example:
348597 => [7,9,5,8,4,3]
0 => [0]
*/