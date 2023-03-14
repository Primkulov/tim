package strings;

import java.util.Locale;

public class HomeworkPracticeStringManipulation {
    public static void main(String[] args) {

        String message = "Hello everyone, Let's do Java String exercises";
        char a = message.charAt(10);
        System.out.println(a);
        //============================================
         int b = message.length();
        System.out.println(b);
        //==========================================
        String c = message.toUpperCase();
        System.out.println(c);
        //========================================
        String x = message.toLowerCase();
        System.out.println(x);
        //================================
        char z = message.charAt(5);
        System.out.println("The letter of number 5 is:" + z);
        //=====================================
         char lastLetter = message.charAt(message.length()-1);
        System.out.println(" Last letter is :" + lastLetter);
        //=================================================
        char firstLetter = Character.toLowerCase(message.charAt(0));//!!!!!!!!!!!!!!!!! must know
        System.out.println(firstLetter);
        //=======================================================
        char lastLetter1 = message.charAt(message.length() - 1);
        String uppercaseLastLetter = Character.toString(lastLetter1).toUpperCase();
        System.out.println("The last letter in uppercase is: " + uppercaseLastLetter);




    }
}
