package ScannerClass;

import java.util.Scanner;

public class JustExamples {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        int num1 = user.nextInt();// From User data !!!!!!!!!!!!!!!!!!

        if (num1 >= 1 && num1 <= 10){
            System.out.println("Valid number");

        }else {
            System.out.println("Not Valid Number");
        }


    }
}
