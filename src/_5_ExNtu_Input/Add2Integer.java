package _5_ExNtu_Input;

import java.util.Scanner;

public class Add2Integer {
    public static void main(String[] args) {
        int number1, number2, sum;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter a second integer: ");
        number2 = input.nextInt();
        input.close();

        System.out.println("The sum is: " + (number1 + number2));
    }
}
/*Write a program called Add2Integers that prompts user to enter
two integers. The program shall read the two integers as int;
compute their sum; and print the result. For example,

Enter first integer: 8
Enter second integer: 9

The sum is: 17*/