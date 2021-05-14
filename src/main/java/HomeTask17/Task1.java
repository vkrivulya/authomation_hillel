package HomeTask17;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        addElementsToTheList();
    }

    private static void addElementsToTheList() {
        ArrayList<Double> list = new ArrayList<Double>(1000000);
        for (int i = 0; i < 1000000000; i++) {
            list.add(random.nextDouble());
            if (i % 100000000 == 0) {
                System.out.println("iteration " + i);
            }
        }

    }
}