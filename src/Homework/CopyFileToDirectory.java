package Homework;

import java.io.*;
import java.util.Scanner;

public class CopyFileToDirectory {
    public static void main(String[] args) throws IOException {
        String path1 = "У лукоморья дуб зеленый.txt";
        String separator = File.separator;
        String path2 = "NewFolder"+separator+path1;
        copyFileToDirectory(path1,path2);
    }
    public static void copyFileToDirectory (String path1, String path2) throws IOException {
        File file1 = new File(path1);
        File file2 = new File(path2);
        Scanner scr = new Scanner(file1);
        PrintWriter pw = new PrintWriter(file2);
        while (scr.hasNextLine()){
            String a = scr.nextLine();
            pw.println(a);
        }
        scr.close();
        pw.close();
    }
}
