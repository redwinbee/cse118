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

        System.out.println("[4] 60 seconds to HH:MM:SS is: " + convertSecondsToHHMMSS(60));
        System.out.println("[4] 3600 seconds to HH:MM:SS is: " + convertSecondsToHHMMSS(3600));
        System.out.println("[4] 2456 seconds to HH:MM:SS is: " + convertSecondsToHHMMSS(2456));

        // ========================================

        String asciiTrue = getASCIICode('0', true);
        String asciiFalse = getASCIICode('0', false);
        System.out.println("[5a] ascii code of '0' (as decimal): " + asciiTrue);
        System.out.println("[5a] ascii code of '0' (as hexadecimal): " + asciiFalse);

        System.out.println("char\tdec\thexadec");
        System.out.println("========================");
        for (int i = 0; i <= 9; i++) {
            System.out.printf("%d\t%s\t%s\n", i, getASCIICode((char) ('0' + i), true),
                    getASCIICode((char) ('0' + i), false));
        }

        // ========================================

        System.out.println("[6] is '5gH' a valid password? " + isValidPassword("5gH"));
        System.out.println("[6] is 'gH5JKl3' a valid password? " + isValidPassword("gH5JKl3"));
        System.out.println("[6] is 'gH5JKl34' a valid password? " + isValidPassword("gH5JKl34"));
        System.out.println("[6] is 'gH5JKl34%' a valid password? " + isValidPassword("gH5JKl34%"));

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

    /**
     * converts a given number of seconds to the format HH:MM:SS
     *
     * @param seconds the number of seconds to convert
     * @return the string representation of the number of seconds in HH:MM:SS format
     */
    public static String convertSecondsToHHMMSS(int seconds) {
        int hours = seconds / 3600;
        seconds -= hours * 3600;
        int minutes = seconds / 60;
        seconds -= (minutes * 60);

        return String.format("%s:%s:%s", toFormatted(hours), toFormatted(minutes), toFormatted(seconds));
    }

    /**
     * converts a given duration to conform to the requirements to fit inside the
     * format HH:MM:SS
     * 
     * @param duration a given duration
     * @return the string representation of the given duration
     */
    private static String toFormatted(int duration) {
        return (duration < 10 ? "0" + duration : Integer.toString(duration));
    }

    /**
     * converts the given chraacter to its ASCII code representation
     * 
     * @param ch        the character to obtain the ASCII code of
     * @param asDecimal whether or not the ASCII code should be returned as a
     *                  decimal or hexadecimal
     * @return the ASCII code of the character
     */
    public static String getASCIICode(char ch, boolean asDecimal) {
        int code = '\u0000' + ch;
        return (asDecimal ? Integer.toString(code) : convertToHexa(code));
    }

    /**
     * converts a given decimal value into hexadecimal
     * 
     * @param dec the value to convert
     * @return the hexadecimal representation
     */
    private static String convertToHexa(int dec) {
        int next = dec;
        String hexa = "";
        while (next > 0) {
            int rem = next % 16;
            next /= 16;
            if (rem < 10) {
                hexa = rem + hexa;
            } else {
                char ch = (char) ('A' + (rem - 10));
                hexa = ch + hexa;
            }
        }

        return "0x" + hexa;
    }

    /**
     * determines if a password is valid based on the follwing conditions: 1) there
     * are more than 8 characters 2) it doesn't start with a number 3) it only
     * contains letters or numbers 4) it has at least 2 digits
     * 
     * @param password the password to check
     * @return whether or not the password is valid
     */
    public static boolean isValidPassword(String password) {
        boolean isValid = true;
        if (password.length() < 8 || Character.isDigit(password.charAt(0))) {
            return false;
        } else {
            int digitCount = 0;
            for (int i = 0; i < password.length(); i++) {
                char curr = password.charAt(i);
                if (Character.isDigit(curr)) {
                    digitCount++;
                }

                if (!(Character.isDigit(curr) || Character.isLetter(curr))) {
                    isValid = false;
                }
            }

            if (digitCount < 2) {
                isValid = false;
            }
        }

        return isValid;
    }
}
