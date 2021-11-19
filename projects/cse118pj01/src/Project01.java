package cse118pj01.src;

import java.util.Scanner;

public class Project01 {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        System.out.print("enter a year: ");
        int year = Integer.parseInt(scan.nextLine());
        System.out.print("enter the first weekday of the year: ");
        int firstDay = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= 11; i++) {
            printCalendarTemplate(i, year);
            System.out.println();
            System.out.println();
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
    }

    /**
     * gets the name of the month based on the given index
     * 
     * @param monthIdx the month index
     * @return the name of the month
     */
    public static String getMonth(int monthIdx) {
        String month = new String();
        switch (monthIdx) {
        case 0:
            month = "January";
            break;
        case 1:
            month = "Feburary";
            break;
        case 2:
            month = "March";
            break;
        case 3:
            month = "April";
            break;
        case 4:
            month = "May";
            break;
        case 5:
            month = "June";
            break;
        case 6:
            month = "July";
            break;
        case 7:
            month = "August";
            break;
        case 8:
            month = "September";
            break;
        case 9:
            month = "October";
            break;
        case 10:
            month = "November";
            break;
        case 11:
            month = "December";
            break;
        }

        return month;
    }

    /**
     * gets the name of the day based on the given index
     * 
     * @param dayIdx the day index
     * @return the name of the day
     */
    public static String getDay(int dayIdx) {
        String day = new String();
        switch (dayIdx) {
        case 0:
            day = "Sun";
            break;
        case 1:
            day = "Mon";
            break;
        case 2:
            day = "Tue";
            break;
        case 3:
            day = "Wed";
            break;
        case 4:
            day = "Thur";
            break;
        case 5:
            day = "Fri";
            break;
        case 6:
            day = "Sat";
            break;
        }

        return day;
    }

    /**
     * gets the number of days in a given month where the month is provided as an
     * index starting from 0
     * 
     * @param monthIdx the month
     * @return how many days in the given month
     */
    public static int daysInMonth(int monthIdx) {
        int days = 0;
        switch (monthIdx) {
        case 0: // january
            days = 31;
            break;
        case 1: // feburary
            days = 28;
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
