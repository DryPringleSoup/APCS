public class Sphere {
    private final double radius;
    
    public Sphere() {
        this.radius = 1;
    }
    
    public Sphere(double r) {
        this.radius = r;
    }
    
    public double getArea() { return 4*Math.PI*radius*radius; }
    
    public double getVolume() { return radius*getArea()/3; }
}