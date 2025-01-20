public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(3.0,4.0);

        System.out.println("Rectangle 1 (Default Constructor):");
        double r1w = rect1.getWidth();
        double r1h = rect1.getHeight();
        double r1a = rect1.getArea();
        double r1p = rect1.getPerimeter();
        System.out.println("Width: "+r1w+", Height: "+r1h+", Area: "+r1a+", Perimeter: "+r1p+"\n");

        System.out.println("Rectangle 2 (Parameterized Constructor):");
        double r2w = rect2.getWidth();
        double r2h = rect2.getHeight();
        double r2a = rect2.getArea();
        double r2p = rect2.getPerimeter();
        System.out.println("Width: "+r2w+", Height: "+r2h+", Area: "+r2a+", Perimeter: "+r2p+"\n");

        rect1.setDimensions(5.0, 6.0); 
        System.out.println("Rectangle 1 after setDimensions(5.0, 6.0):");
        r1w = rect1.getWidth();
        r1h = rect1.getHeight();
        r1a = rect1.getArea();
        r1p = rect1.getPerimeter();
        System.out.println("Width: "+r1w+", Height: "+r1h+", Area: "+r1a+", Perimeter: "+r1p+"\n");

        rect2.setDimensions(4.0); 
        System.out.println("Rectangle 2 after setDimensions(4.0):");
        r2w = rect2.getWidth();
        r2h = rect2.getHeight();
        r2a = rect2.getArea();
        r2p = rect2.getPerimeter();
        System.out.println("Width: "+r2w+", Height: "+r2h+", Area: "+r2a+", Perimeter: "+r2p+"\n");
    }
}
