import java.util.InputMismatchException;
import java.util.Scanner;

public class PointTest {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your Coordinates -");
        System.out.print("x: "); double pX = askDouble();
        System.out.print("y: "); double pY = askDouble(); 
        
        Point p = new Point(pX, pY);
        double degrees = p.getRotate();
        
        System.out.println("Degrees from positive x-axis: " + degrees);
    }
    
    public static double askDouble() {
        try { return sc.nextDouble(); }
        catch (InputMismatchException e) {
            System.out.print("Invalid Input. Try again: ");
            sc.nextLine();
            return askDouble();
        }
    }
}
