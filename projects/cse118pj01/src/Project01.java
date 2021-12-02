package cse118pj01.src;

import java.util.Scanner;

public class Project01 {
    private static final String[] months = { "January", "Feburary", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };

    private static final String[] days = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        System.out.print("enter a year: ");
        int year = Integer.parseInt(scan.nextLine());
        System.out.print("enter the first weekday of the year: ");
        int skips = Integer.parseInt(scan.nextLine());

        int count = 1;
        for (int i = 0; i <= 11; i++) {
            printCalendarTemplate(i, year);
            count = 1;
            for (int j = 0; j < skips; j++) {
                System.out.printf("\t");
                count++;
            }
            for (int k = 1; k <= daysInMonth(i, year); k++) {
                System.out.printf("%d\t", k);
                if (count % 7 == 0) {
                    System.out.println();
                }
                count++;
            }
            System.out.println();

            /**
             * take the modulus of the count with the offset substracted, use that for the
             * skips needed for the next month, however, if the nuber is divisible by 7, we
             * know how many weeks have passed which also means we know the day we landed
             * on, just add 1 back to the offset
             */
            skips = (count % 7 != 0) ? Math.abs((count % 7) - 1) : (count / 7) + 1;
        }

        scan.close();
    }

    /**
     * prints the overall template of any given month
     * 
     * @param monthIdx the month to print
     * @param year     the year to print
     */
    public static void printCalendarTemplate(int monthIdx, int year) {
        System.out.printf("\t\t  %s %d\n", getMonth(monthIdx), year);
        for (int i = 0; i < 50; i++) {
            System.out.printf("\u0336"); // "combining long stroke overlay"
        }
        System.out.println();
        for (int i = 0; i <= 6; i++) {
            System.out.printf("%s\t", getDay(i));
        }
        System.out.println();
    }

    /**
     * gets the name of the month based on the given index
     * 
     * @param monthIdx the month index
     * @return the name of the month
     */
    public static String getMonth(int monthIdx) {
        return months[monthIdx];
    }

    /**
     * gets the name of the day based on the given index
     * 
     * @param dayIdx the day index
     * @return the name of the day
     */
    public static String getDay(int dayIdx) {
        return days[dayIdx];
    }

    /**
     * gets the number of days in a given month where the month is provided as an
     * index starting from 0
     * 
     * @param monthIdx the month
     * @param year     the year (in-case we're dealing with leap-years)
     * @return how many days in the given month
     */
    public static int daysInMonth(int monthIdx, int year) {
        int days = 0;
        switch (monthIdx) {
            case 0: // january
                days = 31;
                break;
            case 1: // feburary
                days = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? 29 : 28;
                break;
            case 2: // march
                days = 31;
                break;
            case 3: // april
                days = 30;
                break;
            case 4: // may
                days = 31;
                break;
            case 5: // june
                days = 30;
                break;
            case 6: // july
                days = 31;
                break;
            case 7: // august
                days = 31;
                break;
            case 8: // september
                days = 30;
                break;
            case 9: // october
                days = 31;
                break;
            case 10: // november
                days = 30;
                break;
            case 11:
                days = 31;
                break;
        }

        return days;
    }
}
