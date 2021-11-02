package cs118ts01.src;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("[#1a] enter two double values");
        System.out.print("[#1a] x: ");
        double x = scan.nextDouble();
        System.out.print("[#1a] y: ");
        double y = scan.nextDouble();
        System.out.printf("[#1a] x=[%f], y=[%f]\n", x, y);

        double delta = (x > y) ? x - y : y - x;
        if (delta < 0.000) {
            System.out.println("[#1b] x and y are equal");
        } else {
            // todo: fix
            double temp = 0.0;
            if (x < y) {
                temp = x;
                x = y;
                y = temp;
            } else {
                temp = y;
                x = y;
                y = temp;
            }
            System.out.printf("[#1b] x=[%f], y=[%f]\n", x, y);
        }

        double z = ((2.0 / 3.0) * x * x) + ((3.0 / 4.0) * x * y) - ((4.0 / 5.0) * y * y);
        System.out.printf("[#1c] f(%f, %f) = %f", x, y, z);

        int w = (int) z;
        System.out.printf("[#1d] w=[%d]\n", w);

        // -----------------------------------------------------

        Random rand = new Random();
        int vx = rand.nextInt(100) + 1;
        int vy = rand.nextInt(100) + 1;
        int vz = rand.nextInt(100) + 1;
        System.out.printf("[#2a] vx=[%d], vy=[%d], vz=[%d]\n", vx, vy, vz);

        double average = (vx + vy + vz) / 3.0;
        System.out.println("[#2b] average of vx, vy and vz is " + average);

        System.out.printf("[#2c] vx is %s divisible by 7 or 9\n", (vx % 7 == 0 || vx % 9 == 0) ? "is" : "is not");

        boolean vyDivisBy5 = vy % 5 == 0;
        boolean vzDivisBy5 = vz % 5 == 0;
        System.out.printf("[#2d] vy and vz %s exclusively divisible by 5\n",
                (vyDivisBy5 ^ vzDivisBy5) ? "are" : "are not");

        // -----------------------------------------------------

        System.out.print("[#3a] enter an integer number (ounces): ");
        int input = scan.nextInt();

        int pounds = input / 16;
        int ounces = (pounds * 16) > input ? (pounds * 16) - input : input - (pounds * 16);
        System.out.printf("[#3b] %d ounces is: %d pound(s) and %d ounce(s)\n", input, pounds, ounces);

        double poundsExact = input / 16.0;
        double poundsTrunc = (((poundsExact * 100) + 0.5) / 100.0);
        System.out.printf("[#3c] %d ounces is: %.2f\n", input, poundsTrunc);

        // -----------------------------------------------------

        int rand1 = rand.nextInt(10_000) + 1_000;
        System.out.println("[#4a] rand 4-digit num: " + rand1);

        int thousandth = rand1 / 1_000;
        int hundredth = (rand1 % 1_000) / 100;
        int tenth = (rand1 % 100) / 10;
        int ones = rand1 - ((thousandth * 1_000) + (hundredth * 100) + (tenth * 10));
        System.out.printf("[#4b] the digits from %d are: [%d, %d, %d, %d]\n", rand1, thousandth, hundredth, tenth,
                ones);

        int oddCount = 0;
        if (thousandth % 2 != 0) {
            oddCount++;
        }
        if (hundredth % 2 != 0) {
            oddCount++;
        }
        if (tenth % 2 != 0) {
            oddCount++;
        }
        if (ones % 2 != 0) {
            oddCount++;
        }
        int evenCount = (oddCount - 4) < 0 ? 4 - oddCount : oddCount - 4;
        System.out.printf("[#4c] there are %d odd digit(s) and %d even digit(s)\n", oddCount, evenCount);

        if (thousandth == ones) {
            if (hundredth == tenth) {
                System.out.println("[#4d] this number is a palindrome");
            } else {
                System.out.println("[#4] this number is not a palindrome");
            }
        } else {
            System.out.println("[#4] this number is not a palindrome");
        }

        // -----------------------------------------------------

        char ch1 = (char) (rand.nextInt(27) + 'A');
        System.out.printf("[#5a] random char: [char=%c, ascii=%d]\n", ch1, (int) ch1);

        char ch1Fifth = (char) (ch1 + 5);
        System.out.printf("[#5b] 5th char from ch1: [char:%c, ascii=%d]\n", ch1Fifth, (int) ch1Fifth);
        System.out.printf("[#5b] this char %s\n",
                (ch1Fifth >= 'A' && ch1Fifth <= 'Z') ? "is a letter" : "is not a letter");

        // -----------------------------------------------------

        System.out.println("[#6a] type in a string (minimum 3 words):");
        // String inputStr = scan.nextLine();
        /**
         * for some reason the program isn't letting me enter a string when I use
         * scan.nextLine() so I hardcoded a string instead. I don't know why it's doing
         * that
         */
        String inputStr = new String();
        inputStr = "The quick brown fox";

        System.out.println("[#6b2] length: " + inputStr.length() + " chars");
        System.out.println("[#6b3] first-char: " + inputStr.charAt(0));
        System.out.println("[#6b4] last-char: " + inputStr.charAt(inputStr.length() - 1));

        int delF = inputStr.indexOf(' ');
        int delL = inputStr.lastIndexOf(' ');
        String firstWord = inputStr.substring(0, delF);
        String lastWord = inputStr.substring(delL + 1, inputStr.length());
        System.out.println("[#6c1] first-word: " + firstWord);
        System.out.println("[#6c2] last-word: " + lastWord);

        System.out.printf("[#6d1] the first and last words are %s\n",
                (firstWord.equals(lastWord) ? "the same" : "not the same"));

        scan.close();
        // -----------------------------------------------------

    }
}
