public class MethodsTest {
    public static void main(String[] args) {
        System.out.println(calcSum(new int[][] {{1,2,3},{3,4,5},{6,7,8}}));
    }
    
    public static int calcSum(int[][] arr) {
        int sum = 0;
        for (int[] row: arr) { for (int entry: row) sum += entry; }
        return sum;
    }

    public static String findLongest(String[] arr) {
        String longest = "";
        for (String str: arr) {
            if (Math.max(longest.length(), str.length()) == str.length()) { longest = str; } 
        }

        return longest;
    }
}