package cse118ex07.src;

import java.util.Random;
import java.util.Scanner;

public class Exercise07 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // even number between [-100,100]
        Random rand = new Random();
        int evenNum = (rand.nextInt(201) - 100) * 2;

        // --------------------------------------------------------------

        int weekday = rand.nextInt(7);
        switch (weekday) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 0:
                System.out.println("weekend");
                break;
        }

        // --------------------------------------------------------------

        System.out.println("please enter a year:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt() % 12;
        switch (year) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
        }

        scanner.close();

        // --------------------------------------------------------------

        // conditional assignment operator
        int someN = rand.nextInt();
        int y = (someN > 0) ? 1 : ((someN < 0) ? y = -1 : 0);
    }
}
