package Chapter_6;

public class Overload {
    public void ovlDemo() {
        System.out.println("No parameters");
    }

    public void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    public int ovlDemo(int a, int b) {
        System.out.println("Two integer parameters: " + a + " " + b);
        return a + b;
    }

    public double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}
