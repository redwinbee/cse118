package cse118hw11.src;

import java.util.Arrays;
import java.util.Random;

public class Homework11 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] randArr = generateArray(100, 200, -100);
        double[] info = getInfoFromArray(randArr);
        System.out.printf("[2] the maximum value %d is found at %d\n", (int) info[0], (int) info[1]);
        System.out.printf("[2] the minimum value %d is found at %d\n", (int) info[2], (int) info[3]);
        System.out.printf("[2] the average value of the array is %.2f\n", info[4]);

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        System.out.printf("[3] arr1 and arr2 are %s\n", checkArraysEqual(arr1, arr2) ? "equal" : "not equal");

        int[] toReverse = { 1, 5, 9, 3 };
        System.out.println("[4] original array: " + Arrays.toString(toReverse));
        reverseArray(toReverse);
        System.out.println("[4] reversed array: " + Arrays.toString(toReverse));

        System.out.println("[5] checking if [1,2,3] is sorted: " + (isSorted(1, 2, 3) ? "yes" : "no"));
        System.out.println("[5] checking if [3,2,1] is sorted: " + (isSorted(3, 2, 1) ? "yes" : "no"));
        System.out.println("[5] checking if [1,7,3] is sorted: " + (isSorted(1, 7, 3) ? "yes" : "no"));

        int[] unorganized = { 2, 1, 9, 6, 4, 5 };
        int[] organized = reorganizeArray(unorganized);
        System.out.println("[6] unorganized array: " + Arrays.toString(unorganized));
        System.out.println("[6] organized array: " + Arrays.toString(organized));
    }

    /**
     * generates an array of a given size, with random numbers in the range
     * [lowerBound, upperBound]
     * 
     * @param arraySize  the size of the array
     * @param upperBound the upper bound of the random numbers to use
     * @param lowerBound the lower bound of the random numbers to use
     * @return the generated array
     */
    public static int[] generateArray(int arraySize, int upperBound, int lowerBound) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperBound + 1) + lowerBound;
        }

        return array;
    }

    /**
     * gets the maximum/minimum values and their indexes, as well as the average
     * value of the numbers in the array
     * 
     * @param array the array to check
     * @return the info on the array
     */
    public static double[] getInfoFromArray(int[] array) {
        double maxVal = array[0];
        double maxIdx = 0;
        double minVal = array[0];
        double minIdx = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
                maxIdx = i;
            }

            if (array[i] < minVal) {
                minVal = array[i];
                minIdx = i;
            }

            sum += array[i];
        }

        return new double[] { maxVal, maxIdx, minVal, minIdx, (sum / (double) array.length) };
    }

    /**
     * checks if two arrays are equal which is defined as the size of the arrays
     * being the same, as well as the values stored in them
     * 
     * @param firstArr  the first array
     * @param secondArr the second array
     * @return whether or not the first and second array are equals
     */
    public static boolean checkArraysEqual(int[] firstArr, int[] secondArr) {
        if (firstArr.length != secondArr.length) {
            return false;
        } else {
            // we know the arrays are the same size, just use one of lengths for the loop
            boolean isEqual = true;
            for (int i = 0; i < firstArr.length; i++) {
                if (firstArr[i] != secondArr[i]) {
                    isEqual = false;
                    break;
                }
            }

            return isEqual;
        }
    }

    /**
     * reverses the elements in the given array
     * 
     * @param array
     * @return
     */
    public static void reverseArray(int... array) {
        int idx = 0;
        for (int i = array.length - 1; i > array.length / 2; i--) {
            int temp = array[idx];
            array[idx] = array[i];
            array[i] = temp;
            idx++;
        }
    }

    /**
     * checks if an array is either ascendingly sorted or descendingly
     * 
     * @param array the array to check
     * @return whether or not the array is sorted
     */
    public static boolean isSorted(int... array) {
        boolean ascSorted = true;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else {
                ascSorted = false;
                break;
            }
        }

        // maybe it's descendinly sorted?
        boolean descSorted = true;
        if (!ascSorted) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                } else {
                    descSorted = false;
                    break;
                }
            }
        }

        return ascSorted || descSorted;
    }

    /**
     * reorganizes the elements of an array by placing all the odd numbers in front
     * of all the even numbers. note that this method will return a new array of the
     * reorganized array and does not affect the original.
     * 
     * @param array the array to reorganize
     * @return the reorganized array
     */
    public static int[] reorganizeArray(int[] array) {
        int[] out = new int[array.length];
        int idx = 0;
        int lastIdx = out.length - 1;
        for (int value : array) {
            if (value % 2 == 0) {
                out[lastIdx] = value;
                lastIdx--;
            } else {
                out[idx] = value;
                idx++;
            }
        }

        return out;
    }
}
