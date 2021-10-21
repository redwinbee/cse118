package cse118ex10.src;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("please enter a string: ");
        String s1 = scanner.next();
        char s1First = s1.charAt(0);
        char s1SecondFromLast = s1.charAt(s1.length() - 2);
        String s1New = "" + s1First + s1SecondFromLast;

        System.out.println("s1: " + s1);
        System.out.println("s1New: " + s1New);

        // ----------------------------------------------------

        String s2 = new String("abcde");
        String s3 = new String("1234567");
        System.out.println("is s2 > s3 ? " + (s2.compareTo(s3) > s3.compareTo(s2)));

        // ----------------------------------------------------

        String welcome = new String("Welcome to Java World");
        String fromToToEnd = welcome.substring(8);
        String theWordTo = welcome.substring(8, 10);
        System.out.println("welcome:" + welcome);
        System.out.println("theWordTo: " + theWordTo);
        System.out.println("fromToToEnd: " + fromToToEnd);

        // search for char 'a'
        int idx1 = welcome.indexOf('a');
        if (idx1 > 0) {
            System.out.println("letter 'a' is at index: " + idx1);
        }

        // search for char 'a' starting from the end
        int idx2 = welcome.lastIndexOf('a');
        switch (idx2) {
        case -1:
            System.out.println("letter 'a' (from end) couldn't be found");
            break;
        default:
            System.out.println("letter 'a' (from end) is at index: " + idx2);
        }

        // search for string "world"
        int idx3 = welcome.indexOf("World");
        switch (idx3) {
        case -1:
            System.out.println("word 'World' couldn't be found");
            break;
        default:
            System.out.println("word 'World is at index: " + idx3);
        }

        // extract letters from 8-10
        String substr = welcome.substring(8, 10);
        System.out.println("substr: " + substr);

        // extract the first word from a string
        int idx = welcome.indexOf(' ');
        String firstWord = welcome.substring(0, idx);
        System.out.println("the first word from the welcome string is: " + firstWord);

        // extract the last word from a string
        int idxLast = welcome.lastIndexOf(' ');
        String lastWord = welcome.substring(idxLast + 1); // adding 1 removes the whitespace before the letter
        System.out.println("the last word from the welcome string is: " + lastWord);

        // ----------------------------------------------------

        // %d represents integer numbers: byte, short, int, long
        // %f represents floating-point numbers: float, double
        // %c represents characters
        // %s represents strings
        int x = (int) (Math.random() * 100);
        double y = Math.random() * 100;
        char z = 'A';
        String a = new String("hello!");
        System.out.printf("the x-value is %d, y-value is %f, z-value is %c, a-value is %s\n", x, y, z, a);

        // \t is a control character for tabs
        // \n is a control character for new lines
        System.out.printf("\t%d\t%d\t%d\t%d\n", x, x, x, x);

        /**
         * we're telling java with the %12.3f syntax that we want 12 spaces before the
         * number and that we only care about 3 decimal places (which means java will
         * round the number)
         * 
         * similarly %-12.3f will align the floating point number to the left and also
         * round the number to 3 decimal places
         */
        double d1 = 2.3456;
        System.out.printf("[%12.3f]\t [%-12.3f]\n", d1, d1);

        scanner.close();
    }
}
