package ScannerClass;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        /*
        Ask user to enter the name of the month;
        January,
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month");
        String month = scanner.nextLine();

        if(month.equalsIgnoreCase("January") ||
             month.equalsIgnoreCase("February") ||
                month.equalsIgnoreCase("December")) {
            System.out.println("WINTER TIME !!!");

        } else if (month.equalsIgnoreCase("September") ||
                month.equalsIgnoreCase("October") ||
                month.equalsIgnoreCase("November")) {

            System.out.println("AUTUMN TIME !!!");



            } else if (month.equalsIgnoreCase("March") ||
                month.equalsIgnoreCase("April") ||
                month.equalsIgnoreCase("May")) {
            System.out.println("APRING TIME !!!");


        } else if (month.equalsIgnoreCase("June") ||
                month.equalsIgnoreCase("July") ||
                month.equalsIgnoreCase("August")) {
            System.out.println("SUMMER TIME!!!");

        }else {
            System.out.println("INVALID SEASON");

    }


    }
}
