package ExercisesNtuDecisionAndLoop;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        double average;
        final int LOWERBOUND = 111;
        final int UPPERBOUND = 8899;

        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
            sum += i;
            count++;
        }
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

        average = (double) sum / UPPERBOUND;

        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);
        System.out.println("There are " + count + " in the range");
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
*/