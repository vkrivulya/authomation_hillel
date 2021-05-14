package HomeTask7;

import java.util.Scanner;

public class HT1 {
    //1. Write program that prompts user for the size (a non-negative integer in int)
    // and prints pattern as shown: https://prnt.sc/tz0lux
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number A(non-negative integer): ");
        int size = input.nextInt();

        System.out.println("Pattern a");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i % size <= 1) || (j % size <= 1) ? "# " : "  ");
            }
            System.out.println();
        }

        System.out.println("Pattern b");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i % size <= 1) || (i == j) ? "# " : "  ");
            }
            System.out.println();
        }

        System.out.println("Pattern c");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if ((i % size <= 1) || (i + j == size + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("Pattern d");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if ((i % size <= 1) || (i == j) || (i + j == size + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("Pattern e");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if ((i % size <= 1) ||
                        (j % size <= 1) ||
                        (i == j) ||
                        (i + j == size + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }


    }

}
