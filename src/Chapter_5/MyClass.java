package Chapter_5;

public class MyClass {
    private int i;
    private int k = 5;

    MyClass(int k) {
        this.i = k;
    }

    public int getI() {
        return this.i;
    }

    public void setI(int k) {
        if (k >= 0) {
            this.i = k;
        }
    }
}
