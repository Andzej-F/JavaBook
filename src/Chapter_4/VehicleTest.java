package Chapter_4;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle minivan;
        minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int dist = 252;

        System.out.println("Minivan can carry " + minivan.passengers +
                " with range of " + minivan.range() + " miles");
        System.out.println("To go " + dist + " miles minivan needs "
                + minivan.fuelneeder(252) + " gallons of fuel.");

        System.out.println();

        System.out.println("Sportscar can carry " + sportscar.passengers +
                " with range of " + sportscar.range() + " miles");
        System.out.println("To go " + dist + " miles sportscar needs "
                + sportscar.fuelneeder(252) + " gallons of fuel.");
    }
}
