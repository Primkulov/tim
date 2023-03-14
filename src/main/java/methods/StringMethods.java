package methods;

public class StringMethods {

    /*
    create a method that takes 2 Strings and checks if they are same. True, False
     */

    static  boolean compareStrings(String str1, String str2){

    if( str1.equals(str2)){
        return true;
    }return false;

}



    public static void main(String[] args) {
        boolean isSame = compareStrings("hello", "hello");
        System.out.println(isSame);

        compareStrings("bye" , "hi");

    }

}






