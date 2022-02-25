package Chapter_6;

// Primitive types are passed by value.
public class Test {
    // This method causes no change to the arguments used in the call.
    public void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}
