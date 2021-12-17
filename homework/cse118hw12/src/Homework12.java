package cse118hw12.src;

public class Homework12 {
    public static void main(String[] args) {
        int[][] numbers = new int[6][4];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int) (Math.random() * 99) + 1;

            }
        }

        int[] maxAndMin = findMaxMin(numbers);
        System.out.printf("[1a] max is %d and min is %d\n", maxAndMin[0], maxAndMin[1]);

        double average = findAverage(numbers);
        System.out.printf("[1b] average value is %.2f\n", average);

        int greaterThanAvg = valuesAboveAvg(numbers);
        System.out.printf("[1c] number of values above the average is %d\n", greaterThanAvg);

        int[] smallestIdx = findSmallestIdx(numbers);
        System.out.printf("[1d] the smallest element can be found at row %d, col %d\n", smallestIdx[0],
                smallestIdx[1]);

        // ==========================================================

        float[][] original = {
                { 1.2F, 3.3F, 3.14F, 5.6F },
                { 4.5F, 2.1F, 9.0F, 4.6F },
                { 3.4F, 7.7F, 8.7F, 2.9F }
        };
        System.out.println("[2] original array:");
        print2dArray(original);
        double[] flattened = convert2DArrayTo1DArray(original);
        System.out.println("[2] flattened array:");
        printArray(flattened);

        // ==========================================================

        double[][] matrix1 = {
                { 1.2, 2.3, 4.5 },
                { 6.7, 3.2, 5.5 },
                { 9.0, 7.3, 8.2 }
        };
        System.out.println("[3] matrix1:");
        print2dArray(matrix1);
        double[][] matrix2 = {
                { 3.4, 0.2, 7.7 },
                { 1.1, 8.0, 0.6 },
                { 1.0, 4.2, 8.8 }
        };
        System.out.println("[3] matrix2:");
        print2dArray(matrix2);

        double[][] matrixSum = addMatrices(matrix1, matrix2);
        System.out.println("[3] matrix sum:");
        print2dArray(matrixSum);

        // ==========================================================

        int[][] generatedArray = generate2dArray(5, 4);
        System.out.println("[4] generated array of size (5 x 4):");
        print2dArray(generatedArray);
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

    /**
     * finds the smallest element in an array and returns the index of where that
     * value can be found
     * 
     * @param array the array to check
     * @return the index (row, column)
     */
    public static int[] findSmallestIdx(int[][] array) {
        int min = array[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[] { row, col };
    }

    /**
     * flattens the elements of a 2D array
     * 
     * @param array
     * @return
     */
    public static double[] convert2DArrayTo1DArray(float[][] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            size += array[i].length;
        }

        double[] out = new double[size];
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                out[idx] = array[i][j];
                idx++;
            }
        }

        return out;
    }

    /**
     * performs matrix addition on the two given arrays (matrices)
     * 
     * @param array1 the first array
     * @param array2 the second array
     * @return the resulting array
     */
    public static double[][] addMatrices(double[][] array1, double[][] array2) {
        double[][] out = new double[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                out[i][j] = array1[i][j] + array2[i][j];
            }
        }

        return out;
    }

    /**
     * generates a 2D array with the given rows and colums, the values stored
     * inside this array are to be generated starting from 1 and continue going up
     * by 1. odd rows will have values in ascending order while even rows will
     * havevalues in descending order.
     * 
     * @param rows the number of rows the array will have
     * @param cols the number of columns the array will have
     * @return the generated array
     */
    public static int[][] generate2dArray(int rows, int cols) {
        int[][] out = new int[rows][cols];
        int count = 1;
        for (int i = 0; i < out.length; i++) {
            if ((i + 1) % 2 == 0) {
                for (int j = out[i].length - 1; j >= 0; j--) {
                    out[i][j] = count;
                    count++;
                }
            } else {
                for (int j = 0; j < out[i].length; j++) {
                    out[i][j] = count;
                    count++;
                }
            }
        }

        return out;
    }

    // ==========[ some helper methods for printing arrays ]==========

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f\t", array[i]);
        }
        System.out.println();
    }

    public static void print2dArray(float[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%.2f\t", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void print2dArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%.2f\t", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void print2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.println();
        }
    }
}
