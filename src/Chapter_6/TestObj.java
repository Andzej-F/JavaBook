package Chapter_6;

public class TestObj {
    public int a, b;

    public TestObj(int i, int j) {
        a = i;
        b = j;
    }

    public void change(TestObj object) {
        object.a = object.a + object.b;
        object.b = -object.b;
    }
}
