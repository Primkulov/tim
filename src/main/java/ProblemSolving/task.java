package ProblemSolving;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word");


     String word1 = scanner.next();//apple
        System.out.println("Enter second word");
     String word2 = scanner.next();// banana
        word1 ="apple";
        word2 ="banana";


    word1 =  word1.toLowerCase();
    word2 = word2.toLowerCase();



     System.out.println(word1 + word2.toUpperCase().charAt(0) + word2.substring(1) );
        System.out.println(word1.toUpperCase()+ word2.toLowerCase());
        System.out.println(word2.toUpperCase() + word1.toUpperCase());
        System.out.println(word1.toUpperCase() + " " + word2.toLowerCase() + " " +  word2.toLowerCase() + " " + word1.toUpperCase());
        System.out.println(word1.substring(2));
        System.out.println(word1.toUpperCase().charAt(word1.length()-2) + "" +
                word1.toLowerCase().charAt(word1.length() -1) +
                word2.toUpperCase().charAt(word2.length()-2) + "" + word2.toLowerCase().charAt(word2.length()-1));





    }
}
