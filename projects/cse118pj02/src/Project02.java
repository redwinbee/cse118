package cse118pj02.src;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Project02 {
    private static String fileName = "sample.dat";

    public static void main(String[] args) {

        // read test scores from "sample.dat"
        int[] scores = readTestScores(fileName);

        // continue to complete project
        // (0)
        System.out.printf("Statistic information of the test: \n");

        // (step-1) display information: The total number of testers:
        System.out.println("Total number of testers: " + scores.length);

        // (2) get and display information: highest/lowest score,
        int[] highestAndLowest = findMaxAndMin(scores);
        System.out.printf("Highest-lowest scores:\n");
        System.out.println(" -- highest: " + highestAndLowest[0]);
        System.out.println(" -- lowest: " + highestAndLowest[1]);

        // (3) calculate "mean" and "median"
        System.out.println("Mean and Median scores:");
        System.out.printf(" -- mean: %.2f\n", calculateMean(scores));
        System.out.printf(" -- median: %.2f\n", calculateMedian(scores));

        // (4) calculate "standard derivation"
        System.out.println("Standard derivation:");
        System.out.printf(" -- standard deviation: %.2f\n", calculateStandardDeviation(scores));

        // (5) calculate distribution: "percentage of grades" + display data in
        // "histogram"
        System.out.printf("Distribution:\n");
        printDistribution(scores);
    }

    public static int[] readTestScores(String fileName) {
        ArrayList<Integer> scoreList = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(new File(fileName)))) {
            while (dis.available() > 0) {
                scoreList.add(dis.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] scores = new int[scoreList.size()];
        int i = 0;
        for (Integer value : scoreList) {
            scores[i++] = value;
        }
        return scores;
    }

    /**
     * obtains both the max and min value from an array of test scores
     * 
     * @param scores the scores
     * @return the max and min in an int array
     */
    public static int[] findMaxAndMin(int... scores) {
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        return new int[] { max, min };
    }

    /**
     * calculates the mean value of a given array of scores
     * 
     * @param scores the scores
     * @return the average
     */
    public static double calculateMean(int... scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        return sum / (double) scores.length;
    }

    /**
     * calculates the median value of a given array of scores
     * 
     * @param scores the scores
     * @return the median
     */
    public static double calculateMedian(int... scores) {
        double median = 0.0;
        if (scores.length % 2 == 0) {
            int sumMiddles = scores[scores.length / 2] + scores[scores.length / 2 - 1];
            median = sumMiddles / 2.0;
        } else {
            median = (double) scores[scores.length / 2];
        }

        return median;
    }

    /**
     * calculates the standard deviation of an array of scores
     * 
     * @param scores the scores
     * @return the standard deviation
     */
    public static double calculateStandardDeviation(int... scores) {
        double mean = calculateMean(scores);
        double sum = 0.0;
        for (int i = 0; i < scores.length; i++) {
            sum += (scores[i] - mean) * (scores[i] - mean);
        }

        return Math.sqrt(sum / (scores.length - 1));
    }

    /**
     * gets the letter grade associated with a given score
     * 
     * @param score the score
     * @return the letter grade of the score
     */
    public static char getLetterGrade(int score) {
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    /**
     * prints the distribution of scores to the console window
     * 
     * @param scores the scores the print
     */
    public static void printDistribution(int... scores) {
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        for (int i = 0; i < scores.length; i++) {
            char letterScore = getLetterGrade(scores[i]);
            switch (letterScore) {
                case 'A':
                    aCount++;
                    break;
                case 'B':
                    bCount++;
                    break;
                case 'C':
                    cCount++;
                    break;
                case 'D':
                    dCount++;
                    break;
            }
        }
        int fCount = scores.length - (aCount + bCount + cCount + dCount);
    }
}
