public class Circle {
    private final double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() { return radius; }

    public double getArea() { return radius*radius*Math.PI; }
}