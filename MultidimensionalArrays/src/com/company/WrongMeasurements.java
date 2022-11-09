package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.next());
        int[][] matrix = readingMatrix(rows, sc);
    }
    private static int[][] readingMatrix(int rows, Scanner sc) {
        int[][] matrix = new int[rows][];;
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }
        return matrix;
    }
}
