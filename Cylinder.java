public class Cylinder {
    private final Circle base;
    private final double height;
    
    public Cylinder(double r, double h) {
        this.base = new Circle(r);
        this.height = h;
    }
    
    public double getVolume() {
        return base.getArea()*height;
    }
}