package HomeTask5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HT3 {
//3) Write program which create an array from 20 integers with random values,
// write method with shuffle elements of array in random order

    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.println("Before sorting");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        shuffleArray(arr);
        System.out.println("\nAfter sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void shuffleArray(int[] arr) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }


    }

}






