package _6_ExNtduNestedLoops;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        int size, row, col;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = input.nextInt();
        input.close();

//        for (row = 0; row < size; row++) {
//            for (col = 0; col < size; col++) {
//                System.out.print("# ");
//            }
//            System.out.println();
//        }


//        row = 0;
//        while (row < size) {
//            col = 0;
//            while (col < size) {
//                System.out.print("#  ");
//                col++;
//            }
//            System.out.println("");
//            row++;
//        }

//        row = 0;
//        do {
//            col = 0;
//            do {
//                System.out.print("#  ");
//                col++;
//            } while (col < size);
//            System.out.println();
//            row++;
//        } while (row < size);
    }
}
/*6.1  SquarePattern (nested-loop)
Write a program called SquarePattern that prompts user for the size
(a non-negative integer in int); and prints the following square pattern
using two nested for-loops.

Enter the size: 5
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #

Rewrite the above program using nested while-do loops.
*/