package cse118ex11.src;

import java.util.Random;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // send the message "Welcome to Java" 100 times
        int count = 0;
        while (count <= 3) {
            System.out.printf("[#1] Welcome to Java! (x%d)\n", count);
            count++;
        }

        // add up the given number (n) from 1..n
        System.out.print("[#2] enter a number: ");
        int n1 = scan.nextInt();
        int sum = 0;
        int idx = 1;
        while (idx <= n1) {
            sum += idx;
            idx++;
        }
        System.out.printf("[#2] summation of %d is: %d\n", n1, sum);

        // --------------------------------------------------------------

        int digit1 = (int) (Math.random() * 9);
        int digit2 = (int) (Math.random() * 9);
        /** while loop implementation */
        // System.out.printf("[#3] what is %d + %d = ?\n", digit1, digit2);
        // System.out.print("[#3] your guess: ");
        // int guess1 = scan.nextInt();
        // while (guess1 != (digit1 + digit2)) {
        // System.out.println("[#3] that's not right... try again");
        // System.out.printf("[#3] what is %d + %d = ", digit1, digit2);
        // guess1 = scan.nextInt();
        // }
        // System.out.println("[#3] correct!");

        /** do-while loop implementation */
        int guess1 = 0;
        do {
            System.out.printf("[#3] what is %d + %d = ", digit1, digit2);
            guess1 = scan.nextInt();

            if (guess1 != (digit1 + digit2)) {
                System.out.println("[#3] that's not right... try again");
            } else {
                System.out.println("[#3] correct!");
            }
        } while (guess1 != (digit1 + digit2));

        // --------------------------------------------------------------

        Random rand = new Random();
        int actual = rand.nextInt(101);

        System.out.print("[#4] guess a number between 0 and 100: ");
        int guess2 = scan.nextInt();
        while (guess2 != actual) {
            System.out.printf("[#4] no, that's too %s, try again\n", (guess2 < actual) ? "low" : "high");
            System.out.print("[#4] guess: ");
            guess2 = scan.nextInt();
        }
        System.out.println("[#4] correct!");

        scan.close();
    }
}
