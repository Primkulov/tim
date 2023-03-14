package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int x =1;
        while (x <=10){
            System.out.println(x);
            x++;
        }


        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        //===================================
        for (int a = 10; a >= 1; a--) {
            System.out.println("Good morning everyone");

        }
        //=============================
        int b = 1;
        while (b <= 10) {
            System.out.println("Good morning everyone");
            {
                b++;
            }
            //=====================================


        }
        int c = 100;
        while (c >= 1) {

            if (c % 2 == 1) {
                System.out.println(c);
            }

            c--;
        }
        //==================================

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt(); //40

        boolean isPrime = true;

        int p = 2;
        while (p < number) {

            if ( number%p==0) {
                isPrime = false;
                break;
            }
            p++;

        }
        if (isPrime){
            System.out.println("Number is Prime");

        }else {
            System.out.println("number is not Prime");
        }


    }


}



