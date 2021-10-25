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

        // int n1 = rand.nextInt(36);
        int n1 = 30;
        if (n1 < 26) {
            char letter = (char) (n1 + 'A');
            System.out.println("letter: " + letter);
        } else {
            char num = (char) ('0' + (n1 - 26));
            System.out.println("num: " + num);
        }

        // --------------------------------------------------------------------

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

        int stringCmp = str1.compareTo(str2);
        switch (stringCmp) {
        case 0:
            System.out.println("[#2d1] the strings are lexicographically equal");
            break;
        case -1:
            System.out.println("[#2d1] larger: " + str2);
            System.out.println("[#2d1] smaller: " + str1);
            break;
        default:
            System.out.println("[#2d1] larger: " + str1);
            System.out.println("[#2d1] smaller: " + str2);
            break;
        }

        int stringCmpIgnCase = str1.compareToIgnoreCase(str2);
        switch (stringCmpIgnCase) {
        case 0:
            System.out.println("the strings are lexicographically equal");
            break;
        case -1:
            System.out.println("[#2d2] larger: " + str2);
            System.out.println("[#2d2] smaller: " + str1);
            break;
        default:
            System.out.println("[#2d2] larger: " + str1);
            System.out.println("[#2d2] smaller: " + str2);
        }

        System.out.println("[#2e1] str1 as upper-case: " + str1.toUpperCase());
        System.out.println("[#2f1] str2 as upper-case: " + str2.toUpperCase());

        char str1FC = str1.charAt(0);
        char str1LC = str1.charAt(str1.length() - 1);
        char str2SC = str2.charAt(1);
        char str2S2Char = str2.charAt(str2.length() - 2);
        System.out.println("[#2g1] new string: " + str1FC + str1LC + str2SC + str2S2Char);

        int idx1 = str1.indexOf(' ');
        int lastIdx1 = str1.lastIndexOf(' ');
        String str1FW = str1.substring(0, idx1);
        String str1LW = str1.substring(lastIdx1 + 1);
        int idx2 = str2.indexOf(' ');
        int lastIdx2 = str2.lastIndexOf(' ');
        String str2FW = str2.substring(0, idx2);
        String str2LW = str2.substring(lastIdx2 + 1);
    }
}
