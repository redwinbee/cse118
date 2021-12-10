package cse118ex20.src;

public class Exercise20 {
    public static void main(String[] args) {
        int[] array = { 3, 2, 8, 9, 6, 1, 7, 5 };
        int linearIdx = linearSearch(7, array);
        int binaryIdx = binarySearch(7, array);
        System.out.printf("[1] %d found at index %d\n", 7, linearIdx);
        System.out.printf("[1] %d found at index %d\n", 7, binaryIdx);

        int[] unsortedArray = { 5, 9, 2, 7, 3, 4, 1, 8 };
        selectionSort(unsortedArray);
        System.out.println();
    }

    /**
     * find the index of where the given key can be found in an array. will return
     * -1 if the value could not be found.
     * 
     * Aptly named linearSearch because the cost of the algorithm is O(n) which
     * scales linearly in cost (performace-wise)
     * 
     * @param key   the value to find
     * @param array the array to look in
     * @return the index of the value, -1 if not found
     */
    public static int linearSearch(int key, int... array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }

        return -1;
    }

    /**
     * find the index of where the given key can be found in an array using binary
     * search, will return -1 if the key could not be found.
     * 
     * binary search will discard half the array every iteration if the current
     * middle value is either greater than or less than the key we're looking for.
     * this algorithm has a cost in performance of O(log(n)) which is far faster and
     * more noticeable than linear search with larger and larger data sets
     * 
     * @param key   the value to find
     * @param array the array to look in
     * @return the index of the value, -1 if not found
     */
    public static int binarySearch(int key, int... array) {
        int lower = 0;
        int upper = array.length;
        while (lower <= upper) {
            int middle = (lower + upper) / 2;
            if (array[middle] == key) {
                return middle;
            } else if (array[middle] > key) {
                upper = middle - 1;
            } else {
                lower = middle + 1;
            }
        }

        return -1;
    }

    /**
     * sort the elements of an array using selection sort. this sorting algorithm
     * starts at the first index, finds the min value in the array from [i,
     * array.length - 1], swaps the values of the min index found with the first
     * index, then continues with the next loop
     * 
     * @param array the array to sort
     */
    public static void selectionSort(int... array) {
        for (int i = 0; i < array.length - 1; i++) {
            // (1) find the index of the minimum value in [i, array.length - 1]
            int minIdx = i;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }

            // (2) swap the value of the current index and the minIdx
            if (i != minIdx) {
                int temp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = temp;
            }
        }
    }
}
