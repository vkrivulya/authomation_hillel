package HomeWork10;

public interface FirstInterface {
    public String getName();

    default void displaySmth() {
        System.out.println("hello");
    }

    public static void sayGoodBye() {
        System.out.println("Good bye");
    }
}
