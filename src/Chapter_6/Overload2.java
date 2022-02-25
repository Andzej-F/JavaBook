package Chapter_6;

// Automatic type conversions can affect overloaded method resolution.
public class Overload2 {
    public void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }

    public void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    public void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}
