package HomeWork12;

import java.util.Scanner;

public class Task3Main {
    //3. Write our own type of exception (with message) and add usage of it in main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number greater than 100000");
        int number = s.nextInt();
        try {
            System.out.println("Your number is more than 100 000 - " + checkNumber(number));
        } catch (Task3Exception e) {
            System.out.println("Exception was thrown: ");
            e.printStackTrace();

        }

    }

    static boolean checkNumber(int number) throws Task3Exception {
        if (number < 100000) {
            throw new Task3Exception("Your number is less than 100 000");
        } else {
            return true;
        }
    }
}
