package cse118hw06.src;

import java.util.Random;
import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        final Random rand = new Random();
        final Scanner scan = new Scanner(System.in);

        char letterLower = (char) (rand.nextInt(26) + 'a');
        System.out.println("[#1a] random lower-case letter: " + letterLower);

        char digitChar = (char) (rand.nextInt(9) + '0');
        System.out.println("[#1b] random digit char: " + digitChar);

        // TODO: last part

        // --------------------------------------------------

        System.out.print("[#2] type a sentence: ");
        String str1 = scan.nextLine();
        System.out.print("[#2] type another sentence: ");
        String str2 = scan.nextLine();

        System.out.printf("[#2a] length={str1: %d chars, str2: %d chars}\n", str1.length(), str2.length());

        System.out.printf("[#2b] firstChars={str1: %c, str2: %c}\n", str1.charAt(0), str2.charAt(0));
        System.out.printf("[#2b] lastChars={str1: %c, str2: %c}\n", str1.charAt(str1.length() - 1),
                str2.charAt(str2.length() - 1));

        System.out.printf("[#2c1] str1 and str2 are %s\n", (str1.equals(str2) ? "equal" : "not equal"));
        System.out.printf("[#2c2] str1 and str2 are %s\n", (str1.equalsIgnoreCase(str2) ? "equal" : "not equal"));

    }
}
