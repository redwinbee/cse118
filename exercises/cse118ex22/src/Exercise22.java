package cse118ex22.src;

public class Exercise22 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        char[][] scores = {
                { 'A', 'C', 'D', 'A' },
                { 'C', 'D', 'B', 'F' },
                { 'B', 'F', 'A', 'C' }
        };
        char[] key = { 'A', 'B', 'C', 'D' };
        int[] grades = gradeTest(scores, key);

        // ========================================

    }

    /**
     * grades a 2D array of scores for a group of students using the provided key
     * 
     * @param scores the scores to grade
     * @param key    the answer key
     * @return the list of students and their grades
     */
    public static int[] gradeTest(char[][] scores, char[] key) {
        int[] grades = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; i < key.length; j++) {
                if (scores[i][j] == key[j]) {
                    grades[i] += 1;
                }
            }
        }

        return grades;
    }

    /**
     * calculates the shortest possible distance between any two ordered pairs in a
     * grid
     * 
     * @param points the ordered pairs
     * @return the ordered pair and the distance
     */
    public static double[] findNearestPoints(double[][] points) {
        double minDistance = Double.MAX_VALUE;
        int minX = 0;
        int minY = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; i < points.length; j++) {
                double dist = findDistance(points[i], points[j]);
                if (dist < minDistance) {
                    minDistance = dist;
                    minX = i;
                    minY = j;
                }
            }
        }

        return new double[] { minX, minY, Math.sqrt(minDistance) };
    }

    /**
     * calculate the distance between two ordered pairs using the standard distance
     * formula, with a small twist. the actual distance formula has us take the
     * square root after everything to find the exact distance, but we only care
     * about which one is larger, and since (d1^2 > d2^2) == (d1 > d2) we can just
     * omit the Math.sqrt() and work with the squared numbers instead since it's
     * telling us the same thing.
     * 
     * @param p1 the first ordered pair
     * @param p2 the second ordered pair
     * @return the distance between the ordered pairs
     */
    public static double findDistance(double[] p1, double[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + ((p1[1] - p2[1]) * (p1[1] - p2[1]));
    }
}
