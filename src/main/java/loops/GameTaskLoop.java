package loops;

import java.util.Random;
import java.util.Scanner;

public class GameTaskLoop {
    public static void main(String[] args) {


        int randomNumber = new Random().nextInt(1, 100);

        Scanner user = new Scanner(System.in);
        System.out.println("Enter number");
        int number;

        do {
            System.out.println("Enter your number");
            number = user.nextInt();

            if (number < randomNumber) {
                System.out.println("Too low");

            } else if (number > randomNumber) {
                System.out.println("Too high");

            } else {
                System.out.println("u guessed the right number");
                break;
            }
            if (number < 1 || number > 100) {
                System.out.println("Enter number in range 1-100");

            }
        }

            while (number != randomNumber) ;


        }

    }
