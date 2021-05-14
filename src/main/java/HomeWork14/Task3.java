package HomeWork14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// 3. Create program which read all pairs of values (more then 5 pairs)
// from property file and print them in console in view of map.
public class Task3 {
    public static final String file = "/Users/v.kryvulia/Desktop/file.txt";

    public static void main(String[] args) {
        Map<Integer, String> map = readFromFile(file);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }
    }

    public static Map<Integer, String> readFromFile(String fileName) {
        BufferedReader reader;
        Map<Integer, String> map = new HashMap<>();
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            line = reader.readLine();
            while (line != null) {
                int position = line.indexOf(" ");
                map.put(Integer.valueOf(line.substring(0, position)), line.substring(position + 1));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
