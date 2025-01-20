import java.util.InputMismatchException;
import java.util.Scanner;

public class SwapNum{
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter a number less than 1000:");
        int n = ask();
        while (n>=1000) {
            System.out.println("Number must be less than 1000. Try again:");
            n = ask();
        }
        System.out.println("Swapped number: " + swap(n));
    }

    public static int swap(int n) {
        return n/100*100 + n%10*10 + n/10%10;
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