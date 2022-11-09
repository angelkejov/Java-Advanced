package com.company;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    String path = "input.txt";

        FileOutputStream outputStream = new FileOutputStream("out");
	    try (FileInputStream fileInputStream = new FileInputStream(path)) {
	        int value = fileInputStream.read();
	        while (value != -1) {
                System.out.print(Integer.toBinaryString(value) + " ");
                value = fileInputStream.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
