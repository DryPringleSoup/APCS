import java.util.InputMismatchException;
import java.util.Scanner;

public class BookTest2{
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Enter the number of pages in your book: ");
        int pageNum = ask();
        Book bk = new Book(pageNum);
        
        String choice;
        int bkPages = bk.getNumPages();
        do {
            int bkPageCurrent = bk.getCurrentPage();
            System.out.println("You are on page " + bkPageCurrent + " of " + bkPages);
            System.out.print("Enter 'q' to quit or anything else to countinue - ");
            choice = sc.next();
            bk.nextPage();
        } while (!choice.equals("q"));
    }
    
    public static int ask() {
        try { return sc.nextInt(); }
        catch (InputMismatchException e) {
            System.out.print("Invalid Input. Try again: ");
            sc.nextLine();
            return ask();
        }
    }
}