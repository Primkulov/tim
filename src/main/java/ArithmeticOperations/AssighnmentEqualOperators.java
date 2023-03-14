package ArithmeticOperations;

public class AssighnmentEqualOperators {
    public static void main(String [] args){

        /*
        = assighnment operator (when you give value to variable)

        == equal equal operator (compare two variables if they are equal or not )
        != not equal operator (compares if two variables are not equal
         */
        int number1 = 10;//assighnment
        int number2 = 8;
        System.out.println(number1 == number2);//false
        System.out.println(100 == 100);// true

        boolean isEqual = 100 == 101;
        System.out.println(isEqual);

        boolean isEven;// if number can be divided by 2
        isEven = 80 % 2 == 0;//true
        System.out.println(isEven);
        isEven = 4 % 2 == 0;//true
        System.out.println(isEven);

    }
}
