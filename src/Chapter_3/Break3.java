package Chapter_3;

public class Break3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("\nOuter loop count: " + i);
            System.out.println("    Inner loop count: ");

            int t = 0;
            while (t < 100) {
                if (t == 10) {
                    break;
                }
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
}
// Outer loop count: 0
//     Inner loop count:
// 1 2 3 4 5 6 7 8 9
// Loops complete.

// Outer loop count: 1
//     Inner loop count:
// 1 2 3 4 5 6 7 8 9
// Loops complete.