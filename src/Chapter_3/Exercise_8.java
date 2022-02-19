package Chapter_3;

public class Exercise_8 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                continue;
            }
            System.out.println();
        }
//        System.out.println(0 % 2);
//        System.out.println(1 % 2);
//        System.out.println(2 % 2);
//        System.out.println(3 % 17);
//        System.out.println(16 % 17);
    }
}
