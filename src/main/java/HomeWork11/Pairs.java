package HomeWork11;

public class Pairs {
    // 4. Write program which find all pairs on integer array whose sum is equal to given number

    static void printPairs(int arr[], int n, int sum) {
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] + arr[j] == sum)
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
    }

}
