package HomeWork13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//3. Write a method switchPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion.
// Your method should switch the order of the first two values, then switch the order of the next two,
// switch the order of the next two, and so on.
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> pairedArrayList = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
        ArrayList<String> unpairedArrayList = new ArrayList<>(Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));

        System.out.println("Paired ArrayList before switches " + pairedArrayList);
        System.out.println("Paired ArrayList after switches " + switchPairs(pairedArrayList));
        System.out.println();
        System.out.println("Unpaired ArrayList before switches " + unpairedArrayList);
        System.out.println("Unpaired ArrayList after switches " + switchPairs(unpairedArrayList));

    }

    static ArrayList<String> switchPairs(ArrayList<String> list) {
        for (int i = 0; i + 1 < list.size(); i += 2) {
            Collections.swap(list, i, (i + 1));
        }
        return list;
    }

}
