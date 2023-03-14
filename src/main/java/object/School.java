package object;

public class School {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Leo";
        student1.phone = "12345677899";
        student1.email = "Leo@gmail.com";
        student1.age = 18;
        student1.major ="Law";

        Student student2 = new Student();
        student2.name = "Boris";
        student2.phone = "5139037622";
        student2.email = "Boris@gmail.com";
        student2.age = 25;
        student2.major = "Policemen";

        student1.read();
        student2.read();

        student1.attendClass();
        student2.attendClass();

        student1.printInfo();
        student2.printInfo();


    }
}
