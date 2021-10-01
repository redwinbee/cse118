package cse118hw03.src;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter 4 integer values.");

        System.out.print("position 1: ");
        int pos1 = scanner.nextInt();
        System.out.print("position 2: ");
        int pos2 = scanner.nextInt();
        System.out.print("position 3: ");
        int pos3 = scanner.nextInt();
        System.out.print("position 4: ");
        int pos4 = scanner.nextInt();

        System.out.println("pos1 = " + pos1 + "; pos2 = " + pos2 + "; pos3 = " + pos3 + "; pos4 = " + pos4);

        int temp1 = pos1;
        int temp2 = pos2;
        int temp3 = pos3;
        int temp4 = pos4;

        pos1 = temp2;
        pos2 = temp3;
        pos3 = temp4;
        pos4 = temp1;

        System.out.println("values after left shift:");
        System.out.println("pos1 = " + pos1 + "; pos2 = " + pos2 + "; pos3 = " + pos3 + "; pos4 = " + pos4);

        pos1 = temp1;
        pos2 = temp2;
        pos3 = temp3;
        pos4 = temp4;

        System.out.println("values after right shift:");
        System.out.println("pos1 = " + pos1 + "; pos2 = " + pos2 + "; pos3 = " + pos3 + "; pos4 = " + pos4);

        // --------------------------------------------------------------------

        System.out.println("please enter 4 integer numbers to calculate the average for.");

        System.out.print("number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("number 3: ");
        int num3 = scanner.nextInt();
        System.out.print("number 4: ");
        int num4 = scanner.nextInt();

        double average = (num1 + num2 + num3 + num4) / 4.0;
        System.out.println("the average of " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + " is: " + average);

        // --------------------------------------------------------------------

        System.out.print("please enter a floating point number: ");
        double input = scanner.nextDouble();

        double inputDoublePart = input % 1.0;
        int inputIntPart = (int) (input - inputDoublePart);

        System.out.println("(input) int part: " + inputIntPart);
        System.out.println("(input) double part: " + inputDoublePart);

        // --------------------------------------------------------------------

        System.out.print("please enter a decimal number: ");
        double someDecimal = scanner.nextDouble();
        double somePercentage = someDecimal * 100;
        System.out.println(someDecimal + " as a percentage is: " + somePercentage + "%");

        // --------------------------------------------------------------------

        System.out.print("please enter a distance in millimeters: ");
        int millisInput = scanner.nextInt();

        int meters = millisInput / 1000;
        int centimeters = (millisInput - (meters * 1000)) / 100;
        int millimeters = millisInput - ((meters * 1000) + centimeters * 100);

        System.out.println(millisInput + " millimeters is " + meters + " meters, " + centimeters + " centimeters, and "
                + millimeters + " millimeters.");

        // --------------------------------------------------------------------

        System.out.print("please enter a 3-digit integer number: ");
        int numInput = scanner.nextInt();

        int hundreds = numInput / 100;
        int tens = (numInput - (hundreds * 100)) / 10;
        int ones = numInput - ((hundreds * 100) + tens * 10);
        int added = hundreds + tens + ones;

        System.out.println(hundreds + " + " + tens + " + " + ones + " = " + added);

        scanner.close();
    }
}
