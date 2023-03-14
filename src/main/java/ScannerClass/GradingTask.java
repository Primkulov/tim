package ScannerClass;

import java.util.Scanner;

public class GradingTask {
    public static void main(String[] args) {

        Scanner grade  = new Scanner(System.in);
        System.out.println("Enter grade:");
        int num1 = grade.nextInt();
        System.out.println(num1);
        
        if (num1 >= 0 && num1 <= 20 ){
            System.out.println("bad , study everything again");
            
            
        } else if (num1 >= 21 && num1 < 40) {
            System.out.println("ok, study more");

        } else if (num1 >=41 && num1 <60) {
            System.out.println("good to study");

        }
    }
}
