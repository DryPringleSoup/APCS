import java.util.InputMismatchException;
import java.util.Scanner;

public class RPS {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("    1: Rock\n    2: Paper\n    3: Scissors");
        System.out.print("Enter your move (1-3): "); int uMove = askMove();        
        int cpuMove = (int) (Math.random()*3)+1;

        String computerMoveName = switch (cpuMove) { case 1 -> "Rock"; case 2 -> "Paper"; default -> "Scissors"; };
        System.out.println("Computer chose: " + computerMoveName);

        // Comes from the cyclic graph of RPS: 3 -> 2 -> 1 -> 3
        // If your opponent's move is two ahead of yours, you lose
        // If your opponent's move is one ahead of yours, you win
        int moveDiff = (uMove-cpuMove+3)%3;
        String result = switch (moveDiff) {
            case 1 -> "You WIN!!!!!!!!!!!!!!!!!!!!!!!!!";
            case 2 -> "YOU lose :((((((((((((((((((((((((";
            default -> "TIE \n`~ )\n`";
        };

        System.out.println(result);
    }

    public static int askMove() {
        try {
            int input = sc.nextInt();
            if (input<1 || input>3) throw new IllegalArgumentException();
            return input;
        } catch (InputMismatchException e) {
            System.out.print("Non-integer input. Try again: ");
            sc.nextLine();
            return askMove();
        } catch (IllegalArgumentException e) {
            System.out.print("Invalid move. Try again: ");
            sc.nextLine();
            return askMove();
        }
    }
}
