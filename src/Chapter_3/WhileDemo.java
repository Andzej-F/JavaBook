package Chapter_3;

public class WhileDemo {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        do {
            System.out.println("Press a key followed by ENTER");
            ch = (char) System.in.read();
        } while (ch != 'q');
//        char ch;
//        ch = 'a';
//
//        while (ch <= 'z') {
//            System.out.println(ch);
//            ch++;
//        }

        // Compute integer powers of 2.
//        int e, result;
//
//        for (int i = 0; i < 10; i++) {
//            result = 1;
//
//            e = i;
//
//            while (e > 0) {
//                result *= 2;
//                e--;
//            }
//
//            System.out.println("2 to the " + i +
//                    " power is " + result);
//        }
    }
}
