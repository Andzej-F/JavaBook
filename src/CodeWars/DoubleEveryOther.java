package CodeWars;

import java.util.Arrays;

public class DoubleEveryOther {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};

        System.out.println((Arrays.toString(doubleEveryOther(a))));

    }

    public static int[] doubleEveryOther(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            if (i % 2 == 1) {
                a[i] *= 2;
            }
        }

        return a;
    }
}
/*Write a function that doubles every second integer in a list,
starting from the left.

Example:
For input array/list :

[1,2,3,4]
the function should return :

[1,4,3,8]*/