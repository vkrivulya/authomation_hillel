package HomeTask6_7;

import java.util.Scanner;

public class HT5 {
    //5. Write a Java program to read a string and an int from console, return a string without the character with described index
    //The initial strings is: Hello buddy
    //The numbers is: 3
    //The new string is: Helo buddy

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your initial string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        StringBuilder sb = new StringBuilder(str);
        if (number < str.length()) {
            sb.deleteCharAt(number);
            String resultString = sb.toString();
            System.out.println("A string without a character: " + resultString);
        } else
            System.out.println("The entered number is greater than the length of the string");
    }
}
