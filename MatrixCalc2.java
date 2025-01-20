import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixCalc2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix M = null;
        System.out.println("Select an operation:");
            System.out.println("1 ~ Add Matrices");
            System.out.println("2 ~ Subtract Matrices");
            System.out.println("3 ~ Multiply Matrices");
        
        // run calculator until the user doesn't want to continue at the end of a calculation
        for (boolean running = true; running; running = sc.nextLine().equalsIgnoreCase("y")) {
            // User input
            System.out.print("Enter your number here (1-3): "); String option = sc.nextLine();
            System.out.println("Matrices should be formated like this '1,2,3;4,5,6;7,8,9'");
            System.out.print("Enter your first matrix: "); Matrix A = askMatrix(); A.print();
            System.out.print("Enter your second matrix: "); Matrix B = askMatrix(); B.print();
            

            try { // verify if inputs are valids
                 M = switch(option) { // perform an operation between A and B unless it's outside the defined list of options
                    case "1" -> A.mAdd(B); case "2" -> A.mSub(B); case "3" -> A.mMult(B);
                    default -> throw new InputMismatchException();
                };

                System.out.println("Resultant Matrix: ");
                M.print();
            }
            catch (IllegalArgumentException e) { System.out.println("Incompatiable matricies"); } // when # of A cols != # of B rows 
            catch (InputMismatchException e) { System.out.println("Option not avaliable"); } // Outside option range
            System.out.println();

            System.out.print("Continue? (y/n): ");
        }
    }

    public static Matrix askMatrix() {
        try {
            String input = sc.nextLine();
            return Matrix.parse2Mat(input);
        } catch (NumberFormatException e) { // invalid entries
            System.out.print("Non-integer entries. Try again: ");
            return askMatrix();
        } catch (IllegalArgumentException e) { // rows aren't all the same length
            System.out.print("Non-uniform rows. Try again: ");
            return askMatrix();
        }
    }
}
