package HomeWork14;

import java.io.File;
import java.io.IOException;

public class qwe {
    public static void main(String[] argv) throws IOException {

        File folder = new File("/Users/v.kryvulia/Desktop/test");
        File[] listOfFiles = folder.listFiles();
        System.out.println(listOfFiles);
        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {

                File f = new File("/Users/v.kryvulia/Desktop/test"+listOfFiles[i].getName());

                f.renameTo(new File("/Users/v.kryvulia/Desktop/test"+i+".txt"));
            }
        }

        System.out.println("conversion is done");
        System.out.println(listOfFiles);
    }
}
