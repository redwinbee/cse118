package cse118qz01.src;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        final double PI = 3.141592;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer number: ");
        int x = scanner.nextInt();
        System.out.print("Please enter a double-floating point number: ");
        double y = scanner.nextDouble();
        double z = (1.0 / 3.0) * x + (1.0 / 2.0) * y;

        System.out.println("x is " + x + ", y is " + y + ", z is " + z);

        // ------------------------------------------------------------

        System.out.print("Please enter the first radius value: ");
        double r1 = scanner.nextDouble();
        System.out.print("Please enter the second radius value: ");
        double r2 = scanner.nextDouble();

        double area2 = PI * r2 * r2;
        double area1 = area2 + (PI * r1 * r1);

        System.out.println("The outer-radius and inner-radius of the rings are [" + area1 + ", " + area2 + "]");

        scanner.close();
    }
}
