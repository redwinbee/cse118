package cse118hw08.src;

import java.util.Random;
import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final Random rand = new Random();

        System.out.println("[q1] 100 random numbers:");
        int evens = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            int rn = rand.nextInt(100) + 1;
            System.out.printf("%d\t", rn);
            sum += rn;

            if (rn % 2 == 0) {
                evens++;
            }

            if (i % 10 == 0) {
                System.out.println();
            }
        }
        double average = sum / 100.0;
        System.out.println("[q1] evens: " + evens);
        System.out.println("[q1] odds: " + Math.abs(evens - 100));
        System.out.println("[q1] sum: " + sum);
        System.out.println("[q1] average: " + average);

        // -------------------------------------------------------------

    }
}
