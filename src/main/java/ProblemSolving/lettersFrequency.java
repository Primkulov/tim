package ProblemSolving;

import java.util.Scanner;

public class lettersFrequency {
    public static void main(String[] args) {
        /*
        -put jack under car properly
        -lift car
        -unwind the bolts from damage wheel
        -take out damage wheel
        -put new wheel
        -screw in bolts
        -take out jack

         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();

        for (int aa = 0; aa < word.length(); aa++) {
            int counter = 0;
            for (int bb = 0; bb < word.length(); bb++) {

                if (word.charAt(aa) == word.charAt(bb)) {
                    counter++;

                }
            }
            System.out.println(word.charAt(aa) + " : " + counter);


        }


    }
}