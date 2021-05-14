package HomeWork16;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RefactorMe {
    public static final String file = "/Users/v.kryvulia/Desktop/file2";
    static List<Integer> list = new ArrayList<>();
    static String strLine = "";

    public static void readFromFile() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            while (strLine != null) {
                strLine = br.readLine();
                StringBuilder sb = new StringBuilder();
                sb.append(strLine).append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine == null)
                    break;
                list.add(Integer.valueOf(strLine));
            }
        } catch (Exception e) {
            System.err.println("Unable to read the file.");
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void convertList() {
        Integer[] a = list.toArray(new Integer[list.size() + 10]);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + "_");
            for (int j = list.size(); j < list.size() + 10; j++) {
                a[j] = (int) (Math.random() * 100);
            }
        }
        System.out.println();
        for (Integer integer : a) {
            System.out.print(" " + integer);
        }
    }
}