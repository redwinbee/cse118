package cse118ex15.src;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        System.out.println("enter two numbers to compare");

        System.out.print("enter num1: ");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.print("enter num2: ");
        int num2 = Integer.parseInt(scan.nextLine());

        String result = toText(compareTo(num1, num2));
        System.out.println("num1 is " + result + " num2");

        // ---------------------------------------------------

        System.out.println("enter a hexadecimal number (without 0x) to convert");
        String hexa = scan.nextLine();
        int dec = convertHexToDec(hexa);
        System.out.println("decimal num is: " + dec);

        scan.close();
    }

    /**
     * convert a hexadecimal string to its decimal number representation
     * 
     * @param hexa the hexadecimal string
     * @return the number representation of the hexadecimal string
     */
    public static int convertHexToDec(String hexa) {
        int dec = 0;
        for (int i = 0; i < hexa.length(); i++) {
            char ch = hexa.charAt(i);
            if (ch >= '0' && ch <= '9') {
                dec = dec * 16 + convertCharToNum(hexa.charAt(i));
            } else {
                dec = dec * 16 + convertCharToNum(hexa.charAt(i));
            }
        }

        return dec;
    }

    /**
     * convert a single hexadecimal char to a number
     * 
     * @param ch the hexadecimal char
     * @return the integer equivalant
     */
    public static int convertCharToNum(char ch) {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else {
            return ch - 'A' + 10;
        }
    }

    /**
     * converts a comparison of two numnbers result to text format
     * 
     * @param compareResult the result of a comparison
     * @return the textual representation of the comparison result
     */
    public static String toText(int compareResult) {
        String text = "";
        switch (compareResult) {
        case 0:
            text = "equal to";
            break;
        case 1:
            text = "greater than";
            break;
        case -1:
            text = "less than";
        }

        return text;
    }

    /**
     * compares two numbers with each other
     * 
     * @param num1 the first number
     * @param num2 the second number
     * @return 0 if the numbers are equal, 1 if num1 is greater than num2, -1 if
     *         num1 is less than num2
     */
    public static int compareTo(int num1, int num2) {
        int result = 0;
        if (num1 > num2) {
            result = 1;
        } else if (num1 < num2) {
            result = -1;
        } else {
            result = 0;
        }

        return result;
    }
}
