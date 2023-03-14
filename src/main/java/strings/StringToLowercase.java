package strings;

public class StringToLowercase {
    public static void main(String [] args){
         String word = "Hello EverYONE! HOW ARE you doing";
        System.out.println(word);

         word = word.toLowerCase(); // converts to lower case
        System.out.println(word);

        String word2 = "hello gus, I am good. AND you";
        System.out.println(word2);

        word2 = word2.toUpperCase();
        System.out.println(word2);

        String word3 = "hello everyone";
        String word4 = "HELLO EVERYONE";
        /*
        compare  word3 to word4===> true
         */
        System.out.println(word3.toUpperCase().equals(word4));
        System.out.println(word3.equals(word4.toLowerCase()));
        System.out.println(word3.equalsIgnoreCase(word4));



    }
}
