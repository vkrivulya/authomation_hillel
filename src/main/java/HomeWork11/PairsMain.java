package HomeWork11;

import java.util.Scanner;

import static HomeWork11.Pairs.printPairs;

public class PairsMain {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number(non-negative integer): ");
        int sum = input.nextInt();

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, -1, -23
        };
        int n = arr.length;
        printPairs(arr, n, sum);
    }
}
