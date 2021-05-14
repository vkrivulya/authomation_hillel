package HomeTask8;

public class FirstSecondMain {
    //5) Create 2 classes, each contains 2 variables. In first class override equals and hashcode.
    // Create few instances of both classes and compare them using ‘==’ and equals()
    public static void main(String[] args) {
        First firstInt = new First(21);
        First firstInt2 = new First(21);
        First firstString = new First("Hanna");
        First firstString2 = new First("Hanna");
        Second secondInt = new Second(21);
        Second secondInt2 = new Second(21);
        Second secondString = new Second("Hanna");
        Second secondString2 = new Second("Hanna");

        System.out.println("Comparing variables of the first class: ");
        System.out.println(firstInt == firstInt2);
        System.out.println(firstInt.equals(firstInt2));
        System.out.println(firstString == firstString2);
        System.out.println(firstString.equals(firstInt2));

        System.out.println("Comparing variables of the second class: ");
        System.out.println(secondInt == secondInt2);
        System.out.println(secondInt.equals(secondInt2));
        System.out.println(secondString == secondString2);
        System.out.println(secondString.equals(secondString2));


    }
}
