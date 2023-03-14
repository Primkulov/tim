package loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }


        for (int v = 1; v <= 100; v++) {
            if (v % 2 == 0) {
                continue;
            }
            System.out.println(v);
        }
        for (int z = 1; z <= 100; z++) {
            if (z % 3 == 0) {
                continue;
            }
            System.out.println(z);


        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int negative = scanner.nextInt();
        int positive = scanner.nextInt();

        for (int aa = negative; aa <= positive; aa++){

            if (aa< 0 && aa%2 ==0){
                continue;
            } else if (aa>0 && aa%2 !=0) {
                continue;
            }
            System.out.println(aa);
        }





    }

}