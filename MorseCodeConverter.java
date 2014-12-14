import java.util.Scanner;

/**
 * Created by Luigi on 12/14/2014.
 */
public class MorseCodeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String to be converted to Morse Code: ");
        String userInput = input.nextLine();
        System.out.println(morseConversion(userInput));
    }

    public static String morseConversion(String s) {
        String ms = s.toUpperCase().trim(); // modified string
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ms.length(); i++) {
            isValid(ms.charAt(i));

            for (Morse c : Morse.values()) {
                if (ms.charAt(i) == ' ' && ms.charAt(i - 1) == ' '); // Ignore consecutive spaces
                else if (ms.charAt(i) == c.code) {
                    result.append(c.morse);
                    if (i != ms.length() - 1) { result.append((" ")); }
                }
            }
        }
        return result.toString();
    }

    public static boolean isValid(char c) {
        for (Morse m : Morse.values()) {
            if (c == m.code) return true;
        }
        throw new IllegalArgumentException("Invalid Entry: " + c + ". Non-space input may only be: 0-9, A-Z, or a-z");
    }
}
