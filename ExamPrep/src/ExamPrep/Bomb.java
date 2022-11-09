package ExamPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bomb {

    private static int row = 0;
    private static int cow = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String initialString = bf.readLine();
        StringBuilder sb=new StringBuilder(initialString);
        int size = Integer.parseInt(bf.readLine());

        char[][] matrix = new char[size][size];
        readMatrix(matrix, bf);
        findMatrixPlayer(matrix);

        matrix[row][cow]='P';
        String command;
        while (!(command = bf.readLine()).equals("end")) {
            switch (command) {
                case "up":
                    row-=1;
                    if(row < 0){
                        row+=1;
                        sb.deleteCharAt(sb.length()-1);
                    }else{
                        int add=row+1;
                        matrix[add][cow]='-';
                        if(matrix[row][cow]=='-'){
                            matrix[row][cow]='P';
                        }else {
                            char str=matrix[row][cow];
                            sb.append(str);
                            matrix[row][cow]='P';

                        }
                    }
                    break;
                case "down":
                    row+=1;
                    if(row > matrix.length-1){
                        row-=1;
                        sb.deleteCharAt(sb.length()-1);
                    }else{
                        int add=row-1;
                        matrix[add][cow]='-';
                        if(matrix[row][cow]=='-'){
                            matrix[row][cow]='P';
                        }else {
                            char str=matrix[row][cow];
                            sb.append(str);
                            matrix[row][cow]='P';

                        }
                    }
                    break;
                case "left":
                    cow-=1;
                    if(cow < 0){
                        cow+=1;
                        sb.deleteCharAt(sb.length()-1);
                    }else{
                        int add=cow+1;
                        matrix[row][add]='-';
                        if(matrix[row][cow]=='-'){
                            matrix[row][cow]='P';
                        }else {
                            char str=matrix[row][cow];
                            sb.append(str);
                            matrix[row][cow]='P';

                        }
                    }
                    break;
                case "right":
                    cow+=1;
                    if(cow > matrix.length-1){
                        cow-=1;
                        sb.deleteCharAt(sb.length()-1);
                    }else{
                        int add=cow-1;
                        matrix[row][add]='-';
                        if(matrix[row][cow]=='-'){
                            matrix[row][cow]='P';
                        }else {
                            char str=matrix[row][cow];
                            sb.append(str);
                            matrix[row][cow]='P';

                        }
                    }
                    break;
            }
        }
        System.out.println(sb.toString().trim());
        printMatrix(matrix);
    }

    public static void readMatrix(char[][] matrix, BufferedReader bf) throws IOException {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = bf.readLine().toCharArray();
        }
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void findMatrixPlayer(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'P') {
                    row = i;
                    cow = j;
                }
            }
        }
    }
}
