package loops;

import java.util.Scanner;

public class breakPractice {
    public static void main(String[] args) {
        /*=create a program that asks user to enter 2 numbers
        print all numbers up until the the sum of
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 number");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1+ number2;



        for (int i = 1; i <= sum ; i++) {

            if (i == 45) {
                break;
            }
            System.out.println(i);

        }
    }
}