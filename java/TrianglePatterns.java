import java.util.InputMismatchException;
import java.util.Scanner;

public class TrianglePatterns {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose a triangle type:\n    1: Left-Aligned\n    2: Right-Aligned\n    3: Inverted\n    4: Floyd\n    5: Pascal");
        System.out.print("Enter your choice (1-5): "); int choice = askValidInt(1,5);
        System.out.print("Enter your height: "); int height = askValidInt(0,Integer.MAX_VALUE);
        
        switch (choice) {
            case 1 -> printLeftAlignedTriangle(height);
            case 2 -> printRightAlignedTriangle(height);
            case 3 -> printInvertedTriangle(height);
            case 4 -> printFloydsTriangle(height);
            default -> printPascalsTriangle(height);
        }
    }

    public static void printLeftAlignedTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void printRightAlignedTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height-i; j++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void printInvertedTriangle(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void printFloydsTriangle(int height) {
        int number = 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }
    }

    public static void printPascalsTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height-i-1; j++) System.out.print(" ");

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number*(i-j)/(j+1);
            }

            System.out.println();
        }
    }

    public static int askValidInt(int start, int end) {
        try {
            int input = sc.nextInt();
            if (input<start || input>end) throw new IllegalArgumentException();
            return input;
        } catch (InputMismatchException e) {
            System.out.print("Non-integer input. Try again: ");
            sc.nextLine(); return askValidInt(start, end);
        } catch (IllegalArgumentException e) {
            System.out.print("Unavaliable option. Try again: ");
            sc.nextLine(); return askValidInt(start, end);
        }
    }
}
