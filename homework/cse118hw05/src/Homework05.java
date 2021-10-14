package cse118hw05.src;

import java.util.Random;
import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        int var1 = Math.abs(n1 - n2) > n1 ? n2 : n1;

        System.out.println(String.format("comparing %d and %d", n1, n2));
        System.out.println("var1: " + var1);

        // -------------------------------------------------------------

        final Random rand = new Random();
        int month = rand.nextInt(100) + 10;
        if (month >= 0 && month <= 11) {
            switch (month) {
                case 0:
                    System.out.println("january");
                    break;
                case 1:
                    System.out.println("feburary");
                    break;
                case 2:
                    System.out.println("march");
                    break;
                case 3:
                    System.out.println("april");
                    break;
                case 4:
                    System.out.println("may");
                    break;
                case 5:
                    System.out.println("june");
                    break;
                case 6:
                    System.out.println("july");
                    break;
                case 7:
                    System.out.println("august");
                    break;
                case 8:
                    System.out.println("september");
                    break;
                case 9:
                    System.out.println("october");
                    break;
                case 10:
                    System.out.println("november");
                    break;
                case 11:
                    System.out.println("december");
                    break;
            }
        } else {
            System.out.println("invalid!");
        }

        // -------------------------------------------------------------

        int n3 = rand.nextInt(10_001);
        if ((n3 % 2 == 0 && n3 % 3 == 0) || (n3 % 2 == 0 && n3 % 5 == 0) || (n3 % 3 == 0 && n3 % 5 == 0)) {
            System.out.println("n3: " + n3);
        } else {
            System.out.println("n3 = " + n3);
            System.out.println("n3 is not divisible by any pair of (2, 3, 5)");
        }

        // -------------------------------------------------------------

        int n4 = rand.nextInt();
        int n5 = rand.nextInt();
        int n6 = rand.nextInt();
        int n7 = rand.nextInt();

        int temp1 = Math.max(n4, n5);
        int temp2 = Math.max(n6, n7);
        int max = Math.max(temp1, temp2);

        System.out.println(String.format("random values: (%d, %d, %d, %d)", n4, n5, n6, n7));
        System.out.println("the max random value is: " + max);

        // -------------------------------------------------------------

        System.out.print("please enter an integer number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println("original input: " + input);

        if (input < 11) {
            input = 11;
            System.out.println("modifiying... input is now: " + input);
        } else if (input > 99) {
            input = 99;
            System.out.println("modifying... input is now: " + input);
        } else {
            System.out.println("nothing to do! input is: " + input);
        }

        scanner.close();

        // -------------------------------------------------------------

        double d1 = Math.random() * 10;
        double d2 = Math.random() * 10;

        double delta = Math.abs(d1 - d2); // method 1
        double diff = d1 > d2 ? d1 - d2 : d2 - d1; // method 2
        if (delta > 0.0000 && diff > 0.0000) {
            System.out.println("d1 and d2 are not equal!");
            System.out.println("delta: " + delta);
            System.out.println("diff : " + diff);
        } else {
            System.out.println("d1 and d2 are equal!");
        }

        // -------------------------------------------------------------

        char origin = (char) rand.nextInt(128);
        char ch = origin;
        char prev = --ch;

        if ((prev >= 'A' && prev <= 'Z') || (prev >= 'a' && prev <= 'z')) {
            System.out.println("the previous character is a letter");
        } else {
            System.out.println("the previous character is not a letter");
        }

        ch = origin;
        ch += 3;

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("the third character is a letter");
        } else {
            System.out.println("the third character is not a letter");
        }

        // -------------------------------------------------------------

        double a = Math.random() * 10;
        double b = Math.random() * 10;
        double c = Math.random() * 10;

        double sides = (a * a) + (b * b);
        double hypo = (c * c);
        if (Math.abs(sides - hypo) < 0.0000) {
            System.out.println("it's a right triangle!");
        } else {
            System.out.println("not a right triangle...");
        }
    }
}
