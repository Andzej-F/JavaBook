package Chapter_3;

public class FindFac {
    public static void main(String[] args) {

        for (int i = 2; i < 20; i++) {

            // Factors of 4: 2
            // Factors of 6: 2 3
            // Factors of 8: 2 4
            System.out.println("Factors of " + i + ": ");

            // for (int 2; 2 < 6; 2++)
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                count++;
                if (i % j == 0) {
                    System.out.println(j + " ");
                }
            }
            System.out.println("Iterations count: " + count);
            System.out.println();
        }
    }
}
