package cse118qz03.src;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Random random = new Random();

        int odds = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            int rn = random.nextInt(1_000) + 100;
            System.out.printf("%d\t", rn);
            if (i % 10 == 0) {
                System.out.println();
            }

            if (rn % 3 == 0) {
                odds++;
            }

            sum += rn;
        }
        System.out.printf("there are %d odd numbers\n", odds);
        System.out.printf("there are %d even numbers\n", Math.abs(odds - 100));
        System.out.printf("the average is: %.2f\n", (sum / 100.0));

        // ============================================================

        System.out.print("type a string: ");
        String input = scanner.nextLine();

        int digitChars = 0;
        int upperCaseLetters = 0;
        int lowerCaseLetters = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digitChars++;
            } else if (ch >= 'A' && ch <= 'Z') {
                upperCaseLetters++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowerCaseLetters++;
            }
        }

        System.out.printf("%s %s a palindrome\n", input, isPalindrome(input) ? "is" : "is not");
        System.out.printf("there are %d digital chars in this string\n", digitChars);
        System.out.printf("there are %d upper-case letters in this string\n", upperCaseLetters);
        System.out.printf("there are %d lower-case letters in this string\n", lowerCaseLetters);

        // ============================================================

        System.out.print("enter a start value for the temperatures table: ");
        double starting = Double.parseDouble(scanner.nextLine());

        System.out.println("FA\tCEL");
        System.out.println("===============");
        for (double i = 0; i < 20.0; i++) {
            System.out.printf("%.2f\t%.2f\n", starting, convertToCelcius(starting));
            starting += 5.0;
        }

        scanner.close();
    }

    public static double convertToCelcius(double fahrenheit) {
        return ((5.0 / 9.0) * (fahrenheit - 32));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        boolean isPal = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPal = false;
            }
        }

        return isPal;
    }
}
