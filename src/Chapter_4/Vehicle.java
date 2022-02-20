package Chapter_4;

public class Vehicle {
    public int passengers;
    public int fuelcap;
    public int mpg;

    public Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    public int range() {
        return fuelcap * mpg;
    }

    public double fuelneeder(int miles) {
        return (double) miles / mpg;
    }

}
