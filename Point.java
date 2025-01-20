public class Point {
    private double XCoord;
    private double YCoord;
    
    public Point(double x, double y) {
        this.XCoord = x;
        this.YCoord = y;
    }
    
    public double getRotate() {
        return Math.toDegrees(Math.atan2(YCoord, XCoord));
    }
}