/* Author: Luigi Vincent
A morse code converter, takes a string and returns the USA morse equivalent
*/

import java.util.Scanner;

public class MorseCodeConverter {
	static StringBuilder result = new StringBuilder();
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String to be converted to Morse Code: ");
        System.out.println(morseConversion(input.nextLine()));
    }

    public static String morseConversion(String s) {
    	/* Uniforms letter case,
    	gets rid of leading, trailing and consective spaces */
    	String ms = s.toUpperCase().trim().replaceAll("\\s+", " ");

    	StringBuilder invalidMorse = new StringBuilder();

        for (int i = 0; i < ms.length(); i++) {
            if (!isValidMorse(ms.charAt(i))) {
            	invalidMorse
            		.append(ms.charAt(i))
            		.append(", ")
            	;
            }
        }

        if (invalidMorse.length() > 0) {
        	invalidMorse.setLength(invalidMorse.length() - 2);
	        invalidMorse.append('.');
	        System.out.println("Ignored input: " + invalidMorse.toString());
        }
        return result.toString().trim();
    }

    public static boolean isValidMorse(char c) {
        for (Morse m : Morse.values()) {
            if (c == m.code) {
            	result
                    .append(m.morse)
                    .append(' ')
                ;
                return true;
            }
        }
        return false;
    }
}
