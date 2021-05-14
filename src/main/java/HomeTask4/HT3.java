package HomeTask4;

import java.util.Scanner;

public class HT3 {
    //Write 4 programs called TriangularPatternX (X = A, B, C, D)
    // that prompts user for the size (a non-negative integer in int);
    // and prints each of the patterns as shown on picture below
    //https://prnt.sc/qu7uim
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number A(non-negative integer): ");
        int a = input.nextInt();
        int line;
        int hashSymbol;

        System.out.println("TriangularPattern a");
        for (line = 1; line <= a; line++) {
            for (hashSymbol = 1; hashSymbol <= line; hashSymbol++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println("TriangularPattern b");
        for (line = 1; line <= a; line++) {
            for (hashSymbol = 1; hashSymbol <= a; hashSymbol++) {
                if (line <= hashSymbol)
                    System.out.print("# ");
                //else
                // System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("TriangularPattern c");
        for (line = 0; line <= a; line++) //line=0, a=7, hash=8
        {
            for (hashSymbol = 0; hashSymbol <= a; hashSymbol++) {
                if (line < hashSymbol)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("Triangle d");

        for (line = 1; line <= a; line++) {
            for (hashSymbol = 1; hashSymbol <= a; hashSymbol++) {

                if (line > a - hashSymbol)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}
