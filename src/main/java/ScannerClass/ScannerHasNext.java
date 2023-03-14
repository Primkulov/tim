package ScannerClass;

import java.util.Scanner;

public class ScannerHasNext {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 digit code ");

        int zpCode = scanner.nextInt();

        String zipCode = zpCode + "";// changed integer into String

        if (zipCode.length() ==5 && !zipCode.contains("9") && zipCode.charAt(0)!='0'){
            System.out.println("The entered zip code is valid");
        }
    }
}
