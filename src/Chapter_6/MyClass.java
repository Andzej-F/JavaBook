package Chapter_6;

// Demonstrate an overloaded constructor.
public class MyClass {
    int x;

    public MyClass() {
        System.out.println("Inside MyClass().");
        x = 0;
    }

    public MyClass(int i) {
        System.out.println("Inside MyClass(int).");
        x = i;
    }

    public MyClass(double d) {
        System.out.println("Inside MyClass(double).");
        x = (int) d;
    }

    public MyClass(int i, int j) {
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    }
}
