package object;

public class Animal {

    String type;

    boolean isMammal;

    boolean isCornivare;

    int age;

    String habitat;

    public void eat(){
        System.out.println(type + "is carnivore: " + isCornivare +"is eating");


    }
    public void sleep(){
        System.out.println(type +  " is sleeping at night  ");
    }
    public  void play(){
        System.out.println(type + " is playin with boy");
    }
}
