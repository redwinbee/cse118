package cse118ex17.src;

import java.util.Random;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("random char in ['0'..'9']: " + generateDigitChar());
        System.out.println("random char in ['A'..'Z']: " + generateUppercaseChar());
        System.out.println("random char in ['a'..'z']: " + generateLowercaseChar());

        // define an array of double numbers with a capacity of 10 elements
        double[] myList = new double[10];
        System.out.println("length of myList: " + myList.length);
        System.out.println("value at first idx: " + myList[0]);
        System.out.println("value at last idx: " + myList[myList.length - 1]);

        // define array using initializer
        double[] myList2 = { 0.1, 0.2, 0.3, 0.4 };
        System.out.println("length of myList2: " + myList2.length);
        System.out.println("value at first idx (myList2): " + myList2[0]);
        System.out.println("value at last idx (myList2): " + myList2[myList2.length - 1]);

        // ========================================================================

        // 1) initializing arrays with input values
        int[] inputs = new int[6];
        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("inputs[%d] = ", i);
            inputs[i] = Integer.parseInt(scanner.nextLine());
        }

        // 2) initializing arrays with random values
        int[] randomNums = new int[10];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (Math.random() * 100);
        }

        // 3) printing the values of an array
        for (int i = 0; i < randomNums.length; i++) {
            System.out.printf("randomNums[%d] = %d\n", i, randomNums[i]);
        }

        // 4) summing all the elements in an array
        int[] numbers = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum of numbers in numbers[] is: " + sum);

        // 5) find the largest element in an array
        /**
         * suppose the first number in the array is the max-value and start checking
         * from the index after. this way we ensure the max-value is always updated at
         * least once to ensure to logic works. same applies for the min-value.
         */
        int max = numbers[0];
        int min = numbers[0];
        int total = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }

            total += numbers[i];
        }
        System.out.println("max-value in numbers[]: " + max);
        System.out.println("min-value in numbers[]: " + min);
        System.out.println("average values in numbers[]: " + total / (double) numbers.length);
    }

    /**
     * generates a random digital character
     * 
     * @return the random character
     */
    public static char generateDigitChar() {
        return generateChar('0', '9');
    }

    /**
     * generates a random uppercase letter
     * 
     * @return the random character
     */
    public static char generateUppercaseChar() {
        return generateChar('A', 'Z');
    }

    /**
     * generates a random lowercase letter
     * 
     * @return the random character
     */
    public static char generateLowercaseChar() {
        return generateChar('a', 'z');
    }

    /**
     * generate a random number between two characters inclusively
     * 
     * @param ch1 the lower-bound character
     * @param ch2 the upper-bound character
     * @return the random char between ch1 and ch2
     */
    private static char generateChar(char ch1, char ch2) {
        Random random = new Random();
        int rn = random.nextInt(ch2 - ch1 + 1);
        return (char) (ch1 + rn);
    }
}
