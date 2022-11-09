package com.company;

import java.io.*;

public class PrintEveryThirdLine {

    public static void main(String[] args) throws IOException {
        String path = "input.txt";

        FileInputStream fileOutputStream = new FileInputStream(path);

        InputStreamReader inputStreamReader = new InputStreamReader(fileOutputStream);

        BufferedReader reader = new BufferedReader(inputStreamReader);

        BufferedWriter writer = new BufferedWriter(new PrintWriter("out-third-line.txt"));

        String line = reader.readLine();

        int count = 1;
        while (line != null) {
            if (count % 3 == 0) {
                writer.write(line + System.lineSeparator());
            }
            line = reader.readLine();
            count++;
        }

        writer.flush();
    }
}
