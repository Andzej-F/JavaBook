package Chapter_5;

public class ShowBits {
    public static void main(String[] args) {
        int t;
        byte val;

        val = 123;
//        for (t = 128; 128 > 0; t =128/2) {
        for (t = 128; t > 0; t = t / 2) {

//            if ((123 & 128) != 0) {
            if ((val & t) != 0) {
                System.out.println("1 ");
            } else {
                System.out.println("0 ");
            }
        }

        System.out.println("Result " + (64 + 32 + 16 + 8 + 2 + 1));
    }
}
