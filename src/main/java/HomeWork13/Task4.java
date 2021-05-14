package HomeWork13;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//4. Write a program which measure time of inserting of new entry to hashmap and treemap,
// use different amounts of new entries (100, 1000, 10000, 1000000…)
public class Task4 {

    public static void main(String[] args) {
        System.out.println(getOperationTime(new HashMap<String, Integer>()));
        System.out.println(getOperationTime(new TreeMap<String, Integer>()));

    }

    private static long getOperationTime(Map map) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            map.put("a", 4);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


}
