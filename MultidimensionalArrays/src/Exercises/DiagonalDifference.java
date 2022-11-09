package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        int[][] matrix = readMatrix(rows, sc);

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int i = 0, j = 0; i < rows && j < rows; i++, j++) {
            primaryDiagonal = primaryDiagonal + matrix[i][j];
        }
        for (int i = 0,j = rows - 1 ; i < rows && j >= 0 ; i++, j--) {
            secondaryDiagonal = secondaryDiagonal + matrix[i][j];
        }
        int diff = Math.abs(primaryDiagonal - secondaryDiagonal);
        System.out.println(diff);
    }
    private static int[][] readMatrix(int rows, Scanner sc) {
        int[][] matrix = new int[rows][rows];
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }
        return matrix;
    }
}
