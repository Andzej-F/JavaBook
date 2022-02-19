package Chapter_3;

public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;
        //int i, j;

//        for (num = 1.0; num < 10.0; num++) {
//            sroot = Math.sqrt(num);
//            System.out.println("Square root of " + num + " is " + sroot);
//
//            // compute rounding error
//            rerr = num - (sroot * sroot);
//            System.out.println("sroot*sroot is " + (sroot * sroot));
//            System.out.println("Rounding error is " + rerr);
//            System.out.println();
//        }
//
//        for (i = 100; i > -100; i -= 5) {
//            System.out.println(i);
//        }

//        for (i = 0, j = 10; i < j; i++, j--) {
//            System.out.println("i and j: " + i + " " + j);
//        }

//        i = 0;
//        for (; i < 10; ) {
//            System.out.println("Pass #" + i);
//            i++;
//        }

        // Loops with no body
//        int sum = 0;
//        for (i = 1; i <= 5; sum += i++) ;
//        System.out.println("Sum is " + sum);

        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= 5; i++) {
            sum += i;
            fact *= i;
        }

        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
//        System.out.println("i is " + i);
    }
}
