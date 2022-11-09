package Exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes {

    public static void main(String[] args) throws IOException {
        String pathStr = "C:\\Users\\ani_k\\OneDrive\\Работен плот\\Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        Path path = Path.of(pathStr);
        List<String> lines = Files.readAllLines(path);

        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationCount = 0;
        for (String line : lines) {
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                line = line.toLowerCase();
                if (c == 'a' || c == 'u' || c == 'o' || c == 'e' || c == 'i') {
                    vowelsCount++;
                } else if (c == '?' || c == '.' || c == '!' || c == ',') {
                    punctuationCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        writer.write("vowels: " + vowelsCount);
        writer.write("consonants: " + consonantsCount);
        writer.write("punctuation: " + punctuationCount);

        writer.close();
    }
}
