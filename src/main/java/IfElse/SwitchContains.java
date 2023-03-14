package IfElse;

import java.util.Scanner;

public class SwitchContains {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter word: ");
        String aa = word.next();

        if (aa.contains("e")){
            System.out.println(aa.indexOf("e"));
        } else   {
            System.out.println("The word does not contain the letter  ");

        }


    }
}
