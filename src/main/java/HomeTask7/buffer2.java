package HomeTask7;

import java.util.Arrays;
import java.util.Scanner;

public class buffer2 {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        getOccuringChar(str);
    }



    static void getOccuringChar(String str) {
        char array[] = str.toCharArray();
        Arrays.sort(array);
        String sortedString = fromArray(array);
        for (int i = 0; i <array.length ; i++) {
            int count = 0;
            String current = "";
            for (int j = 0; j < array.length; j++) {
                String newText = removeLetter(sortedString, array[j]);
                if (str.length() - newText.length() == i){
                    count = i;
                    if (!current.contains(array[j] + "")) {
                        current += array[j];
                    }
                }
            }
            if (!current.isEmpty()){
                System.out.println("Number of Occurrence of " + count + " is:" + current);
            }

        }
    }


    static String removeLetter(String text, char ch) {
        return text.replaceAll("" + ch, "");
    }

    static String fromArray(char array[]){
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }


}
