package Chapter_6;

public class OverloadTest {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // call all versions ov ovlDemo
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4, 6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
    }
}
/*  No parameters

    One parameter: 2

    Two integer parameters: 4 6
    Result of ob.ovlDemo(4, 6): 10

    Two double parameters: 1.1 2.32
    Result of ob.ovlDemo(1.1, 2.32): 3.42
*/