package HomeTask5;

public class HT1 {
    // 1) Write program with example of overloading with methods with variations of parameters:
    // (int), (int, int), (double, int), (int, double), (int, float, String) and without parameters.
    // Add case of usage types substitution from Type Promotion table (int → long → float → double)

    public static void main(String[] args) {
        overloading(1);
        overloading(7, 2);
        overloading(3.3, 4);
        overloading(5, 4.43);
        overloading(2, 5.5f, "qwe");
        overloading();
        caseOfUsageTypesSubstitution();
    }

    private static void overloading(int a) {
        System.out.println("method with int");

    }

    private static void overloading(int a, int b) {
        System.out.println("method with int + int ");

    }

    private static void overloading(double d, int a) {
        System.out.println("method with double + int");

    }

    private static void overloading(int a, double d) {
        System.out.println("method with int + double");

    }

    private static void overloading(int a, float f, String s) {
        System.out.println("method with int + float + string");

    }

    private static void overloading() {
        System.out.println("method without parameters");

    }

    private static void caseOfUsageTypesSubstitution() {
        int i = 100;

        // automatic type conversion
        long l = i;

        // automatic type conversion
        float f = l;

        double d = f;
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);
        System.out.println("Double value " + d);
    }
}
