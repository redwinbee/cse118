package cse118ex19.src;

public class Exercise19 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr2 = new int[arr1.length];

        // this will copy only the address of arr1 to arr2, not the array itself
        arr2 = arr1;

        // but we want an actual copy, so...
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        // we can extract this to a method for a general solution
        int[] arr4 = copyArray(arr2);

        // =====================================================

        double[] maxMinAvg = findMaxMinAvg(arr1);
        System.out.println("max value in array 1: " + (int) maxMinAvg[0]);
        System.out.println("min value in array 1: " + (int) maxMinAvg[1]);
        System.out.println("avg value in array 1: " + maxMinAvg[2]);

        System.out.println(
                "average of odds [1..10]: " + calculateAverage(new int[] { 1, 3, 5, 7, 9 }));
        System.out.println("average of evens [1..10]: " + calculateAverage(2, 4, 6, 8));

        System.out.println();
    }

    /**
     * copies the given array into a new array
     * 
     * @param givenArr the array to copy
     * @return the new array with givenArray's values
     */
    public static int[] copyArray(int[] givenArr) {
        int[] out = new int[givenArr.length];
        for (int i = 0; i < givenArr.length; i++) {
            out[i] = givenArr[i];
        }

        return out;
    }

    /**
     * finds the maximum value and minimum value in a given array. the max value is
     * stored at index 1 and the min value is the last index
     * 
     * @param array the array to check
     * @return the max and minimum value in an array
     */
    public static double[] findMaxMinAvg(int[] array) {
        double max = array[0];
        double min = array[0];
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }

            sum += array[i];
        }

        return new double[] { max, min, (sum / (double) array.length) }; // anonymous array
    }

    /**
     * calculates the average of numbers in a given array
     * 
     * @param array the array
     * @return the average of the numbers in the given array
     */
    public static double calculateAverage(int... array) { // "int..." means "variable-length parameter"
        // technically, "int..." is an array and is exists mainly for convenience, java
        // will create this array for you

        /**
         * this is another way of looping over an array of values, more convenience
         */
        int sum = 0;
        for (int x : array) {
            sum += x;
        }

        return (sum / (double) array.length);
    }
}
