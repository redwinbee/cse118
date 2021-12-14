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
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < scores.length; i++) {
            char letterScore = getLetterGrade(scores[i]);
            switch (letterScore) {
                case 'A':
                    a++;
                    break;
                case 'B':
                    b++;
                    break;
                case 'C':
                    c++;
                    break;
                case 'D':
                    d++;
                    break;
            }
        }
        int f = scores.length - (a + b + c + d);

        System.out.printf(" -- Grade A:\t%.2f%s\t%s\n", ((a / (double) scores.length) * 100), "%",
                graph(a, scores.length));
        System.out.printf(" -- Grade B:\t%.2f%s\t%s\n", ((b / (double) scores.length) * 100), "%",
                graph(b, scores.length));
        System.out.printf(" -- Grade C:\t%.2f%s\t%s\n", ((c / (double) scores.length) * 100), "%",
                graph(c, scores.length));
        System.out.printf(" -- Grade D:\t%.2f%s\t%s\n", ((d / (double) scores.length) * 100), "%",
                graph(d, scores.length));
        System.out.printf(" -- Grade F:\t%.2f%s\t%s\n", ((f / (double) scores.length) * 100), "%",
                graph(f, scores.length));
        System.out.printf(" -- All Grades: 100.00%s\t%s\n", "%", (graph(scores.length, scores.length)));

        // System.out.println(
        // " -- Grade A:\t" + (a / (double) scores.length) * 100 + "%\t" + graph(a,
        // scores.length));
        // System.out.println(
        // " -- Grade B:\t" + (b / (double) scores.length) * 100 + "%\t" + graph(b,
        // scores.length));
        // System.out.println(
        // " -- Grade C:\t" + (c / (double) scores.length) * 100 + "%\t" + graph(c,
        // scores.length));
        // System.out.println(
        // " -- Grade D:\t" + (d / (double) scores.length) * 100 + "%\t" + graph(d,
        // scores.length));
        // System.out.println(
        // " -- Grade F:\t" + (f / (double) scores.length) * 100 + "%\t" + graph(f,
        // scores.length));
    }

    /**
     * creates a string that represents the graph of the ratio of count and total,
     * where count is the number of occurances of a given grade, and the total is
     * the total number of scores.
     * 
     * @param count the count of a certain grade
     * @param total the number of grades in total
     * @return a string rep. of the graph, using asterisks
     */
    private static String graph(int count, int total) {
        String out = "";
        double asterisks = ((count / (double) total) * 100) / 1.5; // this is completely arbitrary, just some scale...
        while (asterisks > 0) {
            out += "*";
            asterisks--;
        }

        return out;
    }
}
