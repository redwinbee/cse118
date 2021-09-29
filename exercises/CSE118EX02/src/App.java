import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celcius = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.println(fahrenheit + " degrees fahrenheit is " + celcius + " degrees celcius.");

        scanner.close();
    }
}
