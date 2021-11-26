package cse118ex16.src;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("enter two numbers to compare: ");
        System.out.printf("num1: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.printf("num2: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("the greater number is: " + max(num1, num2));

        scanner.close();
    }

    // method overloading:
    // creating two or more methods with the same name but different parameters

    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }
}
