public class Cube {
    private final double len;
    
    public Cube(double side) {
        this.len = side;
    }
    
    public double getVolume() { return Math.pow(len,3); }
    
    public double getSurfaceArea() { return 6*len*len; }
}