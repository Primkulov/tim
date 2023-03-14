package ProblemSolving;

import java.util.Scanner;

public class polidrome2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int length = word.length();
        boolean isPalidrome = true;

        for (int i = 0; i< length/2; i++){
            if ( word.charAt(i) != word.charAt(length-1-i)){
                isPalidrome = false;

            }
        }
        System.out.println(isPalidrome);
    }
}
