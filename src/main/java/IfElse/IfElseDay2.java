package IfElse;

public class IfElseDay2 {
    public static void main(String[] args) {
        /*
        if (boolean){
        }
        else if (boolen){
            writebe else if code
        }
        else {
                 write else code

        */
        // 1 to 7
        int day = 3;
        /*
        if day =1 print Monday,
        day = 2 print Tuesday
         */
        if ( day == 1){
            System.out.println("It is Monday");
        } else if (day ==2) {
            System.out.println("Tuesday");

        } else if (day ==3) {
            System.out.println("Wednesday");

        } else if (day ==4) {
            System.out.println("Thurthday");

        } else if (day ==5) {
            System.out.println("Friday");

        }else {
            System.out.println("Invalid Day");
        }
        //========================

        String  day1 = "Monday";
        if (day1.equalsIgnoreCase("Monday")){
            System.out.println(1);


        }else if (day1.equalsIgnoreCase("Tuesday")) {
            System.out.println(2);

        } else if (day1.equalsIgnoreCase("Wednesday")) {
            System.out.println(3);
        } else if (day1.equalsIgnoreCase("Thursday")) {
        System.out.println(4);
        } else if (day1.equalsIgnoreCase("Fridayday")) {
            System.out.println(5);
        } else if (day1.equalsIgnoreCase("Saturday")) {
            System.out.println(6);
        } else if (day1.equalsIgnoreCase("Sunday")) {

            System.out.println(7);
        }
        //========================
        byte time = 18;
        if (time <= 17 && time >=9){
            System.out.println("WORK HOURS");
        }
        else if (time >= 7 && time <= 9 || time >=18 && time<= 19) {
            System.out.println("Commute Hours");
        } else if (time >= 6 && time <=8){
            System.out.println("Breacfast time");

        } else if (time >= 12 && time <=13) {
            System.out.println("Lunch Time");

        } else if (time >= 20 && time <=22) {
            System.out.println("Dinner time");

        } else if (time == 22) {
            System.out.println("Late Hours");

        }


    }
}
