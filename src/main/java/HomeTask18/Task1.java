package HomeTask18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task1 {
    //Write a program that will declare a list of prices (integer): 10, 50, 80, 100, 200, 500, 1200, 1500, 2000, 5000
    //        1) By using stream print all the prices ordered from small to big
    //        2) By using stream print only the first 5 prices
    //        3) By using stream create new list which holds same prices with tax (add 17% to each one) and print it
    //        4) By using stream print each price after 50% discount, exclude print operation for the first four prices
    //        5) By using stream print only the prices which are smaller than 500 as string with string format "[price] < 500"
    //        6) By using stream multiply each element which is smaller than 500 by 10 and print the results with no duplicated
    //        7) values from smaller to bigger number
    public static void main(String[] args) {

        List<Integer> prices = Arrays.asList(100, 50, 80, 10, 200, 5000, 1200, 1500, 2000, 500);

        System.out.println("Default list: " + prices);
        System.out.println("1) By using stream print all the prices ordered from small to big");
        prices.stream()
                .sorted();
        System.out.println("list after sorting: " + prices);
//                .forEach(System.out::println);

        System.out.println("\n2) By using stream print only the first 5 prices");
        prices.stream()
                .limit(5);
        System.out.println("first 5 prices: " + prices);

        System.out.println("\n3) By using stream create new list which holds same prices with tax (add 17% to each one) and print it");
//

        List<Double> priceWithTax = (List<Double>) prices.stream();
//
        priceWithTax.stream()
        .map((cost) -> cost + .17*cost)
                .forEach(System.out::println);



    }



}
