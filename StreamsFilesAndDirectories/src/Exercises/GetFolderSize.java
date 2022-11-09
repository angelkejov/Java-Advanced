package Exercises;

import java.io.*;

public class GetFolderSize {

    public static void main(String[] args) throws IOException {
        String pathStr = "E:\\SoftUni\\Java Programming\\Java Advanced\\StreamsFilesAndDirectories\\input.txt";

        File folder = new File(pathStr);

        int folderSize = 0;
        for (File file : folder.listFiles()) {
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);
    }
}
