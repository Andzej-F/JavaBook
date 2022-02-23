package Chapter_5;

// Demonstrate the Queue class.
public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(10);
        Queue smallQ = new Queue(4);
        int i, number;

        System.out.println("Using bigQ to store the numbers 1-10 .");
        // put some numbers into bigQ
        for (i = 0; i < 12; i++) {
            bigQ.put(i + 1);
        }


        // retrieve and display elements from bigQ
        System.out.print("Contents of bigQ: ");
        for (i = 0; i < 10; i++) {

            number = bigQ.get();
            if (number != -1) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n\nbigQ.numbersArray[0] " + bigQ.numbersArray[0]);
        System.out.println("bigQ.numbersArray[1] " + bigQ.numbersArray[1]);
        System.out.println("bigQ.numbersArray[9] " + bigQ.numbersArray[9]);

//        System.out.println("\n\nUsing smallQ to generate errors.");
//        // Now, use smallQ to generate some errors
//        for (i = 0; i < 5; i++) {
//            System.out.print("Attempting to store " + (char) ('Z' - i));
//
//            smallQ.put((char) ('Z' - i));
//            System.out.println();
//        }
//        System.out.println();
//
//        // more errors on smallQ
//        System.out.print("Contents of smallQ: ");
//        for (i = 0; i < 5; i++) {
//            ch = smallQ.get();
//
//            if (ch != (char) 0) {
//                System.out.print(ch);
//            }
//        }
    }
}
/*. On your own, try modifying Queue so that it stores other types of
objects. For example, have it store ints or doubles.
*/