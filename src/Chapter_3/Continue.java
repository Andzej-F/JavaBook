package Chapter_3;

public class Continue {
    public static void main(String[] args) {
        int i;

        // print even numbers between on and 100
        for (i = 0; i < 100; i++) {
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
    }
}
