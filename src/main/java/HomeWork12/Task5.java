package HomeWork12;

public class Task5 {
    //5. Create program which will result StackOverflowException
    public static void main(String[] args) {
        recursion();
    }

    public static void recursion() {
        recursion();
    }
}
