package cse118ts02.src;

import java.util.Random;
import java.util.Scanner;

// Final Exam
@SuppressWarnings("unused")
public class Test02 {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Question 1a
        int n1 = random.nextInt(100) + 1;
        System.out.println("random n1: " + n1);

        // Question 1b
        int n2 = random.nextInt(100) + 1;
        while (n2 == n1) {
            n2 = random.nextInt(100) + 1;
        }
        System.out.println("random n2: " + n2);

        // Question 1c
        int smaller = (n1 > n2) ? n2 : n1;
        int larger = (n1 < n2) ? n2 : n1;
        System.out.printf("the smaller number is %d. the greater number is %d\n", smaller, larger);

        // Question 1d
        int[] arr1 = question1d(10, 1, 100);

        // Question 1e
        double[] analyzedArr1 = question1e(arr1);

        // Question 1f
        int[] arr2 = question1d(20, (n1 < n2) ? n1 : n2, (n1 > n2) ? n1 : n2);
        for (int i = 0; i < arr2.length; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%d\t", arr2[i]);
        }
        System.out.println();

        // Question 1g
        double[] arr3 = question1e(arr2);
        System.out.printf("there are %d evens elements in array. the sum of these even numbers is %d\n",
                (int) arr3[0],
                (int) arr3[2]);

        System.out.printf("there are %d odd elements in array. the sum of these odd numbers is %d\n", (int) arr3[1],
                (int) arr3[3]);

        System.out.printf("the average value of the array is %.2f\n", arr3[4]);

        // Question 2a
        double[] arr = new double[32];
        arr[0] = 0.5;
        arr[1] = 1.0;
        arr[2] = 1.5;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = ((1 / 4.0) * arr[i - 3]) + ((1 / 4.0) * arr[i - 2]) + ((1 / 2.0) * arr[i - 1]);
        }
        System.out.print("unshuffled:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 8 == 0) {
                System.out.println();
            }
            System.out.printf("%.4f\t", arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int rn = random.nextInt(arr.length);
            double temp = arr[i];
            arr[i] = arr[rn];
            arr[rn] = temp;
        }
        System.out.print("shuffled:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 8 == 0) {
                System.out.println();
            }
            System.out.printf("%.4f\t", arr[i]);
        }
        System.out.println();

        // Question 3a
        System.out.print("please type a string: ");
        String str = scanner.nextLine();
        char ch = 0;
        int nn = random.nextInt(52);
        if (nn < 26) {
            ch = (char) (nn + 'A');
        } else {
            ch = (char) ((nn - 26) + 'a');
        }
        int occurances = question3a(str, ch);
        System.out.printf("character %c appears in string %s for %d times\n", ch, str, occurances);

        // Question 4
        System.out.println("== sports scoring ==");
        int[] scores = new int[7];
        int max = scores[0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("enter the next score (idx=%d): ", i);
            scores[i] = Integer.parseInt(scanner.nextLine());

            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        int scoreSum = 0;
        int skippedMax = 0;
        int skippedMin = 0;
        for (int i = 0; i < scores.length; i++) {
            if (skippedMax == 0) {
                if (scores[i] == max) {
                    skippedMax++;
                    continue;
                }
            }
            if (skippedMin == 0) {
                if (scores[i] == min) {
                    skippedMin++;
                    continue;
                }
            }

            scoreSum += scores[i];
        }

        System.out.println("scores: " + printArray(scores));
        System.out.println("final score: " + scoreSum / 5.0);

        // Question 5
        int[][] identMatrix = identityMatrix(4);
        System.out.println("identity matrix:");
        print2dArray(identMatrix);

        // Question 6
        int[][] matrix = {
                { 1, 4, 3 },
                { 8, 2, 6 },
                { 7, 8, 3 },
                { 4, 9, 6 },
                { 7, 8, 1 }
        };
        int[][] convertedMatrix = convertMatrix(matrix);
        System.out.println("original matrix:");
        print2dArray(matrix);

        System.out.println("converted matrix:");
        print2dArray(convertedMatrix);
    }

    public static int[] question1d(int arraySize, int lowerBound, int upperBound) {
        int[] out = new int[arraySize];
        for (int i = 0; i < out.length; i++) {
            out[i] = random.nextInt(upperBound + 1) + lowerBound;
        }

        return out;
    }

    public static double[] question1e(int[] array) {
        int evens = 0;
        int sumEvens = 0;
        int sumOdds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens++;
                sumEvens += array[i];
            } else {
                sumOdds += array[i];
            }
        }

        return new double[] { evens, Math.abs((array.length - 1) - evens), sumEvens, sumOdds,
                ((sumEvens + sumOdds) / (double) array.length) };
    }

    public static int question3a(String str, char ch) {
        int occurances = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                occurances++;
            }
        }

        return occurances;
    }

    public static int[][] identityMatrix(int n) {
        int[][] out = new int[n][n];
        int mainDiagIdx = 0;
        for (int i = 0; i < out.length; i++) {
            boolean inserted = false;
            for (int j = 0; j < out[i].length; j++) {
                if (!inserted) {
                    out[i][mainDiagIdx] = 1;
                    mainDiagIdx++;
                    inserted = true;
                }
            }
        }

        return out;
    }

    public static int[][] convertMatrix(int[][] in) {
        int[][] out = new int[in[0].length][in.length];
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i].length; j++) {
                out[i][j] = in[j][i];
            }
        }
        return out;
    }

    // ==========[ some helper methods for printing arrays ]==========

    private static String printArray(int... array) {
        String out = "[";
        for (int i = 0; i < array.length - 1; i++) {
            out += array[i] + ", ";
        }
        out += array[array.length - 1] + "]";

        return out;
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
