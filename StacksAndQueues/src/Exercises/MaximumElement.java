package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int commands = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < commands; i++) {
            String[] arr = sc.nextLine().split("\\s+");

            switch (arr[0]) {
                case "1":
                    int numberToPush = Integer.parseInt(arr[1]);
                    stack.push(numberToPush);
                    break;

                case "2":
                    stack.pop();
                    break;

                case "3":
                    if (!stack.isEmpty()) {
                        int max = Integer.MIN_VALUE;
                        for (Integer integer : stack) {
                            if (integer > max) {
                                max = integer;
                            }
                        }
                        System.out.println(max);
                    }
                    break;
            }
        }
    }

}
