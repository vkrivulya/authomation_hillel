package HomeTask5;

public class HT4 {
    //4) Write program which create an array from 20 integers with random values,
    // write method with sort them in increase order, use Selection sort type
    //This algorithm divides the lists into two parts: the left-sublist of items already sorted,
    // and the right-sublist for the remaining items. Initially,
    // the left-sorted-sublist is empty, while the right-unsorted-sublist is the entire list.
    // The algorithm proceeds by finding the smallest (or largest) items from the right-unsorted-sublist,
    // swapping it with the leftmost element of the right-unsorted-sublist, and increase the left-sorted-sublist by one.
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
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
