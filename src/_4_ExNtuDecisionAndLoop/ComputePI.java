package _4_ExNtuDecisionAndLoop;

public class ComputePI {
    public static void main(String[] args) {
//        final int MAX_DENOMINAOR = 1000_000;
//        double pi = 0.0;
//        int count = 0;
//
//        for (int denominator = 1; denominator <= MAX_DENOMINAOR; denominator++) {
//            if (count % 2 == 0) {
//                pi += (1.0 / (denominator + count));
//            } else {
//                pi -= (1.0 / (denominator + count));
//            }
//            count++;
//        }
//
//        pi *= 4;
//        System.out.println("Denaminator: 1000_000, result " + pi);
//        // Denaminator: 1000,     result 3.140592653839794
//        // Denaminator: 1000,     result 3.1414926535900345
//        // Denaminator: 100_000,  result 3.1415826535897198
//        // Denaminator: 1000_000, result 3.1415916535897743

        double sum = 0.0;
        int MAX_DENOMINATOR = 10000;
        for (int denominator = 0; denominator < MAX_DENOMINATOR; denominator++) {
            // denominator = 1, 3, 5, 7, ..., MAX_DENOMINATOR
            if (denominator % 4 == 1) {
                sum += (1.0 / denominator);
                System.out.println("Line 31 sum value " + sum);
            } else if (denominator % 4 == 3) {
                sum -= (1.0 / denominator);
                System.out.println("Line 34 sum value " + sum);
            }
        }

        System.out.println(sum * 4);
    }
}
/* Write a program called ComputePI to compute the value of π,
using the following series expansion. Use the maximum denominator
(MAX_DENOMINATOR) as the terminating condition. Try MAX_DENOMINATOR
of 1000, 10000, 100000, 1000000 and compare the PI obtained. Is
this series suitable for computing PI? Why?
          1    2     3     4     5     6
pi = 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15 + ...);
          0    1     2     3     4      5      6      7
*/