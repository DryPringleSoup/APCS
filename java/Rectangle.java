public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setDimensions(double size) {
        this.width = size;
        this.height = size;
    }

    public double getArea() { return width*height; }
    public double getPerimeter() { return 2*(width+height); }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
