package OOP_Exercises;

public class Circle {
    private double radius;
    private String color;

    // Constructs a Circle instance with default value for radius and color
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // Constructs a Circle instance with the given radius and default color
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public Circle(double r, String color) {
        radius = r;
        this.color = color;
        System.out.println("color value on line 22 " + color);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getColor() {
        System.out.println("color value on line 34 " + color);
        return this.color;
    }
}
