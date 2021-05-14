package HomeTask6_7;

import java.util.Scanner;

public class Bufer3 {


    public static void main(String[] args) {
// 2. Write a Java program to print out the maximum occurring character in initial string.
// If there are few of them -> print them all
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = scanner.nextLine();

        longestSequenceOfChar(str);
        System.out.println("Max occurring character is " + longestSequenceOfChar(str));


    }

    static String longestSequenceOfChar(String str) {
        String interimresult = "";
        String result = "";              //final result
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            interimresult += ch;       //add the letter once
            for (int j = i + 1; j < str.length(); j++) {
                char ch1 = str.charAt(j);
                if (ch != ch1) {
                    break;
                }
                interimresult += ch;
            }
            if (interimresult.length() > result.length())//store the result if it is longer
                result = interimresult;
            interimresult = "";                   //clear to continue with the next letter
        }
        return result;
    }


}
