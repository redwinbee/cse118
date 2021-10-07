package cse118hw04.src;

import java.util.Random;

public class Homework04 {
    public static void main(String[] args) {
        double step1 = ((Math.PI * (10_000)) + 0.5); // 31416.426500
        double step2 = (int) step1; // 31416
        double rounded = step2 / 10_000.0; // 3.1416

        System.out.println("PI rounded off is: " + rounded);

        // ------------------------------------------------------------

        double runHours = 1 + (21 / 60.0) + (34 / 3600.0); // for 20 miles
        double kilom = 20.0 / 1.6;
        double avgSpeed = kilom / runHours;

        System.out.println("the average speed of the runner is: " + avgSpeed + " kph");

        // ------------------------------------------------------------

        Random rand = new Random();
        int from0To200 = rand.nextInt(201);
        int from0To80 = rand.nextInt(81);
        int fromN10To10 = rand.nextInt(21) - 10;
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

        int season = rand.nextInt(13);
        switch (season) {
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
        }

        // ------------------------------------------------------------

        int x = rand.nextInt(89) + 10;
        int tens = x / 10;
        int ones = x % 10;

        if (tens < ones) {
            int y = (ones * 10) + tens;
            System.out.println("old: " + x);
            System.out.println("new: " + y);
        } else {
            System.out.println("no change, original num: " + x);
        }

        // ------------------------------------------------------------

        int f = rand.nextInt(8999) + 1000; // [1000, 9999] (only even)
        int thousandth = f / 1000;
        int hundredth = f / 100 % 10;
        int tenth = f % 100 / 10;
        int oness = f % 1000 % 10;

        int lessFive = 0;
        int moreFive = 0;
        if (thousandth < 5) {
            lessFive++;
        } else {
            moreFive++;
        }

        if (hundredth < 5) {
            lessFive++;
        } else {
            moreFive++;
        }

        if (tenth < 5) {
            lessFive++;
        } else {
            moreFive++;
        }

        if (oness < 5) {
            lessFive++;
        } else {
            moreFive++;
        }

        System.out.println("num: " + f);
        System.out.println(
                "there are " + lessFive + " digit(s) less than 5 and " + moreFive + " digit(s) greater than 5.");

        // ------------------------------------------------------------

        int px = rand.nextInt(21) - 10;
        int py = rand.nextInt(21) - 10;

        System.out.println("chosen point: (" + px + ", " + py + ")");

        if (px == 0 && py == 0) {
            System.out.println("point is on the origin.");
        } else if (px == 0) {
            System.out.println("point is on the y-axis");
        } else if (py == 0) {
            System.out.println("point is on the x-axis");
        } else {
            // now we determine in which quadrant our point lies
            if (px > 0) {
                if (py > 0) {
                    System.out.println("point is in quadrant 1");
                } else {
                    System.out.println("point is in qudrant 4");
                }
            } else {
                if (py > 0) {
                    System.out.println("point is in quadrant 2");
                } else {
                    System.out.println("point is in qudrant 3");
                }
            }
        }
    }
}
