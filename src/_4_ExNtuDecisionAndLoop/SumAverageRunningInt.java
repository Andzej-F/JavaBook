package _4_ExNtuDecisionAndLoop;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;

//        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
//            sum += i;
//            count++;
//        }
//
//        average = (double) sum / UPPERBOUND;

//        int i = LOWERBOUND;
//        while (i <= UPPERBOUND) {
//            sum += i;
//            i++;
//        }

//        int i = LOWERBOUND;
//        do {
//            sum += i;
//            i++;
//        } while (i <= UPPERBOUND);

//        average = (double) sum / UPPERBOUND;
//
//        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
//        System.out.println("The average is " + average);
//        System.out.println("There are " + count + " in the range");


//        5. Modify the program to find the "sum of the squares" of all the
//        numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.
//        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
//            sum += i * i;
//        }
//        System.out.println("The sum of squares from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
//        // 1+4+9+16+25=5

//        6. Modify the program to produce two sums: sum of odd numbers and
//        sum of even numbers from 1 to 100. Also computer their absolute difference.

        int sumOdd, sumEven, absDiff;
        sumOdd = sumEven = absDiff = 0;

        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        absDiff = (sumOdd > sumEven) ? (sumOdd - sumEven) : (sumEven - sumOdd);

        // 1 2 3 4 5 6 7 8 9 10
        // sumOdd=1+3+5+7+9=25
        // sumEven=2+4+6+8+10=30
        System.out.println("The sum of odd numbers  from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd);
        System.out.println("The sum of even numbers  from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumEven);
        System.out.println("The absolute difference is " + absDiff);

    }
}
/*Write a program called SumAverageRunningInt to produce the
sum of 1, 2, 3, ..., to 100. Store 1 and 100 in variables lowerbound
and upperbound, so that we can change their values easily. Also
compute and display the average. The output shall look like:

The sum of 1 to 100 is 5050
The average is 50.5

1. Modify the program to use a "while-do" loop instead of "for" loop.

2. Modify the program to use a "do-while" loop.

4. Modify the program to sum from 111 to 8899, and compute the average.
Introduce an int variable called count to count the numbers in the
specified range (to be used in computing the average).

5. Modify the program to find the "sum of the squares" of all the
numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.

6. Modify the program to produce two sums: sum of odd numbers and
sum of even numbers from 1 to 100. Also computer their absolute difference.
*/