package Chapter_3;

public class Exercise_10 {
    public static void main(String[] args)
            throws java.io.IOException {
        int count = 0;
        char input;//6

        System.out.println("Enter characters");
        do {
            input = (char) System.in.read();

            int letterToNbr = input;

            if (letterToNbr >= 'A' && letterToNbr <= 'Z') {
                input += 32;
                System.out.print(input);
                count++;
            } else if (letterToNbr >= 'a' && letterToNbr <= 'z') {
                input -= 32;
                System.out.print(input);
                count++;
            }
        } while (input != '.');

        System.out.println("\nChanges count is " + count);
        // A-Z  065-090     A 65    Z 90
        // a-z  097-122     a 97    z 122
    }
}
/*10. The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to
convert a lowercase letter to uppercase, subtract 32 from it. Use this information to
write a program that reads characters from the keyboard. Have it convert all lowercase
letters to uppercase, and all uppercase letters to lowercase, displaying the result. Make
no changes to any other character. Have the program stop when the user enters a
period. At the end, have the program display the number of case changes that have
taken place.
*/