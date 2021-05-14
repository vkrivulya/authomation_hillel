package HomeTask4;

public class HT2 {
    //2. Write a program called Tribonacci to print the first 20 Tribonacci numbers
    //0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504 ....

    public static void main(String[] args) {

        int count = 20;
        int num1 = 0;
        int num2 = 0;
        int num3 = 1;
        for (int i = 1; i < count; i++) {
            System.out.print(num2 + " ");
            int nextNum = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = nextNum;
        }

    }
}
