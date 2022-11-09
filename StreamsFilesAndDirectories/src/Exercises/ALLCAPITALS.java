package Exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ALLCAPITALS {

    public static void main(String[] args) throws IOException {
        String pathStr = "C:\\Users\\ani_k\\OneDrive\\Работен плот\\Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        Files.readAllLines(Path.of(pathStr)).forEach(
                line -> {
                    try {
                        writer.write(line.toUpperCase());
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );

        writer.close();
    }
}
