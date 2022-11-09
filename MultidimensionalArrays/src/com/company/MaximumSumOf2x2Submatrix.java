package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimensions = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = readMatrix(rows, cols, sc);

        int sum = 0;
        int biggestSum = 0;
        String res = "";
        for (int i = 0; i < matrix.length - 1; i++) {

            for (int j = 0; j < matrix[i].length - 1; j++) {
                sum = matrix[i][j] + matrix[i + 1][j] + matrix[i][j + 1] + matrix[i + 1][j + 1];
                if (sum > biggestSum) {
                    biggestSum = sum;
                    res = matrix[i][j] + " " + matrix[i][j + 1] + "\n"
                            + matrix[i + 1][j] + " " + matrix[i + 1][j + 1];
                }
            }
        }
        System.out.println(res);
        System.out.println(biggestSum);
    }

    private static int[][] readMatrix(int rows, int cols, Scanner sc) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }
        return matrix;
    }
}
