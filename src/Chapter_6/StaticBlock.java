package Chapter_6;

public class StaticBlock {
    public static double rootOf2;
    public static double rootOf3;

    static {
        System.out.println("Inside static block");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
        System.out.println("End of static block");
    }

    // constructor
    public StaticBlock(String msg) {
        System.out.println(msg);
    }
}
