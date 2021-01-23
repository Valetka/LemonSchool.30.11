package Homework;

import java.io.File;
import java.io.IOException;


public class AbsolutePath {
    public static void main(String[] args) throws IOException {
        String scr = "scr";
        File file = new File(scr);
        System.out.println(file.getAbsolutePath());
        String directoryName = "src";
        File file1 = new File(directoryName);
        File[] paths = file1.listFiles();
        for (File path : paths) {
            if (path.isDirectory()) {
                String[] paths1 = path.list();
                System.out.println(paths1);
            }
            System.out.println(path);
        }
    }
}
