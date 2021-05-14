package HomeWork11;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplication {
    // 5. Write class which contains just 1 method which returns the result of multiplication of all doubles which it receives.
    // It can receive any amount of double numbers.
    //Add usage of it in main in other class

    public static void main(String[] args) {
        System.out.println("Enter the required size of the array :");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        double myArray[] = new double[size];
        double multiply = 1.0;
        System.out.println("Enter the elements of the array one by one ");
        for (int i = 0; i < size; i++) {
            myArray[i] = s.nextDouble();
            multiply = multiply * myArray[i];
        }
        System.out.println("Elements of the array are: " + Arrays.toString(myArray));
        System.out.println("Multiplication of Array elements :" + multiply);

    }
}
