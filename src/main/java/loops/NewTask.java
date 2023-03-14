package loops;

import java.util.Scanner;

public class NewTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int numOfnumbers = 0;

        while (true) {

            System.out.println("Enter a positive number (or negative to quit): ");
            number = scanner.nextInt();

            if (number == 0) {
                continue;
            } else if (number < 0) {
                break;
            }
            sum += number;
            numOfnumbers++;
        }
        System.out.println("The sum of all numbers: " + sum);
        System.out.println("The average of all number: " + sum / numOfnumbers);


        }
    }

