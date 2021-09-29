import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final double PI = 3.141592;

        System.out.print("enter a radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        // ensure the radius is greater than zero
        if (radius >= 0) {
            double area = radius * radius * PI;
            System.out.println("the area of the circle with radius " + radius + " is " + area + ".");
        } else {
            System.out.println("the radius should be positive!");
        }

        scanner.close();
    }
}
