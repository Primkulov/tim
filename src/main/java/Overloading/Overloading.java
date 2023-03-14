package Overloading;

public class Overloading {

    public boolean  isPrime(short number) {

            for( short i=2;i< number; i++){
            if (number % i == 0) {

                return false;
            }

        }
            return true;
    }
}