package SwitchStatement;

import java.util.Scanner;

public class AnotherExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        int num = sc.nextInt();

        if ( num ==3 || num ==4 ||num ==5){
            System.out.println("It is Spring");

        } else if (num ==6 || num ==7 || num <=8) {
            System.out.println("Summer");

        } else if (num ==9|| num ==10 || num <=11) {
            System.out.println("Fall");

        } else if (num==12 || num==1 || num==2) {
            System.out.println("Winter");


        }else {
            System.out.println("invalid number");
        }
        //=====================================
        switch (num){
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
            case 9, 10, 11:
                System.out.println("Autumn");
            default:
                System.out.println("Invalid seasons");
        }

    }
}
