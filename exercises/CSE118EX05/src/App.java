import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two numbers: ");
        System.out.print("First num: ");
        int num1 = scanner.nextInt();
        System.out.print("Second num: ");
        int num2 = scanner.nextInt();

        int result = num1 + num2;
        System.out.println("What is " + num1 + " + " + num2 + " = ?");
        int input = scanner.nextInt();

        // check if the user entered the correct value
        if (result == input) {
            System.out.println("That's correct!");
        } else {
            System.out.println("Sorry! That's not right...");
        }

        // --------------------------------------------------------------

        System.out.print("Enter a score to calculate the letter grade for: ");
        double score = scanner.nextDouble();

        if (score >= 90.0) {
            System.out.println("A");
        } else if (score >= 80.0) {
            System.out.println("B");
        } else if (score >= 70.0) {
            System.out.println("C");
        } else if (score >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // --------------------------------------------------------------

        System.out.print("Please enter a BMI: ");
        double bmi = scanner.nextDouble();

        if (bmi >= 30.0) {
            System.out.println("Obese");
        } else if (bmi >= 25.0) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }

        scanner.close();
    }
}
