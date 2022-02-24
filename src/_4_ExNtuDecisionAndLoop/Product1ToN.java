package _4_ExNtuDecisionAndLoop;

public class Product1ToN {
    public static void main(String[] args) {
        long product = 1;
        final int LOWERBOUND = 1;
        final int UPPERRBOUND[] = {11, 12, 13, 14};

        System.out.println("Using long:");
        for (int limit : UPPERRBOUND) {
            for (int i = LOWERBOUND; i <= limit; i++) {
                product *= i;
            }
            System.out.println("Factorial from " + LOWERBOUND + " to " + limit + " equals " + product);
        }
//        Using integers:
//        Factorial from 1 to 11 equals 39916800
//        Factorial from 1 to 12 equals 212598784
//        Factorial from 1 to 13 equals 268435456
//        Factorial from 1 to 14 equals 0

//        Using long:
//        Factorial from 1 to 11 equals 39916800
//        Factorial from 1 to 12 equals 19120211066880000
//        Factorial from 1 to 13 equals 6487519895826202624
//        Factorial from 1 to 14 equals 4192176702698291200
        System.out.println(2147483647 + 2147483647);
        //2147483647
    }
}
/*Write a program called Product1ToN to compute the product of integers
from 1 to 10 (i.e., 1×2×3×...×10), as an int. Take note that It is the
same as factorial of N.

Hints
Declare an int variable called product, initialize to 1, to accumulate
the product.

      // Define variables
      int product = 1;      // The accumulated product, init to 1
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 10;

Try
1.Compute the product from 1 to 11, 1 to 12, 1 to 13 and 1 to 14. Write
down the product obtained and decide if the results are correct.
HINTS: Factorial of 13 (=6227020800) is outside the range of
int [-2147483648, 2147483647]. Take note that computer programs may
not produce the correct result even though the code seems correct!

2.Repeat the above, but use long to store the product.  Compare the
products obtained with int for N=13 and N=14.
HINTS: With long, you can store factorial of up to 20.*/