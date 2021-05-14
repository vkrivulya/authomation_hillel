package HomeWork12;

public class Task1 {
    //1. Write program which have variable which is null.
    // Call toString() for this variable. Use try/catch to handle NullPointerException.
    public static void main(String[] args) {

        String str = null;
        try {
            System.out.println(str.toString());
        } catch (NullPointerException e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }

    }
}
