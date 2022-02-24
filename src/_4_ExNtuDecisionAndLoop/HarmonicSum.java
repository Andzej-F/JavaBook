package _4_ExNtuDecisionAndLoop;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;


        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
            sumL2R += (double) 1 / denominator;
        }

        System.out.println("Harmonic sum from left to right " + sumL2R);

        for (int denominator = MAX_DENOMINATOR; denominator >= 1; denominator--) {
            sumR2L += (double) 1 / denominator;
        }

        System.out.println("Harmonic sum from right to left" + sumR2L);

        absDiff = (sumL2R > sumR2L) ? sumL2R - sumR2L : sumR2L - sumL2R;

        System.out.println("Absolute difference is " + absDiff);
    }
}
/*Write a program called HarmonicSum to compute the sum of a
harmonic series, as shown below, where n=50000. The program
shall compute the sum from left-to-right as well as from the
right-to-left. Are the two sums the same? Obtain the absolute
difference between these two sums and explain the difference.
Which sum is more accurate?

Harmonic(n)=1+1/2+1/3+...+1/n

*/