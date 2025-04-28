import java.util.*;

class TOH {
    static ArrayList<Integer> A = new ArrayList<>();
    static ArrayList<Integer> B = new ArrayList<>();
    static ArrayList<Integer> C = new ArrayList<>();

    static void printTowers() {
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("----------------------------");
    }
    
    static void moveDisk(ArrayList<Integer> source, ArrayList<Integer> destination, char s, char d) {
        int disk = source.remove(source.size() - 1);
        destination.add(disk); // Add to destination
        System.out.println("Move disk " + disk + " from " + s + " to " + d);
        printTowers();
    }

    static void hanoi(int n, ArrayList<Integer> source, ArrayList<Integer> auxiliary, ArrayList<Integer> destination, char s, char a, char d) {
        if (n == 1) {
            moveDisk(source, destination, s, d);
            return;
        }
        hanoi(n - 1, source, destination, auxiliary, s, d, a);
        moveDisk(source, destination, s, d);
        hanoi(n - 1, auxiliary, source, destination, a, s, d);
    }

    public static void main(String[] args) {
        A.addAll(Arrays.asList(1,2,3,4));
        System.out.println("Initial Tower State:");
        printTowers();
        hanoi(6, A, B, C, 'A', 'B', 'C');
    }
}
