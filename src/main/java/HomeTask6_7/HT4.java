package HomeTask6_7;

import java.util.Scanner;

public class HT4 {
    //4. Write a Java program to reverse words in a initial string
    //The given string is: Reverse text in a string
    //The new string after reversed the words: string a in text Reverse

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = scanner.nextLine();
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
