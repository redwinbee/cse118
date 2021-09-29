import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Convert inches to feet");
        System.out.print("Enter the inches: ");

        Scanner scanner = new Scanner(System.in);
        int inches = scanner.nextInt();
        int feet = inches / 12;
        int remainder = inches % 12;

        System.out.println("There are " + feet + " feet and " + remainder + " inch(es) in " + inches + " inches.");

        // -------------------------------------------------------

        System.out.println("Reverse the number");
        System.out.print("Enter a number: ");

        int x = scanner.nextInt();
        int first = x / 100;
        int second = (x / 10) % 10;
        int third = x % 10;
        int y = (third * 100) + (second * 10) + first;

        System.out.println("The reversed number is " + y);

        scanner.close();
    }
}
