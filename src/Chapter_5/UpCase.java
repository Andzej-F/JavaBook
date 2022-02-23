package Chapter_5;

public class UpCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            // This statement turns off the 6th bit.
            ch = (char) ((int) ch & 65503);// ch is now uppercase
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println(32768 + 16384 + 8192 + 4096 + 2048 + 1024 + 512 + 256 + 128 + 64 + 0 + 16 + 8 + 4 + 2 + 1);
        System.out.println();

    }
}
