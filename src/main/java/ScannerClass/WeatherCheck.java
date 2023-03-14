package ScannerClass;

import java.util.Scanner;

public class WeatherCheck {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter Temperature: ");
        double temp = user.nextDouble();

        System.out.println("it is raining ? true/false");
        boolean isRaining = user.nextBoolean();

        if (temp < 0) {
            System.out.println("It is freezing outside! Wear a heavy coat, gloves, and a hat.");


        } else if (isRaining && temp >= 0 && temp <= 10) {
            System.out.println("It is chilly and rainy! Wear a raincoat, boots, and a scarf");


        } else if (!isRaining && temp > 0 && temp <= 10) {
            System.out.println("It is chilly outside ! Wear a jacket , gloves, and a hat");

        } else if (isRaining && temp >= 11 && temp <= 20) {
            System.out.println("It is chilly and rainy! Wear a raincoat, boots, and a scarf");

        } else if (isRaining && temp >= 0 && temp <= 10) {
            System.out.println("It is chilly and rainy! Wear a raincoat, boots, and a scarf");


        }
    }
}

