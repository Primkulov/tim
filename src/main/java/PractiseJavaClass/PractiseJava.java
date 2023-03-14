package PractiseJavaClass;

import java.util.Scanner;

public class PractiseJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = sc.nextLine();

        if (word.contains("Java")){
            System.out.println("Yes contains Java");
        }else {
            System.out.println("No does not contain Java");
        }

        //====================================
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = scanner.nextInt();

        System.out.println("Enter second number");
        int y = sc.nextInt();

        if (x > 0 && y >0){
            System.out.println(" Both x and y are positive");

        } else if ( x < 0 && y<=0) {
            System.out.println("one of them zero");

        }


    }


}
