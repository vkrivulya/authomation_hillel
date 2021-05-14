package HomeTask2;

import java.util.Scanner;

public class HomeTaskTwoDotThree {
    // 3. Write a program which converts number from hex to decimal view (input in command line)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number from hex: ");
        String inputHex = scanner.nextLine();
        System.out.println("result: " + hexToDec(inputHex));
    }

    private static int hexToDec(String hex) {
        return Integer.parseInt(hex, 16);
    }
}
