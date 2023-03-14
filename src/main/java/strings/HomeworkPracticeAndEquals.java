package strings;

public class HomeworkPracticeAndEquals {
    public static void main(String[] args) {
        String hello1 = "Hello World";
        String hello2 = "Hello World";
        String hello3 = new String("Hello World");
        System.out.println(hello1 == hello2);//true
        System.out.println(hello1 == hello3);//false

        String empty = hello1;
        hello1 = hello3;
        hello3 = empty;
        System.out.println(hello1 == hello2); //false
        //=======================================

        String a = hello1.toLowerCase();
        String b = hello2.toLowerCase();
        boolean c = a.equals(b);
        System.out.println(c);//====true
        //===================================
        String z = hello1.toUpperCase();
        String x = hello3.toUpperCase();
        boolean n = z.equals(x);
        System.out.println(n); //true








    }
}
