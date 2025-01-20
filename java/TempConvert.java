import java.util.InputMismatchException;
import java.util.Scanner;

public class TempConvert{
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter a temperature in Farenheit:");
        double tempF = ask();
        System.out.println("Celcius: " + f2c(tempF));
    }
    
    public static double f2c(double f) {
        // round(n*100)/100.0 rounds t2o decimal places
        return Math.round((f-32)*(5.0/9.0)*100)/100.0;
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