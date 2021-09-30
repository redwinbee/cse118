package cse118ex01.src;

import java.util.Scanner;

public class Exercise01 {
    @SuppressWarnings("unused") // examples aren't used anywhere
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // exercise #1
        // store and display integer and floating point numbers
        System.out.print("Enter an integer number: ");
        int x = scanner.nextInt();
        System.out.println("integer: " + x);

        System.out.print("Enter a double number: ");
        double y = scanner.nextDouble();
        System.out.println("double: " + y);

        // exercise #2
        // calculate the area of a rectangle
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.print("The area of the rectangle is: " + area + "\n");

        scanner.close();
        // ----------------------------------------------------------------------------------------------

        // java will convert numbers implicitly
        System.out.println("int: " + 1 / 3);
        System.out.println("double(implicit): " + 1.0 / 3);
        System.out.print("double: " + 1.0 / 3.0 + "\n");
        // or can be explicitly converted
        int a = 1;
        double b = (double) a;

        // calculations can change based on what java is doing
        // 1) variable g will truncate 1.5 to 1 which evaluates the rest to 5*1=1
        // 2) variable f will not truncate 1.5 to 1 which evaluates the rest to
        // 5*1.5=5.5
        int g = 5 * (3 / 2); // = 5
        double f = 5 * (3.0 / 2.0); // = 5.5

        // ----------------------------------------------------------------------------------------------
    }
}
