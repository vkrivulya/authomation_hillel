package HomeTask7;

import java.util.*;

public class qw {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        getOccuringChar(str);
    }


    static void getOccuringChar(String str) {
        Map<Character, Integer> count = new HashMap();

        for (char ch : str.toCharArray()) {
            Character lower = Character.toLowerCase(ch);
            Integer c = count.get(lower);
            if (c == null) c = 0;
            count.put(lower, ++c);
        }

        Map<Integer, List<Character>> result = new HashMap<>();
        for(Map.Entry<Character, Integer> entry : count.entrySet()) {
            Integer numberOfOccurrence = count.get(entry.getKey());
            List<Character> list = result.get(numberOfOccurrence);
            if (list == null) list = new ArrayList<>();
            list.add(entry.getKey());
            result.put(numberOfOccurrence,list);
        }

        for(Map.Entry<Integer, List<Character>> entry : result.entrySet()) {
            List<Character> list = entry.getValue();
            String text = "";
            for (int i = 0; i < list.size(); i++) {
                text = text + " " + list.get(i);
            }
            System.out.println("Number of Occurrence of " + entry.getKey() + " is:" + text);
        }

    }


}
