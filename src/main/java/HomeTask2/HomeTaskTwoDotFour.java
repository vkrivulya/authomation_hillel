package HomeTask2;

public class HomeTaskTwoDotFour {
    //4. Create your own example with increment/decrement, count it manually and then run program and verify your value.
    // Example has to contain more then 5 increment operation, more then 5 decrement operations, *=, +=, -=,
    // and more then 5 resetting of value for each variable.
    public static void main(String[] args) {
        int a = 1;
        int b = 1; 	 //
        int c = a * b++;   // a=1; c=1, b=2
        int d = a * ++b; // a=1, b=3, c=1, d=3
        a = ++b; // a=4, b=4, c=1, d = 3
        a = b++; // a=4, b=5, c=1, d=3
        b = --a; // a=3, b=3, c=1, d=3
        c = --b; // a=3, b=2, c=2, d=3
        a = b--; // a=2, b=1, c=2, d=3
        c = ++a * b++; // a=3, b=2, c=3, d=3
        b *= a + b;    // a=3, b=10, c=3, d=3
        a = a + ++c;   // a=7, b=10, c=4, d=3
        d = 1 + c + b; // a=7, b=10, c=4, d=15
        a = (d - b - 1) / c; // a=(15-10-1)/4, a = 1, b=10, c=4, d = 15
        d -= b; // a=1, b=10, c=4, d = 5
        b /= a; // a=1, b=10 , c=4, d=5
        c %= a; // a=1, b=10, c=0 , d=5
        System.out.println("The value of a " + a);
        System.out.println("The value of b " + b);
        System.out.println("The value of c " + c);
        System.out.println("The value of d " + d);
    }



}
