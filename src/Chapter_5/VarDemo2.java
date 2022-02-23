package Chapter_5;

public class VarDemo2 {
    public static void main(String[] args) {
        var mc = new MyClass(10);

        System.out.println("Value of i in mc is " + mc.getI());
        mc.setI(19);
        System.out.println("Value of i in mc is now " + mc.getI());
    }
}
