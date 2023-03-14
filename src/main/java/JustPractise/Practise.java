package JustPractise;

public class Practise {
    public static void main(String[] args) {

        String word =  "HI";
        String word1 = "Hi";
        String word3 = new String("Hi");

        System.out.println(word ==word1);
        System.out.println(word.equals(word1));
        System.out.println(word.equals(word3));


    }
}