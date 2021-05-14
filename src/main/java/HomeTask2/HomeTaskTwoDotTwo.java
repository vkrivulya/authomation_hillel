package HomeTask2;

import java.util.Scanner;

import static java.lang.StrictMath.PI;

public class HomeTaskTwoDotTwo {
    //2. Write a program which count the volume of cylinder and print result in console.
    // Radius and height user input from console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value of radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Input value of height: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("volume of Cylinder is: " + volume);
    }
}
