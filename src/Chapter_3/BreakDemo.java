package Chapter_3;

public class BreakDemo {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch, ignore, answer;
        answer = 'K';

        for (; ; ) {
            System.out.println("Guess the letter");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) {
                System.out.println("***Right***");
                break;
            }
            System.out.println("Enter another key");
        }
//        int num, result;
//        num = 100;
//
//        for (int i = 0; i < num; i++) {
//            if (i * i > num) {
//                System.out.println(i * i + " exiting the loop");
//                break;
//            }
//            System.out.println(" i*i equals " + i * i);
//        }
//        System.out.println("Loop complete.");
    }
}
