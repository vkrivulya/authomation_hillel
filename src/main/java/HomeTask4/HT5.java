package HomeTask4;

public class HT5 {
    //Write program which print out next image using loops:
    //
    //    *
    //   * *
    //  * * *
    // * * * *
    //* * * * *

    public static void main(String[] args) {
        int line;
        int star;

        for (line = 1; line <= 5; line++) {
            for (star = 1; star <= 5; star++) {

                if (line > 5 - star)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
