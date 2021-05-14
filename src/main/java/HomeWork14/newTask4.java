package HomeWork14;

import java.io.File;

public class newTask4 {

    public static void main(String[] args) {
        File file = new File("/Users/v.kryvulia/Desktop/test");
        if (file.canWrite()) {
            for (File each : file.listFiles()) {
                String name = shuffle(each.getName());
                each.renameTo(new File(each.getParent() + "/" + name));
            }
        }
    }

    public static String shuffle(String old) {
        if (old.length() <= 1) {
            return old;
        }
        int extIndex = old.lastIndexOf('.');
        String ext;
        if (extIndex == -1) {
            ext = "";
        } else {
            ext = old.substring(extIndex);
        }
        String name;
        if (extIndex == -1) {
            name = old;
        } else {
            name = old.substring(0, extIndex);
        }
        return name.substring(1) + name.charAt(0) + ext;
    }


}
