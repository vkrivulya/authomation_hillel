//package HomeTask7;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//import static HomeTask7.buffer3.getOccuringChar;
//
//public class buffer1 {
//
//    public static void main(String[] args)
//    {
//        String firstString = "Body_moving";
//        String secondString = "My body is fat";
//
//        System.out.println("First string: " + firstString);
//        System.out.println("Second string: " + secondString);
//
//        String str = "geeksforgeeks";
//        getOccuringChar(str);
////        getOccuringChar(secondString);
//
//        static void getOccuringChar(String str) {
//        Map<Character, Integer> count = new HashMap<Character, Integer>();
//
//        for (char ch : str.toCharArray()) {
//            Character lower = Character.toLowerCase(ch);
//            Integer c = count.get(lower);
//            if (c == null) c = 0;
//            count.put(lower, ++c);
//        }
//        for(Map.Entry<Character, Integer> entry : count.entrySet()) {
//            System.out.println("Number of Occurrence of " + entry.getKey() + " is:" + entry.getValue());
//        }
//
//    }
//    }
//
//
//}
