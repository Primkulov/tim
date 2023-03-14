package SwitchStatement;

public class IntroToSwitch {
    public static void main(String[] args) {

        int number = 0;

        switch (number) {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;

            default:
                System.out.println("Invalid Number");


                //==========================================

                String digit = "three";

                switch (digit) {

                    case "one":
                        System.out.println("1");
                        break;

                    case "two":
                        System.out.println(2);
                        break;

                    case "thre":
                        System.out.println(3);
                        break;

                    case "four":
                        System.out.println(4);
                        break;

                    case "five":
                        System.out.println(5);
                        break;
                    default:
                        System.out.println("Invalid number");

                }

                //==================================
                int a = 3;
                System.out.println("It is three");

                if (a ==1){
                    System.out.println("false");

                }  if (a==2) {
                    System.out.println("false");


                } if (a==3) {
                    System.out.println("print");


                }  if (a==4) {
                System.out.println(false);

                }


        }
    }
}