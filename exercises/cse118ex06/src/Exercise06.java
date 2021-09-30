package cse118ex06.src;

import java.util.Random;
import java.util.Scanner;

public class Exercise06 {
    @SuppressWarnings("unused") // variables prefixed with underscores
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // option 1: ask the user to supply two numbers
        // System.out.println("please enter two numbers.");
        // System.out.print("number 1: ");
        // int num1 = scanner.nextInt();
        // System.out.print("number 2: ");
        // int num2 = scanner.nextInt();

        // option 2a: use a random number generator
        // formula: [min, max]
        // rand.nextInt(max - min + 1) + min
        Random rand = new Random();
        int num1 = rand.nextInt(101); // [0, 100]
        int num2 = rand.nextInt(102);// [0, 101]
        int _n1 = rand.nextInt(10) - 20; // [-10, 9]
        int _n2 = rand.nextInt(10) - 21; // [-10, 10]

        // option 2b: use Math.random();
        double _n3 = Math.random();
        int _n4 = (int) Math.random(); // cast to int

        // swap the values to avoid negative numbers
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int supplied = 0;
        int actual = 0;

        System.out.println("what is " + num1 + " - " + num2 + " = ?");
        supplied = scanner.nextInt();

        actual = num1 - num2;
        if (supplied == actual) {
            System.out.println("that's correct!");
        } else {
            System.out.println("sorry, that's not right...");
        }

        // ------------------------------------------------------------------

        int someN = rand.nextInt();

        boolean n1DivisBy2 = someN % 2 == 0;
        boolean n1DivisBy3 = someN % 3 == 0;
        boolean n1DivisByBoth = n1DivisBy2 && n1DivisBy3;
        boolean n1DivisByBothEx = n1DivisBy2 ^ n1DivisBy3;

        System.out.println("divisibility results of " + someN + ":");
        System.out.println("divisible by 2? " + n1DivisBy2);
        System.out.println("divisible by 3? " + n1DivisBy3);
        System.out.println("divisible by both? " + n1DivisByBoth);
        System.out.print("divisible by both (exclusively)? " + n1DivisByBothEx);

        // ------------------------------------------------------------------

        System.out.println("lottery! please enter your guess (10-99): ");
        int guess = scanner.nextInt();
        int lottoNum = rand.nextInt(100) + 10; // [10, 99]

        // extract the digits of the numbers
        int lottoDig1 = lottoNum / 10;
        int lottoDig2 = lottoNum % 10;
        int guessDig1 = guess / 10;
        int guessDig2 = guess % 10;

        // combine the digits to get the exact value for eval
        int lottoExact = (lottoDig1 * 10) + lottoDig2;
        int guessExact = (guessDig1 * 10) + guessDig2;

        if (lottoExact == guessExact) {
            // perfect match: the digits match in the same order
            System.out.println("award: $10,000!");
        } else if (lottoDig1 == guessDig2 && lottoDig2 == guessDig1) {
            System.out.println("award: $3,000");

        } else if (((guessDig1 == lottoDig1) || (guessDig1 == lottoDig2))
                && ((guessDig2 == lottoDig1) || (guessDig2 == lottoDig2))) {
            System.out.println("award: $1,000!");

        }

        scanner.close();
    }
}
