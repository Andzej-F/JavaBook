package Chapter_6;

public class Factorial {
//        int number, factorial;
//        number = 3;
//        if (number < 0) {
//            System.out.println("Error: a number cannot be a negative value");
//        } else if (number == 0) {
//            factorial = 1;
//        } else {
//            factorial = 1;
//            for (int i = 1; i <= number; i++) {
//                factorial *= i;
//            }
//            System.out.println(number + " factorial is: " + factorial);
//        }

    // This is a recursive function.
//    public int factR(int 3) {
    public int factR(int n) {
        int result;

        if (n == 1) {
            return 1;
        }

//      result = factR(2) * 3=(factR(1)*2) * 3
        result = factR(n - 1) * n;
        System.out.println("Line 29 " + result);
        return result;
    }

    // This is an iterative equivalent.
    public int factI(int n) {
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++) {
            result *= t;
        }

        return result;
    }
}
