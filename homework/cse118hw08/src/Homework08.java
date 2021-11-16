package cse118hw08.src;

import java.util.Random;
import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final Random rand = new Random();

        System.out.println("[q1] 100 random numbers:");
        int evens = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            int rn = rand.nextInt(100) + 1;
            System.out.printf("%d\t", rn);
            sum += rn;

            if (rn % 2 == 0) {
                evens++;
            }

            if (i % 10 == 0) {
                System.out.println();
            }
        }
        double average = sum / 100.0;
        System.out.println("[q1] evens: " + evens);
        System.out.println("[q1] odds: " + Math.abs(evens - 100));
        System.out.println("[q1] sum: " + sum);
        System.out.println("[q1] average: " + average);

        // -------------------------------------------------------------

        System.out.print("[q2] type a string: ");
        String input = scan.nextLine();
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // seems inefficient
        }
        System.out.println("[q2] original string: " + input);
        System.out.println("[q2] reversed string: " + reversed);

        // -------------------------------------------------------------

        int rn = rand.nextInt(100_000) + 1;
        int num = rn;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("[q3a] original num: " + rn);
        System.out.println("[q3b] reversed num: " + rev);

        // -------------------------------------------------------------

        int lot1 = rand.nextInt(9) + 1;
        int lot2 = 0;
        do {
            lot2 = rand.nextInt(10) + 1;
        } while (lot1 == lot2);
        System.out.println("[q4] lotter number: " + lot1 + lot2);

        // -------------------------------------------------------------

        System.out.print("[q5] enter a positive number: ");
        int n = Integer.parseInt(scan.nextLine());
        double summation = 1;
        for (double i = 2.0; i <= n; i++) {
            if (i % 2 <= 0.000000) {
                summation -= (1 / i);
            } else {
                summation += (1 / i);
            }
        }
        System.out.printf("[q5] sum(1 +/- (1 / n)), n = %s is: %f\n", n, summation);

        // -------------------------------------------------------------

        // sequence: 1, 1, 2, 3, 5, 8, 13, 21, ...
        /*
         * pattern: starting at 1, add the first number to the previous (1 + 0) and
         * continue with the result -> (1 + 2) = 3 , (2 + 3) = 5, (3 + 5) = 8, ...
         */

        System.out.print("1, ");
    }
}
