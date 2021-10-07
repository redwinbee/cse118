package cse118ex08.src;

import java.util.Random;

public class Exercise08 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        final Random rand = new Random();

        // mathematical functions

        // constants
        double pi = Math.PI;
        double e = Math.E;
        // functions
        double sin = Math.sin(1);
        double cos = Math.cos(0);
        double tan = Math.tan(Math.PI);

        /**
         * avoid using Math.pow() for simple calculations as the method costs a lot in
         * runtime performance. ex when to use Math.pow() is for decimal exponents
         */
        double x = 123.321;
        System.out.println("x^2 = " + Math.pow(x, 2));
        System.out.println("100^2 = " + Math.pow(100, 2));
        System.out.println("x^2 = " + x * x);

        /**
         * floor() will round the number down to the nearest integer while ceil() will
         * round up to the nearest integer. Note that for the negative numbers the
         * ceil() for a num = -1.2 would be -1.0 and the floor would be -2.0
         */
        double y = 7.2;
        System.out.println("floor: " + Math.floor(y));
        System.out.println("ceil: " + Math.ceil(y));

        /**
         * find the max value between 4 different numbers and to do so we need a
         * temporary variable to store the intermediate values
         */
        double t1 = Math.max(8, 5);
        double t2 = Math.max(3, 89);
        double maxVal = Math.max(t1, t2);

        /**
         * math class also has a random() method that generates double values between
         * [0.0, 1.0) and doesn't require an object initialization unlike the Random
         * class
         */
        double r1 = Math.random(); // [0.0, 1.0)
        double r2 = Math.random() * 10; // [0.0, 10.0);
        double r3 = Math.random() * 11; // [0.0, 11.0);
        int i1 = (int) (Math.random() * 11); // [0, 10];
        int i2 = (int) Math.random() * 11; // always 0

        /**
         * use Math.abs() to compare two floating point number and not == operator as it
         * will not be accurate
         */
        double r4 = Math.random();
        double r5 = Math.random();
        if (Math.abs(r4 - r5) < 0.001) { // we decide how accurate to be
            System.out.println("our random num is smaller!");
        }

        // ------------------------------------------------------------------------

        /**
         * ASCII is always stored in one 8-bit number (1 byte) where the first number is
         * ALWAYS 0. that means, using only 7 bits, we can define a total of 128 letters
         * and numbers
         */
        char letter = 'A'; // ASCII
        char numChar = '4'; // ASCII
        char letterr = '\u0041'; // Unicode 'A'
        char numCharr = '\u0034'; // Unicode '4'
        System.out.println("\u270A"); // Unicode '✊

        char ch = 'A';
        System.out.println("++ch: " + ++ch);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("ch is either an uppercase or lowercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("ch is a digit");
        } else {
            System.out.println("ch is some other character");
        }

        System.out.println("is ch an uppercase letter? " + Character.isUpperCase(ch));
        System.out.println("is ch a lowercase letter? " + Character.isLowerCase(ch));
    }
}
