import java.util.InputMismatchException;
import java.util.Scanner;

public class CylinderTest{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your cylinder's info -");
        System.out.print("radius: ");
        double cyldrRad = ask();
        System.out.print("height: ");
        double cyldrHeight = ask();
        Cylinder cyldr = new Cylinder(cyldrRad,cyldrHeight);
        double cyldrVol = cyldr.getVolume();
        System.out.println("Volume: " + cyldrVol);
    }

    public static double ask() {
        try { return sc.nextDouble(); }
        catch (InputMismatchException e) {
            System.out.print("Invalid Input. Try again: ");
            sc.nextLine();
            return ask();
        }
    }
}