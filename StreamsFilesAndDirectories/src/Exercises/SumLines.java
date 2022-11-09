package Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {

    public static void main(String[] args) throws IOException {
        String pathString = "C:\\Users\\ani_k\\OneDrive\\Работен плот\\Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        Path path = Path.of(pathString);
        List<String> allLines = Files.readAllLines(path);
        for (String line : allLines) {
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                int ascii = (int)c;

                sum += ascii;
            }
            System.out.println(sum);
        }
    }
}
