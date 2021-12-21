package cse118hw10.src;

import java.util.Random;

public class Homework10 {
    private static Random random = new Random();

    public static void main(String[] args) {
        question1();
        question2();
        question3();

        int[] ascendingArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[] descendingArr = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        question4(ascendingArr);
        question4(descendingArr);

    }

    public static void question1() {
        System.out.printf("[1] generated array:");
        int[] array = new int[32];
        int min = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 8 == 0) {
                System.out.println();
            }

            array[i] = random.nextInt(200) - 99;
            sum += array[i];
            System.out.printf("%d\t", array[i]);

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println();

        double average = sum / 32.0;
        int greaterThanAvg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                greaterThanAvg++;
            }
        }

        int last = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = last;

        System.out.printf("[1] right-shifted array:");
        for (int i = 0; i < array.length; i++) {
            if (i % 8 == 0) {
                System.out.println();
            }

            System.out.printf("%d\t", array[i]);
        }
        System.out.println();

        System.out.println("[1] min value in array: " + min);
        System.out.println("[1] average value in array: " + average);
        System.out.printf("[1] there are %d values greater than the average\n", greaterThanAvg);

        System.out.println();
    }

    public static void question2() {
        int arrayLen = random.nextInt(37) + 12;
        int[] array = new int[arrayLen];
        System.out.printf("[2] generated array:");
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            array[i] = random.nextInt(201) - 101;
            System.out.printf("%d\t", array[i]);
        }
        System.out.println();

        // search for 0, twenties, evens, odds...
        int twenties = 0;
        int evens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.printf("[2] zero at: {index=%d}\n", i);
            }
            if (array[i] == 20) {
                twenties++;
            }
            if (array[i] % 2 == 0) {
                evens++;
            }
        }
        System.out.printf("[2] there (are|is) %d occurence(s) of the number 20 in the array\n", twenties);
        System.out.printf("[2] there are %d even numbers in the array\n", evens);
        System.out.printf("[2] there are %d odd numbers in the array\n",
                (evens > arrayLen) ? evens - arrayLen : arrayLen - evens);

        System.out.println();
    }

    public static void question3() {
        int[] array = new int[20];
        array[1] = 1;
        System.out.println("[3] array:");
        for (int i = 0; i < array.length; i++) {
            if (i % 5 == 0 && i != 0) {
                System.out.println();
            }

            if (i >= 2) {
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.printf("%d\t", array[i]);
        }
        System.out.println();
        System.out.println();
    }

    public static void question4(int[] array) {
        System.out.printf("[4] array:");
        for (int i = 0; i < array.length; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%d\t", array[i]);
        }

        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (isAscending && (array[i] > array[i + 1])) {
                isAscending = false;
            }
            if (isDescending && (array[i] < array[i + 1])) {
                isDescending = false;
            }
            if (!isAscending && !isDescending) {
                // array isn't sorted
                break;
            }
        }
        System.out.println();
        if (isAscending || isDescending) {
            System.out.printf("[4] the array %s sorted\n", isAscending ? "is ascendingly" : "is descendingly");
        } else {
            System.out.println("[4] the array is not sorted\n");
        }

        System.out.println();
    }
}
