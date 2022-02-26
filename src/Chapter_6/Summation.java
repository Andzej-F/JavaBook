package Chapter_6;

// Initialise one object with another.
public class Summation {
    public int sum;

    // Construct from an int.
    public Summation(int num) {
        sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
    }

    // Construct from another object.
    public Summation(Summation ob) {
        sum = ob.sum;
    }

}
