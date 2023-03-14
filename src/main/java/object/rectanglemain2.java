package object;

public class rectanglemain2 {

    public static void main(String[] args){

        rectangle rectangle1 = new rectangle();
        rectangle1.heights =10;
        rectangle1.width =5;
        rectangle1.color = "red";
        System.out.println(rectangle1.width);


        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        rectangle rectangle2 = new rectangle();
        rectangle2.width = 17;
        rectangle2.heights = 25;
        System.out.println(rectangle2.color);
    }



}
