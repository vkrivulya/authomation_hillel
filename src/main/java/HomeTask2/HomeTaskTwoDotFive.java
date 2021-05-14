package HomeTask2;

import java.util.Scanner;

public class HomeTaskTwoDotFive {
    // 5. Write a program which count x1, x2 for quadratic equation. Input a, b, c from console.
    //ax2 + bx + c = 0

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Input value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Input value of c: ");
        double c = scanner.nextDouble();
        double result = b * b - 4.0 * a * c;

        if (result > 0.0) {
            double x1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double x2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + "x1: " + x1 + " and x2: " + x2);
        } else if (result == 0.0) {
            double x1 = -b / (2.0 * a);
            System.out.println("The root is " + x1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }


}
