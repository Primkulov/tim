package ProblemSolving;

import java.util.Scanner;

public class polindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word");
        String word = scanner.nextLine();
        /*
        write a logic, that print "Polindrome" if word is polindrome
        "Not polindrome", if not
        Polindronrome is a word that is read same backwards : civic, madam,level,
         */

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
            System.out.println(reverse);
            if (reverse.equals(word.length())) {
                System.out.println("the word is polidrome");
            } else {
                System.out.println("the word is not polidrome");
            }





        }
    }
}