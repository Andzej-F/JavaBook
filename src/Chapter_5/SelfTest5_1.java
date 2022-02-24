package Chapter_5;

public class SelfTest5_1 {
    public static void main(String[] args) {
        double exampleArray[] = {7, 8, 9, 10, -55, 42, 11, 0, 9, 7};
        double average = 0.0;
        double sum = 0;

        for (double x : exampleArray) {
            sum += x;
        }

        average = (double) sum / exampleArray.length;
        System.out.println("Average is " + average);
        System.out.println(7 + 8 + 9 + 10 + -55 + 42 + 11 + 0 + 9 + 7);

        String phrase = "I like Java";
        int phraseLength = phrase.length();
        char letter = phrase.charAt(2);
        System.out.println(phrase);
        System.out.println(letter);

        System.out.println("\n\n\n\n");
        /*13. Rewrite the MinMax class shown earlier in this chapter so that it uses a for-each
        style for loop.*/

        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;


        min = max = nums[0];
        for (int number : nums) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }

        System.out.println("Max value is " + max);
        System.out.println("Min value is " + min);


        System.out.println();
        System.out.println("I like java".length());
        System.out.println("I like java".charAt(4));
    }

}
/*Chapter 5 Self Test
1. Show two ways to declare a one-dimensional array of 12 doubles.
    double exampleArray[]=new double[12];
    double[] exampleArray=new double[12];

2. Show how to initialize a one-dimensional array of integers to the values 1 through 5.
    int numbers[]={1,2,3,4,5};

3. Write a program that uses an array to find the average of 10 double values. Use any
10 values you like.

4. Change the sort in Try This 5-1 so that it sorts an array of strings. Demonstrate that
it works.

5. What is the difference between the String methods indexOf( ) and lastIndexOf(
)?
"indexOf" method fins the position of the first occurrence of a substring.
"lastIndexOf" method fins the position of the last occurrence of a substring.

6. Since all strings are objects of type String, show how you can call the length( ) and
charAt( ) methods on this string literal: "I like Java".
    String phrase = "I like Java";
    int phraseLength = phrase.length();
    char letter=phrase.charAt(1);


9. Show how this sequence can be rewritten using the ? operator.
if(x<0){
y=10;
}else{
y=20;
}

x<0 ? y=10 : y=20;

11. Is it an error to overrun the end of an array? Is it an error to index an array with a
negative value?
11.1 error,  11.2 error


13. Rewrite the MinMax class shown earlier in this chapter so that it uses a for-each
style for loop.

14. Can the for loops that perform sorting in the Bubble class shown in Try This 5-1
be converted into for-each style loops? If not, why not?
No, because it is impossible to compare two adjacent elelemts and the length of an array is needed
to perform the sort.

15. Can a String control a switch statement?
Yes

16. What type name is reserved for use with local variable type inference?
"var"

17. Show how to use local variable type inference to declare a boolean variable called
done that has an initial value of false.
var done=false;

18. Can var be the name of a variable? Can var be the name of a class?
yes, no

19. Is the following declaration valid? If not, why not.
var[] avgTemps = new double[7];
No, the array symbol is not needed in the declaration, the var defines type based on
the assignment expression.

20. Is the following declaration valid? If not, why not?
var alpha = 10, beta = 20;
No, only one variable can ber assigned at at time using "var".

21. In the show( ) method of the ShowBits class developed in Try This 5-3, the local
variable mask is declared as shown here:

long mask = 1;

Change this declaration so that it uses local variable type inference. When doing so, be
sure that mask is of type long (as it is here), and not of type int.

var mask=1L;
*/
