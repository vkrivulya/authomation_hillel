package HomeTask2;

public class HomeTaskTwoDotOne {
    //1. Write a program which divide 2 fractional numbers and print results in console
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = divide(a, b);

        System.out.println("result = " + c);
    }

    static double divide(double d1, double d2) {
        double result = d1 / d2;
        return result;
    }

}
