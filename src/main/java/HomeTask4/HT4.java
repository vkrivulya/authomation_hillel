package HomeTask4;

import java.util.Scanner;

public class HT4 {
//4. Write a program to extract each digit from a double, in the reverse order.
//For example, if the double is 2522.43034, the output shall be " 4 3 0 3 4 . 2 2 5 2", with a space separating the digits.

    public static void main(String[] args) {
        double i = 2522.43034;
        int b = (int) (i * 100000);
        while (b > 0) {
            if (b == 2522) {
                System.out.print(". ");
            }
            int digit = b % 10;
            System.out.print(digit + " ");
            b = b / 10;
        }
    }
}
