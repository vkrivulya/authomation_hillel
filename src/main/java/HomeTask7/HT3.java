package HomeTask7;

import java.util.Scanner;

public class HT3 {
    //3. Write a program called printArrayInStars which prompts user for the number
    // of items in an array (a non-negative integer), and saves it in an int variable called numItems.
    //It then prompts user for the values of all the items (non-negative integers)
    // and saves them in an int array called items.
    //The program shall then print the contents of the array in a graphical form,
    // with the array index and values represented by number of stars.
    //Output ->
    //Enter the number of items: 5
    //Enter the value of all items (separated by space): 7 4 3 0 7
    //0: *******(7)
    //1: ****(4)
    //2: ***(3)
    //3: (0)
    //4: *******(7)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items(non-negative integer): ");
        int size = input.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the value of all items (separated by space): ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt(); // Fill the array with elements entered from the keyboard
        }


        for (int index = 0; index < numbers.length; index++) {
            System.out.print(index + ": ");
            String printString = "";

            for (int count = 0; count < numbers[index]; count++) {
                printString = "*";
                System.out.print(printString);
            }
            System.out.println("(" + (numbers[index]) + ")");

        }
    }


}
