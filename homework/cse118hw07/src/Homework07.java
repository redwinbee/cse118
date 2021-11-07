package cse118hw07.src;

import java.util.Random;
import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Random random = new Random();

        System.out.println("enter a value (n) to calulate [1 + 1/2 + 1/3 + ... + 1/n] for: ");
        System.out.print("n = ");
        int n1 = Integer.parseInt(scanner.nextLine());
        double seriesSum = 0.0;
        for (int i = 1; i <= n1; i++) {
            seriesSum += (1.0 / i);
        }
        System.out.printf("series sum to n = %d is: %f\n", n1, seriesSum);

        // ---------------------------------------------------------

        String welcome = "Welc2ome T3o Co3mp67uter W99orld";

        int digitChars = 0;
        boolean isAscending = true;
        String stripped = new String();
        for (int idx = 0; idx < welcome.length(); idx++) {
            boolean ascending = false;
            char curr = welcome.charAt(idx);
            char prev = idx == 0 ? curr : welcome.charAt(idx - 1); // otherwise we'll do welcome.charAt(-1) which will
                                                                   // throw an exception
            if (Character.isDigit(prev)) {
                digitChars++;
                ascending = (prev <= curr);

                // it's no longer ascending on the first fail
                if (!ascending) {
                    isAscending = false;
                }
            }

            if (!Character.isDigit(curr)) {
                stripped += curr;
            }
        }
        System.out.printf("there are %d digit chars in the string\n", digitChars);
        System.out.printf("the digit chars are %s ascending order\n", isAscending ? "in" : "not in");
        System.out.println("stripped string is " + stripped);

        // ---------------------------------------------------------

        int n2 = random.nextInt(10) + 1;
        System.out.println("random n for pattern = " + n2);

        System.out.println("pattern #1");
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("pattern #2");
        for (int i = n2; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("pattern #3");
        for (int i = n2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // ---------------------------------------------------------

        System.out.println("Miles\tKilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t %.3f\n", i, (i * 1.609));
        }

        // ---------------------------------------------------------

        int evens = 0;
        for (int i = 1; i <= 1000; i++) {
            int nextRand = random.nextInt(100);
            if (nextRand % 2 == 0) {
                evens++;
            }
        }
        System.out.printf("%d were even\n", evens);
        System.out.printf("%d were odd\n", Math.abs(evens - 1000));

        // ---------------------------------------------------------

        System.out.print("enter an integer number: ");
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        /**
         * take the first remainder of the input and add that to the sum, then divide
         * the number by 10 which effectively removes the last number which is already
         * included in the sum. Repeat this process over and over until we can't divide
         * by 10 anymore
         */
        int temp = input;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        System.out.printf("the digits of %d added up is equal to %d\n", input, sum);

        // ---------------------------------------------------------

        int counter = 0;
        for (int i = 10_000; i <= 20_000; i++) {
            if (i % 11 == 0 ^ i % 13 == 0) {
                if (counter % 10 == 0) {
                    System.out.println();
                }
                counter++;
                System.out.printf("%d\t", i);
            }
        }

        scanner.close();
    }
}
