import java.util.InputMismatchException;
import java.util.Scanner;

public class FibRab {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of months Fibonacci waits for his rabbits to reproduce (max 92): ");
        System.out.println("# of Fibonacci's rabbits: " + fib(askValidLong(1, 92)));
    }

    public static long fib(long n) {
        if (n <= 2) return 1;
        long a = 1, b = 1;
        for (long i = 3; i <= n; i++) {
            b += a;
            a = b-a;
        }
        return b;
    }

    public static long askValidLong(long start, long end) {
        try {
            long input = sc.nextLong();
            if (input < start || input > end) throw new IllegalArgumentException();
            return input;
        } catch (InputMismatchException e) {
            System.out.print("Non-integer input. Try again: ");
            sc.nextLine();
            return askValidLong(start, end);
        } catch (IllegalArgumentException e) {
            System.out.print("Invalid answer. Try again: ");
            sc.nextLine();
            return askValidLong(start, end);
        }
    }
}
