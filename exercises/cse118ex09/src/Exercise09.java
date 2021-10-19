package cse118ex09.src;

import java.util.Random;

public class Exercise09 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Random rand = new Random();
        char randUpperCh = (char) (rand.nextInt(26) + 65);
        char randUpperChMethod2 = (char) (rand.nextInt(26) + 'A');
        char randDigit = (char) (rand.nextInt(10) + 48);

        // randomly generate a letter
        // TODO: fix
        char newCh = 0;
        char n1 = (char) (rand.nextInt(52) + 'a');
        if (n1 < 26) {
            newCh = (char) (n1 + 'A');
        } else {
            newCh = (char) ((n1 - 26) + 'a');
        }

        // randomly generate a letter or digit
        // TODO: fix
        char newChOrDig = 0;
        char n2 = (char) (rand.nextInt(62) + 'a');
        if (n2 < 26) {
            newChOrDig = (char) (n2 + 'A');
        } else if (n2 < 52) {
            newChOrDig = (char) ('a' + (n2 - 26));
        } else {
            newChOrDig = (char) ('0' + (n2 - 52));
        }

        // ----------------------------------------------

        String s1 = "ABCD";
        String s2 = new String("abcde");

        int len = s1.length(); // internal array size
        int first = s1.charAt(0); // first char at array index 0
        int last = s1.charAt(s1.length() - 1); // last char in the s1 char array

        /**
         * will create a new string object called s3 with the values of s1 as lower
         * case. this will preserve the original string, s1, as java strings cannot be
         * changed once defined (immutable)
         */
        String s3 = s1.toLowerCase();

        /**
         * will work just fine, but note that we're assigning s1 to a NEW instance will
         * the values of s1 lower-cased. This also means the original s1 reference is
         * lost forever so the java garbage collector will clean up the memory.
         */
        s1 = s1.toLowerCase();

        /**
         * == will do reference equality so the two values will be NOT equal and returns
         * false where as the .equals() method will do content equality so it WILL be
         * equal.
         */
        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println("s4 == s5 is " + s4 == s5);
        System.out.println("s4.equals(s5) is " + s4.equals(s5));
    }
}
