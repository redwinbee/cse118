package cse118hw09.src;

import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("[1a] (prime) enter a number: ");
        int maybePrime = Integer.parseInt(scanner.nextLine());
        System.out.printf("[1a] %d is %s\n", maybePrime, isPrime(maybePrime) ? "prime" : "not prime");

        // ========================================

        System.out.print("[2] (hexadecimal) enter a string: ");
        String maybeHexa = scanner.nextLine();
        System.out.printf("[2] %s is %s\n", maybeHexa, isHexaString(maybeHexa) ? "hexadecimal" : "not hexadecimal");
        System.out.println("[2] 0xDEADBEEF is " + (isHexaString("0xDEADBEEF") ? "hexadecimal" : "not hexadecimal"));
        System.out.println("[2] 0xFA9Z4 is " + (isHexaString("0xFA9Z4") ? "hexadecimal" : "not hexadecimal"));
        System.out.println("[2] FA9Z4 is " + (isHexaString("FA9Z4") ? "hexadecimal" : "not hexadecimal"));

        // ========================================

        System.out.print("[3] (palindrome) enter a string: ");
        String maybePal = scanner.nextLine();
        System.out.printf("[3] (case-sensitive) %s is %s\n", maybePal,
                isPalindrome(maybePal, true) ? "a palindrome" : "not a palindrome");
        System.out.printf("[3] (case-insensitive) %s is %s\n", maybePal,
                isPalindrome(maybePal, false) ? "a palindrome" : "not a palindrome");

        // ========================================

        scanner.close();
    }

    /**
     * checks if the given number is a prime number
     * 
     * @param num the number
     * @return whether the number is prime or not
     */
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    /**
     * generates a random number with the given constraints
     * 
     * @param lowerBound lower-bound (inclusive)
     * @param upperBound upper-bound (inclusive)
     * @return the random number
     */
    public static int generateRandomNum(int lowerBound, int upperBound) {
        return ((int) (lowerBound + (Math.random() * upperBound)));
    }

    /**
     * checks if the given char is a valid hexadecimal character. valid hexadecimal
     * characters are in the range 0-9 and A-F (case-insensitive)
     * 
     * @param ch the character to check
     * @return whether or not the given char is a hexadecimal char
     */
    public static boolean isHexaChar(char ch) {
        return ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f'));
    }

    /**
     * checks if the given string is a valid hexadecimal string. valis hexadecimal
     * strings begin with "0x" followed by characters in which
     * {@code isHexaChar(ch)} returns true
     * 
     * @param str the string to check
     * @return whether the given string is valid hexadecimal or not
     */
    public static boolean isHexaString(String str) {
        if (!str.startsWith("0x")) {
            return false;
        } else {
            String hexas = str.substring(2);
            boolean isHexa = true;
            for (int i = 0; i < hexas.length(); i++) {
                if (!isHexaChar(hexas.charAt(i))) {
                    isHexa = false;
                    break;
                }
            }

            return isHexa;
        }
    }

    /**
     * determines if the given string is a palindrome or not. if supplied with
     * {@code caseSensitive = true} then the string will be checked without regards
     * to its casing
     * 
     * @param str           the string to check
     * @param caseSensitive whether the check should be case-sensitive or not
     * @return whether or not the string is a palindrome
     */
    public static boolean isPalindrome(String str, boolean caseSensitive) {
        if (caseSensitive) {
            str = str.toLowerCase();
        }

        boolean isPal = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPal = false;
                break;
            }
        }

        return isPal;
    }
}
