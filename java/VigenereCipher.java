import java.util.Scanner;

public class VigenereCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message: "); String message = sc.nextLine().toUpperCase();
        System.out.print("Enter your key: "); String key = sc.nextLine().toUpperCase();

        String messageEncoded = "";
        int keyLetterNum = 0;
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (isLetter(c)) {
                keyLetterNum = keyLetterNum++%3;
                char k = key.charAt(keyLetterNum);
                messageEncoded += isLetter(k) ? shift(c,k) : "";
            }
            else messageEncoded += c;
        }

        System.out.println(messageEncoded);
    }
    
    public static boolean isLetter(char c) { return c >= 'A' && c <= 'Z'; }
    public static char shift(char c1, char c2) { return (char) ((c1-c2-'A')%26+'A'); }
}