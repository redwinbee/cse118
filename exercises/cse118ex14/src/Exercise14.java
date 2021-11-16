package cse118ex14.src;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        /**
         * these summations work just fine but it's redundant, the overall logic is the
         * same but the values given are different. this kind of problem can be solved
         * using methods
         */
        // summation of numbers from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum from 1 to 10 = " + sum);

        // summation of numbers from 20 to 30
        sum = 0;
        for (int i = 20; i <= 30; i++) {
            sum += i;
        }
        System.out.println("sum from 20 to 30 = " + sum);

        // summation of numbers from 20 to 30
        sum = 0;
        for (int i = 35; i <= 45; i++) {
            sum += i;
        }
        System.out.println("sum from 35 to 45 = " + sum);

        /**
         * note the difference in size of the solution involving a new method called
         * calculateSum(), from here we can just specify intervals without having to
         * repeate the same logic again and again
         */
        // summation of numbers from 56 to 101
        sum = calculateSum(56, 101);
        System.out.println("sum from 56 to 101 = " + sum);

        // summation of numbers from 245 to 678
        sum = calculateSum(245, 678);
        System.out.println("sum from 245 to 678 = " + sum);

        // ------------------------------------------------------------------

        System.out.print("enter a number to check if it is even: ");
        int n1 = Integer.parseInt(scan.nextLine());
        System.out.println(n1 + " is " + (isEven(n1) ? "even" : "odd"));

        // ------------------------------------------------------------------

        /**
         * this looks like we want to swap the values in a and b with each other but
         * what actually happens is different. java only supports pass-by-value so when
         * we call the method swap(a, b) the values are copied into the method, worked
         * on, and nothing more. the original values of a and b defined outside of
         * swap() are not modifed
         */
        int a = 5;
        int b = 10;
        swap(a, b);

        System.out.println("is divisor: " + eitherDivisor(5, 25));
    }

    /**
     * calculates the summation of the given interval
     * 
     * @param from starting number (inclusive)
     * @param to   ending number (inclusive)
     * @return the sum
     */
    public static int calculateSum(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }

        return sum;
    }

    /**
     * checks if a given number is even or not
     * 
     * @param num the given number
     * @return whether it is even or not
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * swap the values of the given values. note: pass-by-value means this method is
     * only working on copied values of the variables we give it. anything outside
     * of this method is not modified
     * 
     * @param a the first value
     * @param b the second value
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    /**
     * check if either number is a divisor of the other number
     * 
     * @param num1 the first number
     * @param num2 the second number
     * @return
     */
    public static boolean eitherDivisor(int num1, int num2) {
        return (num1 % num2 == 0) || (num2 % num1 == 0);
    }
}
