package HomeWork14;


import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 4. Create program which shuffle 10 files in folder (files receive new order in folder).
// After every run of program files are shuffled in new order. Length of file names is constant
public class Task4 {
    public static void main(String a[]) {

        File file = new File("/Users/v.kryvulia/Desktop/test");
        List<String> fileList = Arrays.asList(file.list());
        Collections.shuffle(fileList);
        for (String name : fileList) {
            System.out.println(name);
        }

    }


}
