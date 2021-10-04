package cse118hw04.src;

import java.util.Random;

public class Homework04 {
    public static void main(String[] args) {
        final double PI = 3.14159265;
        double step1 = ((PI * (10_000)) + 0.5); // 31416.426500
        double step2 = (int) step1; // 31416
        double rounded = step2 / 10_000.0; // 3.1416

        System.out.println("PI rounded off is: " + rounded);

        // ------------------------------------------------------------

        double runHours = 1 + (21.0 / 60) + (34.0 / 3600); // for 20 miles
        double kilom = 20.0 / 1.6;
        double avgSpeed = kilom / runHours;

        System.out.println("the average speed of the runner is: " + avgSpeed + " kph");

        // ------------------------------------------------------------

        Random rand = new Random();
        int from0To200 = rand.nextInt(201);
        int from0To80 = rand.nextInt(81);
        int fromN10To10 = rand.nextInt(11) - 10;
        double from10To99 = rand.nextDouble(100.0) + 10.0;

        System.out.println("rand [0, 200] = " + from0To200);
        System.out.println("rand [0, 80] = " + from0To80);
        System.out.println("rand [-10, 10] = " + fromN10To10);
        System.out.println("rand [10.0, 99.0] = " + from10To99);

        // ------------------------------------------------------------

        int someN = rand.nextInt(1000) + 100;

        if (someN % 2 == 0) {
            System.out.println(someN + " is an even number");
        } else {
            System.out.println(someN + " is an odd number");
        }

        boolean divisBy7And11 = (someN % 7 == 0) && (someN % 11 == 0);
        boolean divisBy9Or13 = (someN % 9 == 0) || (someN % 13 == 0);
        boolean divisBy5Or12Ex = (someN % 5 == 0) ^ (someN % 12 == 0);

        System.out.println("is " + someN + " divisible by both 7 and 11? " + divisBy7And11);
        System.out.println("is " + someN + " divisible by either 9 or 13? " + divisBy9Or13);
        System.out.println("is " + someN + " divisible by either 5 or 12 but not both? " + divisBy5Or12Ex);

        // ------------------------------------------------------------
    }
}
