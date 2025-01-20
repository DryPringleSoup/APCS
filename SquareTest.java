import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareTest{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the side length on your square:");
        int sideLen = ask();
        Square sqr = new Square(sideLen);
        int sqrArea = sqr.getArea();
        System.out.println("Area: " + sqrArea);
    }

    public static int ask() {
        try { return sc.nextInt(); }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input. Try again:");
            sc.nextLine();
            return ask();
        }
    }
}