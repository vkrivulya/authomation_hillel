package HomeTask5;

public class HT6 {
    //6*) Bonus task. Not mandatory
    //Recursive Quick Sort. Quicksort is a recursive divide and conquer algorithm.
    // It divides the list into two sublists - the low elements and the high element,
    // and recursively sort the sublists. The steps are:
    //- Pick an element, called pivot, from the list.
    //- Partitioning: reorder the list such that the smaller elements come before the pivot,
    // and the larger elements after the pivot. After the partitioning, the pivot is in its final position.
    //- Recursively apply the above step to the sub-lists.
    public static void main(String[] args) {

        int[] arr = new int[20];
        System.out.println("Before sorting");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\nAfter sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
