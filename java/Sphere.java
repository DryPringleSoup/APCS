class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) { this.radius = radius; }
    double calculateVolume() { return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); }
    double calculateSurfaceArea() { return 4 * Math.PI * Math.pow(radius, 2); }
    public String toString() { return "Sphere (Radius: " + radius + ")"; }
}
