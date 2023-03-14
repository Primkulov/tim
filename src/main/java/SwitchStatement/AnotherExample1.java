package SwitchStatement;

import java.util.Scanner;

public class AnotherExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter zip code : ");
        int zipCode = sc.nextInt();

        if (zipCode +"".length()==5){
            System.out.println("ZipCode is Valid");

        } else  {
            System.out.println("zipCode is not Valid");

        }

    }
}
