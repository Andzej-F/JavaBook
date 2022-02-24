package _5_ExNtu_Input;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int number1, number2, number3;
        int min, max, sum, product;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter a second integer: ");
        number2 = input.nextInt();
        System.out.print("Enter a third integer: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        min = max = number1;
        if (number2 < min) {
            min = number2;
        } else if (number3 < min) {
            min = number3;
        }

        if (number2 > max) {
            max = number2;
        } else if (number3 > max) {
            max = number3;
        }

        System.out.println("Sum " + sum);
        System.out.println("Product " + product);
        System.out.println("Maximum " + max);
        System.out.println("Minimum " + min);
    }
}
/* Write a program called SumProductMinMax3 that prompts user
for three integers. The program shall read the inputs as int;
compute the sum, product, minimum and maximum of the three
integers; and print the results. For examples,

Enter 1st integer: 8
Enter 2nd integer: 2
Enter 3rd integer: 9

The sum is: 19
The product is: 144
The min is: 2
The max is: 9*/