package HomeTask7;

import java.util.*;

public class HT4 {
    //4. Write a program which print out table of how many times each character
    // is present in initial String (ignore case of charachter)
    //Output ->
    //Initial String: Hillel
    //1 occurance - 'h', 'i', 'e'
    //3 occurance - 'l'
    //Output ->
    //Initial String: SupeR hero
    //1 occurance - 's', 'u', 'p', ' ', 'h', 'o',
    //2 occurance - 'e', 'r'

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = scanner.nextLine();
        getOccuringChar(str);
    }

    // first solution
    static void getOccuringChar(String str) {
        char symbols[] = new char[str.length()];
        int counter[] = new int[str.length()];
        char symbol;
        int count = 1;
        String temp = "";
        int tempIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (temp.indexOf(str.charAt(i)) == -1) {
                symbol = str.charAt(i);
                for (int j = i + 1; j < str.length(); j++) {
                    if (symbol == str.charAt(j)) {
                        count++;
                    }
                }
                temp = temp + symbol;
                symbols[tempIndex] = symbol;
                counter[tempIndex] = count;
                count = 1;
                tempIndex++;
            }
        }
        int buf;
        char bufChar;
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < counter.length - 1; j++) {
                if (counter[j] > counter[j + 1]) {
                    buf = counter[j];
                    counter[j] = counter[j + 1];
                    counter[j + 1] = buf;
                    bufChar = symbols[j];
                    symbols[j] = symbols[j + 1];
                    symbols[j + 1] = bufChar;
                }
            }
        }
        String temp2 = "";
        String tmp;
        for (int i = 0; i < symbols.length; i++) {
            if (counter[i] != 0 && temp2.indexOf(symbols[i]) == -1) {
                temp2 = temp2 + symbols[i];
                tmp = "" + symbols[i];
                for (int j = i + 1; j < symbols.length; j++) {
                    if (counter[i] == counter[j] && temp2.indexOf(symbols[j]) == -1) {
                        tmp = tmp + "', " + "'" + symbols[j];
                        temp2 = temp2 + symbols[j];
                    }
                }
                System.out.println(counter[i] + " occurance - " + "'" + tmp + "'");
            }
        }
    }


/*    // second solution
    static void getOccuringChar(String str) {
        Map<Character, Integer> count = new HashMap();

        for (char ch : str.toCharArray()) {
            Character lower = Character.toLowerCase(ch);
            Integer c = count.get(lower);
            if (c == null) c = 0;
            count.put(lower, ++c);
        }

        Map<Integer, List<Character>> result = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            Integer numberOfOccurrence = count.get(entry.getKey());
            List<Character> list = result.get(numberOfOccurrence);
            if (list == null) list = new ArrayList<>();
            list.add(entry.getKey());
            result.put(numberOfOccurrence, list);
        }

        for (Map.Entry<Integer, List<Character>> entry : result.entrySet()) {
            List<Character> list = entry.getValue();
            String text = "";
            for (int i = 0; i < list.size(); i++) {
                text = text + " " + "'" + list.get(i) + "'" + ",";
            }
            System.out.println(entry.getKey() + " Occurrence - " + text);
        }

    }*/

}
