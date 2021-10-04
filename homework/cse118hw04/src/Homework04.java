package cse118hw04.src;

public class Homework04 {
    public static void main(String[] args) {
        final double PI = 3.14159265;
        double step1 = ((PI * (10_000)) + 0.5); // 31416.xxxxx
        double step2 = (int) step1; // 31416
        double rounded = step2 / 10_000.0; // 3.1416

        System.out.println("PI rounded off is: " + rounded);

        // ------------------------------------------------------------

    }
}
