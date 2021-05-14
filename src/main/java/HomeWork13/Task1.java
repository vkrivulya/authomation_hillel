package HomeWork13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

//1. Create a List (try both ArrayList and LinkedList) and fill it with 5 countries.
// Sort the list and print it, then apply Collections.shuffle( ) to the list repeatedly,
// printing it each time so that you can see how the shuffle( ) method randomizes the list differently each time.
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ukraine");
        arrayList.add("Switzerland");
        arrayList.add("Spain");
        arrayList.add("Italy");
        arrayList.add("Montenegro");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ukraine");
        linkedList.add("Switzerland");
        linkedList.add("Spain");
        linkedList.add("Italy");
        linkedList.add("Montenegro");

        System.out.println("Default arrayList: " + arrayList);
        System.out.println("Default linkedList: " + linkedList);
        System.out.println();

        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("arrayList after sorting: " + arrayList);
        System.out.println("linkedList after sorting: " + linkedList);
        System.out.println();

        Collections.shuffle(arrayList);
        Collections.shuffle(linkedList);
        System.out.println("arrayList after shuffle: " + arrayList);
        System.out.println("linkedList after shuffle: " + linkedList);
        System.out.println();

        Collections.shuffle(arrayList);
        Collections.shuffle(linkedList);
        System.out.println("arrayList after second shuffle: " + arrayList);
        System.out.println("linkedList after second shuffle: " + linkedList);


    }
}
