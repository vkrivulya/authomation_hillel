package HomeWork13;
//2. Write a Java program to compare two array lists. Each needs to contains at least 5 elemets

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);

        System.out.println("compare the same arrayLists: ");
        System.out.println("arrayList1: " + arrayList1);
        System.out.println("arrayList2: " + arrayList2);
        System.out.println("compare = " + arrayList1.equals(arrayList2));
        System.out.println();

        System.out.println("compare different arrays: ");
        arrayList2.remove(2);
        System.out.println("arrayList1: " + arrayList1);
        System.out.println("arrayList2: " + arrayList2);
        System.out.println("compare = " + arrayList1.equals(arrayList2));
        System.out.println();

        System.out.println("compare the same arrayLists: ");
        arrayList2.add(2, 3);
        System.out.println("arrayList1: " + arrayList1);
        System.out.println("arrayList2: " + arrayList2);
        System.out.println("compare = " + arrayList1.equals(arrayList2));
        System.out.println();

        System.out.println("compare different arrayLists: ");
        arrayList2.clear();
        System.out.println("arrayList1: " + arrayList1);
        System.out.println("arrayList2: " + arrayList2);
        System.out.println("compare = " + arrayList1.equals(arrayList2));


    }
}
