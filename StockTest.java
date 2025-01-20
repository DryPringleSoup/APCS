import java.util.InputMismatchException;
import java.util.Scanner;

public class StockTest {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter stock's info -");
        System.out.print("Symbol: "); String stkSym = sc.nextLine();
        System.out.print("Name: "); String stkName = sc.nextLine();
        System.out.print("Pervious closing price: "); double stkPCP = askDouble();
        System.out.print("Current price: "); double stkCP = askDouble();
        Stock stk = new Stock(stkSym, stkName, stkPCP, stkCP);
        
        double stkPrcnt = stk.getChangePercent();
        System.out.println(stkSym+" "+stkName+ " change percentage: "+stkPrcnt+"%");
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
