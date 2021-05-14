package HomeTask5;

public class HT5 {
//5) Write program which create an array from 20 integers with random values,
// write method with sort them in increase order, use Insertion sort type
//Similar to the selection sort, but extract the leftmost element from the right-unsorted-sublist,
// and insert into the correct location of the left-sorted-sublist.

    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.println("Before sorting");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        sort(arr);
        System.out.println("\nAfter sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int arr[]) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int temp = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > temp)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = temp;
        }


    }


}
