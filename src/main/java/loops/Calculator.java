package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*
        create a program that  asks use  to enter
        one number
        arithmetic operator (+,-, *,/,%)
        second number
        output the result

        Ask user if he wants to try again ? yes/no
        if yes, calculate again
        if no, stop
        USE DO WHILE LOOP ,if - else , switch, Scanner
         */
        Scanner user = new Scanner(System.in);
        boolean yesNo = true;

        int number;

        do {

            System.out.println("Enter first number:");
            double num1 = user.nextDouble();

            System.out.println("Enter arithmetic operator :/ * + %");
            String arithmeticOperator = user.next();

            System.out.println("Enter second number:");
            double num2 = user.nextDouble();

            if (arithmeticOperator.equals("/")) {
                System.out.println(num1 + " / " + num2 + "= " + (num1 / num2));

            } else if (arithmeticOperator.equals("*")) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

            } else if (arithmeticOperator.equals("+")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

            } else if (arithmeticOperator.equals("-")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

            } else {
                System.out.println("Operator is invalid");
                yesNo = user.nextBoolean();
            }



        } while (yesNo) ;
    }
}







