package cse118hw12.src;

import java.util.Random;

public class Homework12 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[][] numbers = new int[6][4];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(100) + 1;
            }
        }

        int[] maxAndMin = findMaxMin(numbers);
        System.out.printf("[1a] max is %d and min is %d\n", maxAndMin[0], maxAndMin[1]);

        double average = findAverage(numbers);
        System.out.printf("[1b] average value is %.2f\n", average);

        int greaterThanAvg = valuesAboveAvg(numbers);
        System.out.printf("[1c] number of values above the average is %d\n", greaterThanAvg);
    }

    /**
     * finds the max and min element in a 2D array
     * 
     * @param array the array to search
     * @return an array of the max and min elements
     */
    public static int[] findMaxMin(int[][] array) {
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }

        return new int[] { max, min };
    }

    /**
     * finds the average of the values in a 2D array
     * 
     * @param array the array to calculate the average for
     * @return the average value
     */
    public static double findAverage(int[][] array) {
        int sum = 0;
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }

        return sum / count;
    }

    /**
     * calculates the numbers of elements that are above the average value in teh
     * array
     * 
     * @param array the array to cehck
     * @return the number of values above the average
     */
    public static int valuesAboveAvg(int[][] array) {
        int count = 0;
        double average = findAverage(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > average) {
                    count++;
                }
            }
        }

        return count;
    }
}
