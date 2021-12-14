package cse118ex21.src;

import java.util.Arrays;

public class Exercise21 {
    public static void main(String[] args) {
        // 1) initialize 2d array with random numbers in [0, 10]
        int[][] random = new int[10][10];
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                random[i][j] = (int) (Math.random() * 10);
            }
        }

        // 2) print the contents of the array
        print2dArray(random);

        // 3) sum elements of the array
        int sum = sumElements(random);
        System.out.printf("sum of elements in 2D array: %d\n", sum);

        // 4) sum elements of the array (by column)
        int[] sums = sumElementsByCol(random);
        System.out.println("sum of elements (by column): " + Arrays.toString(sums));

        // 5) which row has the largest sum, return idx and sum
        int[] maxSum = findMaxSum(random);
        System.out.println("max sum is and found at: " + Arrays.toString(maxSum));
    }

    /**
     * prints the contents of a 2D array to the console in a grid
     * 
     * @param array the array to print
     */
    public static void print2dArray(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%d\t", array[i][j]);
            }

            System.out.println();
        }
    }

    /**
     * sums the elements of a 2D array
     * 
     * @param array the array to sum
     * @return the sum
     */
    public static int sumElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        return sum;
    }

    /**
     * sums the elements of the 2D array (bu column)
     * 
     * @param array the array to sum
     * @return the sum
     */
    public static int[] sumElementsByCol(int[][] array) {
        /**
         * get the largest number of elements in all the rows to know how big to make
         * the sums array
         */
        int maxNumElements = array[0].length;
        for (int r = 1; r < array.length; r++) {
            if (maxNumElements < array[r].length) {
                maxNumElements = array[r].length;
            }
        }

        int[] sums = new int[maxNumElements];
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                sums[c] += array[r][c];
            }
        }
        return sums;
    }

    /**
     * finds the row in the array that has the maxiumum sum and returns the sum and
     * the index of the row that has the max sum
     * 
     * @param array the array to check
     * @return the sum and index of the row with the max sum
     */
    public static int[] findMaxSum(int[][] array) {
        int sum = 0;
        int idx = -1;

        for (int i = 0; i < array.length; i++) {
            int sumOfRow = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumOfRow += array[i][j];
            }

            if (idx < 0) {
                sum = sumOfRow;
                idx = i;
            } else {
                if (sumOfRow > sum) {
                    sum = sumOfRow;
                    idx = i;
                }
            }
        }

        return new int[] { sum, idx };
    }
}
