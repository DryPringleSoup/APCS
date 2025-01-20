import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your message? "); String message = sc.nextLine().toUpperCase();
        System.out.print("Encoding key? "); int key = (sc.nextInt()+26)%26;
        String messageEncoded = "";
        
        for (char c: message.toCharArray()) {
            if (c >= 'A' && c <= 'Z') messageEncoded += (char) ((c+key-65)%26+65);
            else messageEncoded += c;
        }

        System.out.println(messageEncoded);
    }
}