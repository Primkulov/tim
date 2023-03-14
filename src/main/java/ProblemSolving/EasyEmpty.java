package ProblemSolving;

import java.util.Scanner;

public class EasyEmpty {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        String word = scanner.nextLine();

        if (word.isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println("not empty");
        }
    }
}
