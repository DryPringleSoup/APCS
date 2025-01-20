import java.util.InputMismatchException;
import java.util.Scanner;

public class PayTest{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the TA's info -");
        System.out.print("Name: "); String TAname = sc.nextLine();
        System.out.print("Rate: "); double TArate = askDouble();
        System.out.print("Hours: "); int TAhours = askInteger();
        TA t = new TA(TAname,TArate,TAhours);
        
        double TApay = t.getPay();
        System.out.println("Pay: " + TApay);
    }

    public static double askDouble() {
        try { return sc.nextDouble(); }
        catch (InputMismatchException e) {
            System.out.print("Invalid Input. Try again: ");
            sc.nextLine();
            return askDouble();
        }
    }
    
    public static int askInteger() {
        try { return sc.nextInt(); }
        catch (InputMismatchException e) {
            System.out.print("Invalid Input. Try again: ");
            sc.nextLine();
            return askInteger();
        }
    }
}