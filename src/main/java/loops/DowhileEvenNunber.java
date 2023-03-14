package loops;

import java.util.Scanner;

public class DowhileEvenNunber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int number;

        do {

            System.out.println("Enter  number: ");
            number = scanner.nextInt();
        } while (number % 2 != 0);

    }
}
