package Chapter_3;

// Using break with a label.
public class Break4 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 5; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        // this is never reached
                        System.out.println("won't print");
                    }
                    System.out.println("After block three");
                }
                System.out.println("After block two");
            }
            System.out.println("After block one");
        }// for end

        System.out.println("After for.");

        int x = 0, y = 0;
        // put label before for statement
        stop1:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();
        // x and y: 0 0
        // x and y: 0 1

        for (x = 0; x < 5; x++) {
//            stop2:
            {
                for (y = 0; y < 5; y++) {
                    if (y == 2) break;// stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
        }
        // x and y: 0 0
        // x and y: 0 1

        // x and y: 1 0
        // x and y: 1 1

        // x and y: 2 0
        // x and y: 2 1

        // x and y: 3 0
        // x and y: 3 1

        // x and y: 4 0
        // x and y: 4 1
    }
}
