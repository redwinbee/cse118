import java.util.Scanner;

public class CSE118HW02 {
    public static void main(String[] args) {
        double y0 = 90.0;
        double y1 = 0.0;
        y1 = y0;
        System.out.println("values: " + y0 + " and " + y1);

        int x0 = 99;
        int x1 = 0;
        x1 = x0 / 2;
        System.out.println("values: " + x0 + " and " + x1);

        // ---------------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 floating point numbers.");

        System.out.print("First number: ");
        double firstNum = scanner.nextDouble();

        System.out.print("Second number: ");
        double secondNum = scanner.nextDouble();

        System.out.print("Third number: ");
        double thirdNum = scanner.nextDouble();

        double sum = firstNum + secondNum + thirdNum;
        System.out.println("The sum of numbers " + firstNum + ", " + secondNum + " and " + thirdNum + " is " + sum);

        // ---------------------------------------------------------------------------

        System.out.print("Enter a value for vx: ");
        int vx = scanner.nextInt();

        System.out.print("Enter a value for vy: ");
        int vy = scanner.nextInt();

        System.out.println("You entered the following values:");
        System.out.println("vx={" + vx + "}; vy={" + vy + "}");

        // swap the values
        int temp = 0;
        temp = vx;
        vx = vy;
        vy = temp;

        System.out.println("The swapped values are:");
        System.out.println("vx={" + vx + "}; vy={" + vy + "}");

        // ---------------------------------------------------------------------------

        System.out.print("Please enter a floating point number: ");
        double x = scanner.nextDouble();
        double y = (1.0 / 2.0) * x * x * x + (1.0 / 2.0) * x * x - (5 * x) + 8;
        System.out.println("function f(x) = " + y);

        // ---------------------------------------------------------------------------

        System.out.println("Please enter 2 radius values.");

        System.out.print("r1: ");
        double r1 = scanner.nextDouble();

        System.out.print("r2: ");
        double r2 = scanner.nextDouble();

        final double PI = Math.PI;
        double r1Area = PI * r1 * r1;
        double r2Area = PI * r2 * r2;
        double r1Circumference = 2 * PI * r1;
        double r2Circumference = 2 * PI * r2;

        System.out.println("The total area of both circles is: " + (r1Area + r2Area));
        System.out.println("The total circumference of both circles is: " + (r1Circumference + r2Circumference));

        // ---------------------------------------------------------------------------

        System.out.println("Please enter a value for the circumference of a circle.");

        System.out.print("circumference: ");
        double circumference = scanner.nextDouble();

        // calculate the area of this circle
        // equation derived by solving (c = 2 * PI * r for r) and plugging the radius
        // into the equation (a = PI * r * r)
        double radius = circumference / (2 * PI);
        double area = PI * radius * radius;

        System.out.println("The area of a circle with circumference " + circumference + " is: " + area);

        scanner.close();
    }
}
