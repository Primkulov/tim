package methods;

public class Homework18 {
    public double multipliedBy100(double number) {
        double result = number * 100;


        return result;
    }
    public boolean differenceBetween(int a, int b){
        boolean result =false;
        if (a-b ==5){
            result=true;
        }
        return result;
    }
    public boolean isPrime(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Homework18 homework18 = new Homework18();
        System.out.println(homework18.isPrime(24));
    }


}
