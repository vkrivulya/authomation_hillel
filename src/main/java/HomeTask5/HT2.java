package HomeTask5;

import java.util.Scanner;

public class HT2 {
    //2) Print out first 20 Fibonachi numbers using recursion
    public static void main(String[] args) {

        System.out.println("Enter number of which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series of " + number + " numbers : ");

        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
