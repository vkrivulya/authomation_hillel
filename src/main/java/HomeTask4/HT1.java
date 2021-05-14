package HomeTask4;

import java.math.BigDecimal;

public class HT1 {
    //Write a program to compute the value of Eiler number, using the following series expansion.
    //Use the maximum denominator as the terminating condition. Try maxDenominator of 1000, 10000, 100000,
    //HINT: e=1/0!+1/1!+1/2!+1/3!+1/4!+1/5!+1/6!+...
    //https://en.wikipedia.org/wiki/Euler_number

    public static void main(String[] args) {
        // initialize fact to 0!
        double fact = 1;
        double maxDenominator = 100000;
        // first Euler term 1/0!
        double e = fact;

        for (int x = 1; x <= maxDenominator; x++) {
            // next factorial
            fact *= x;
            // subsequent terms
            e += (1 / fact);
        }
        System.out.println(e);

// second solution
//        double e = 0;
//        double tmp = 1;
//        double maxDenominator = 100000;
//        for (int i = 1; i < maxDenominator; ++i) {
//            e += tmp;
//            tmp /= i;
//        }
//        System.out.println(e);

    }
}
