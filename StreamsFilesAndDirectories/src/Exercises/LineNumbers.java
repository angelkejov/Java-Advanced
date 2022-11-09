package Exercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\ani_k\\OneDrive\\Работен плот\\Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        Path path1 = Path.of(path);
        List<String> lines = Files.readAllLines(path1);

        PrintWriter writer = new PrintWriter("output-line-numbers.txt");

        int countRow = 1;
        for (String line : lines) {
            writer.println(countRow + ". " + line);
            countRow++;
        }

        writer.close();
    }
}
