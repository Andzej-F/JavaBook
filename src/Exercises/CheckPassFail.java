package Exercises;
/* Write a program called CheckPassFail which prints
"PASS" if the int variable "mark" is more than or equal
 to 50; or prints "FAIL" otherwise. The program shall
 always print “DONE” before exiting.*/

public class CheckPassFail {
    public static void main(String[] args) {
        int[] marks = {0, 49, 50, 51, 100};
        for (int mark : marks) {
            System.out.println("The mark is " + mark);
            System.out.println(mark >= 50 ? "PASS" : "FAIL");
            System.out.println("DONE\n");
        }
    }
}
