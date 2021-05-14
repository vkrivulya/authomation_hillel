package HomeWork12;

import java.util.Scanner;

public class Task2 {
    //2. Write program which has method isWeatherGood(boolean isItRaining, int temperature, boolean isItSunny).
    // In this method you have to verify variables and if it’s raining, temperature is below 10,
    // and is not sunny then throw Exception("Weather is not good")

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("It's raining? input true or false");
        boolean isRaining = s.nextBoolean();
        System.out.println("What temperature? Enter the number");
        int temp = s.nextInt();
        System.out.println("It's sunny? input true or false");
        boolean isSunny = s.nextBoolean();

        try {
            isWeatherGood(isRaining, temp, isSunny);
            System.out.println(("Weather is good"));
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        }

    }

    static boolean isWeatherGood(boolean isItRaining, int temperature, boolean isItSunny) throws Exception {
        if ((isItRaining == true) && temperature < 10 && isItSunny == false) {
            throw new Exception("Weather is not good");
        } else {
            return true;

        }
    }
}
