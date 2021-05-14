package HomeTask6_7;

import java.util.Scanner;

public class Bufer1 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner cs=new Scanner(System.in);
            String str;
            System.out.println("Enter your String:");
            str=cs.nextLine();

            printMaxOccuringChars(str);

        }

        static void printMaxOccuringChars(String str) {
            char[] arr = str.toCharArray();
            /* Assuming all characters are ascii */
            int[] arr1 = new int[256];
            int maxoccuring = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != ' ') { // ignoring space
                    int val = (int) arr[i];
                    arr1[val]++;
                    if (arr1[val] > maxoccuring) {
                        maxoccuring = arr1[val];
                    }
                }

            }

            for (int k = 0; k < arr1.length; k++) {
                if (maxoccuring == arr1[k]) {
                    char c = (char) k;
                    System.out.print(c + " ");

                }

            }

        }
}
