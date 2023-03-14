package object;

public class rectangle {

    int width;

    int heights;

    String color;

    public void calculateArea(){
        System.out.println("The sum of the rectangle" + width * heights);
    }
    public void calculatePerimeter(){
        System.out.println("The sum of Perimeter" + (width +heights)*2);
    }


}
