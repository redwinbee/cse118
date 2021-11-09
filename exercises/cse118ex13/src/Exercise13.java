package cse118ex13.src;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        demo(); // call/invoke the demo method
        Scanner scanner = new Scanner(System.in);

        System.out.println("type a string to test if it is a palindrome:");
        System.out.print("input: ");
        String input = scanner.nextLine();
        System.out.println("palindrome: " + isPalindrome(input));

        System.out.println("type a number to check if it is prime:");
        System.out.println("input: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.print("prime: " + isPrime(num));

        int count = 0;
        int idx = 2;
        while (count < 50) {
            if (count % 10 == 0) {
                System.out.println();
            }

            if (isPrime(idx)) {
                System.out.printf("%d\t", idx);
                count++;
            }

            idx++;
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static boolean isPalindrome(String pal) {
        boolean isPal = true;
        for (int i = 0; i < pal.length() / 2; i++) {
            if (pal.charAt(i) != pal.charAt(pal.length() - i - 1)) {
                isPal = false;
                break;
            }
        }

        return isPal;
    }

    public static void demo() {
        // convert integer number to hexadecimal
        int rn = (int) (Math.random() * 10000);
        int n = rn;
        String hex = "0x";
        while (n > 0) {
            int rem = n % 16;
            n /= 16;
            hex += (rem > 9) ? (char) ('A' + (rem - 10)) : rem;
        }
        System.out.println(rn + " as a hexadecimal number is " + hex);

        // ----------------------------------------------------------

        // break out of the loop early
        int sum = 0;
        int num = 0;
        while (true) {
            sum += num;
            num++;
            if (sum >= 100) {
                break;
            }
        }
        System.out.println("sum: " + sum);

        // skip the numbers 10 and 11 from the summation
        sum = 0;
        num = 0;
        while (num < 20) {
            if (num == 10 || num == 11) {
                num++;
                continue;
            }
            // sum += num;
            // num++;
            // is the same thing as
            sum += num++;
        }
        System.out.println("sum (skipped): " + sum);
    }
}
