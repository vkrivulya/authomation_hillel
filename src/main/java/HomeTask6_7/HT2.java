package HomeTask6_7;

import java.util.Scanner;

public class HT2 {
    public static void main(String[] args) {
// 2. Write a Java program to print out the maximum occurring character in initial string.
// If there are few of them -> print them all
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = scanner.nextLine();

        if (getMaxOccuringChar(str) != ' ') {
            System.out.println("Max occurring character is " + getMaxOccuringChar(str));
        } else System.out.println("The String doesn't have any character whose occurance is more than 1");
    }

    static char getMaxOccuringChar(String str) {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[256];

        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int j = 0; j < len; j++) {
            if (max < count[str.charAt(j)] && count[str.charAt(j)] > 1) {
                max = count[str.charAt(j)];
                result = str.charAt(j);
            }
        }

        return result;
    }
}
