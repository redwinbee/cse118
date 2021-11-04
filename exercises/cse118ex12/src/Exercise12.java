package cse118ex12.src;

public class Exercise12 {
    public static void main(String[] args) {
        // all parts of the for loop are optional
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Welcome to Java!");
        }

        // sum the numbers from 1..n
        int n = (int) (Math.random() * 100);
        int sum;
        for (i = 1, sum = 0; i <= n; i++) {
            sum += i;
        }
        System.out.printf("summation of 1..%d is = %d\n", n, sum);

        /**
         * create a solution to the solve the problem of predicting tuition at a given
         * school where the tuition increases 7% ever year starting at $10,000. In how
         * many years will the tuition have doubled?
         */
        double tuition = 10_000;
        int year;
        for (year = 0; (tuition <= 20_000); year++) {
            tuition *= 1.07;
            System.out.printf("[year %d] tuition: %f\n", year, tuition);
        }
        System.out.println("the tuition will have doubled by year " + year);

        /**
         * find the greatest common divisor for two given numbers. Note that this
         * solution isn't very efficient.
         */
        int j = (int) (Math.random() * 100);
        int k = (int) (Math.random() * 100);
        int gcd = 1;
        for (i = 2; i <= Math.min(j, k); i++) {
            if (j % i == 0 && k % i == 0) {
                gcd = i;
            }
        }
        System.out.printf("gcd of (%d, %d) is %d\n", j, k, gcd);

        /** print all the numbers from 1..rn and add a new line every 10 numbers */
        int rn = (int) (Math.random() * 100);
        for (i = 0; i <= rn; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%d\t", i);
        }
        System.out.println();
        System.out.println();

        /**
         * generate numbers from 1..rn and generate a random number for rn-many times
         * then calculate the min and max of those numbers. All while following the same
         * spacing as before; newline after every 10 numbers.
         * 
         * note: the min initial value was set to the (upper-bounds + 1) and the max
         * value was set to the (lower-bounds - 1), this way we ensure that both
         * variables are GUARANTEED to be updated at least 1 time because there is a
         * non-zero chance the inital value we choose for the variables won't allow the
         * if statements to update their values
         */
        rn = (int) (Math.random() * 100);
        int min = 100;
        int max = -1;
        for (i = 0; i <= rn; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            int next = (int) (Math.random() * 100);
            System.out.printf("%d\t", next);

            if (next < min) {
                min = next;
            }
            if (next > max) {
                max = next;
            }
        }
        System.out.println();
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
