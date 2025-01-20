import java.util.InputMismatchException;
import java.util.Scanner;

public class CubeTest{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the side length of your cube:");
        double side = ask();
        Cube cube = new Cube(side);
        double cubeVol = cube.getVolume();
        double cubeSurfArea = cube.getSurfaceArea();
        System.out.println("Volume: " + cubeVol);
        System.out.println("Surface Area: " + cubeSurfArea);
    }

    public static double ask() {
        try { return sc.nextDouble(); }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input. Try again:");
            sc.nextLine();
            return ask();
        }
    }
}