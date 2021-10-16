package cse118qz02.src;

import java.util.Random;

public class Quiz02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n1 = rand.nextInt(21) + 10;
        int n2 = rand.nextInt(21) + 10;
        int n3 = rand.nextInt(21) + 10;
        int n4 = rand.nextInt(21) + 10;

        System.out.println(String.format("q01a: [n1=%d, n2=%d, n3=%d, n4=%d]", n1, n2, n3, n4));

        double average = (n1 + n2 + n3 + n4) / 4.0;
        System.out.println("q01b: average of n1..4 is " + average);

        int evens = 0;
        if (n1 % 2 == 0) {
            evens++;
        }
        if (n2 % 2 == 0) {
            evens++;
        }
        if (n3 % 2 == 0) {
            evens++;
        }
        if (n4 % 2 == 0) {
            evens++;
        }
        int odds = evens > 4 ? evens - 4 : 4 - evens;

        System.out.println("q01c: there are " + evens + " even numbers");
        System.out.println("q01c: there are " + odds + " odd numbers");

        // ------------------------------------------------

        double var1 = rand.nextDouble(199.0) + 100.0;
        System.out.println("q02a: var1 = " + var1);

        int var2 = (int) var1;
        System.out.println("q02b: var2 = " + var2);

        double var3 = (int) ((var1 * 100) + 0.5); // ex: 123.456 -> 12346.000000
        var3 /= 100.0;
        System.out.println("q02c: var3 = " + var3);

        // ------------------------------------------------

        int length = 100;
        int feet = length / 12;
        int inches = (feet * 12) > length ? (feet * 12) - length : length - (feet * 12);

        System.out.println(String.format("q03: %din = [%d feet and %d inches]", length, feet, inches));
    }
}
