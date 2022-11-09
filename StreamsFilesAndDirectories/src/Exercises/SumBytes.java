package Exercises;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumBytes {

    public static void main(String[] args) throws IOException {
        String pathString = "C:\\Users\\ani_k\\OneDrive\\Работен плот\\Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        int sum = 0;
        try {
            Path path = Path.of(pathString);
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    int ascii = (int)c;

                    sum += ascii;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error with file reading");
        }
        System.out.println(sum);
    }
}
