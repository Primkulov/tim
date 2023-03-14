package SwitchStatement;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        /*
        using Switch statement
        if day  = 1,2,3,4,5 > weekday
        if days 6,7 >>>>weekend
        else INVALID DAYS
         */
        int day = 5;
        switch (day) {
            case 1, 2, 3, 4, 5:
                ;
                System.out.println("weekdays");
                break;
            case 6, 7:

                System.out.println("weekends");
            default:
                System.out.println("Invalid number");

        }
        //=================================================

        char letter = 'A';
        switch (letter) {
            case 'A', 'E', 'U', 'I', 'O':
                System.out.println("Vowel");
                break;
            case 'K', 'J', 'R':

                System.out.println("Consonant");
                break;


        }
        //=======================================








    }
}
