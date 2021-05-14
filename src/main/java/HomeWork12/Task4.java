package HomeWork12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    //4. Write program which has try-catch block inside of catch in
    // try-catch block (with different exception other then we had in class)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a first number");
        try {
            int number = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You entered a non-integer number and Exception thrown one: ");
            e.printStackTrace();
            try {
                System.out.println("Enter second number, which is equal to the first");
                Object i = Integer.valueOf(42);
                String a = (String) i;
            } catch (Exception e1) {
                System.out.println("Exception thrown two: ");
                e1.printStackTrace();
            }
        }
    }


}
