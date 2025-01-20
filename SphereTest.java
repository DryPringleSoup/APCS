import java.util.InputMismatchException;
import java.util.Scanner;

public class SphereTest{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- Test 1 ---");
        System.out.print("Enter your sphere's radius: ");
        double sphrRad = ask();
        
        Sphere sphr = new Sphere(sphrRad);
        double sphrArea = sphr.getArea();
        double sphrVol = sphr.getVolume();
        
        System.out.println("Surface Area: " + sphrArea);
        System.out.println("Volume: " + sphrVol);
        System.out.println();
        
        System.out.println("--- Test 2 ---");
        int sphrNum = 10;
        for (int i = 1; i <= sphrNum; i++) {
            sphrRad = 1 + (Math.random() * 99);
            sphr = new Sphere(sphrRad);
            sphrArea = sphr.getArea();
            sphrVol = sphr.getVolume();
            
            System.out.println("Sphere " + i + "~");
            System.out.println("radius: " + sphrRad);
            System.out.println("Surface Area: " + sphrArea);
            System.out.println("Volume: " + sphrVol);
            System.out.println();
        }
        
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