package HomeTask7;

import java.util.Arrays;
import java.util.Scanner;

public class HT5 {
    public static void main(String[] args) {
        System.out.print("Enter 2D array size : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int[][] array = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
    }
}
