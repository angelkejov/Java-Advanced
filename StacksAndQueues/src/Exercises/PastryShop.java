package Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PastryShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < arr1.length; i++) {
            queue.offer(arr1[i]);
        }

        int[] arr2 = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < arr2.length; i++) {
            stack.push(arr2[i]);
        }

        int first = 0;
        int last = 0;

        int sum = 0;
        int biscuit = 25;
        int cake = 50;
        int pastry = 75;
        int pie = 100;

        int bCount = 0;
        int cCount = 0;
        int pCount = 0;
        int pieCount = 0;

        int allCookCount = 0;
        while (!stack.isEmpty() && !queue.isEmpty()) {
            first = queue.peek();
            last = stack.peek();

            sum = first + last;

            if (sum == biscuit) {
                bCount++;
                allCookCount++;
                queue.poll();
                stack.pop();
            } else if (sum == cake) {
                queue.poll();
                stack.pop();
                allCookCount++;
                cCount++;
            } else if (sum == pastry) {
                queue.poll();
                stack.pop();
                allCookCount++;
                pCount++;
            } else if (sum == pie) {
                queue.poll();
                stack.pop();
                allCookCount++;
                pieCount++;
            } else {
                queue.poll();

                //TO::DO make "last" += 3;
            }
        }

        if (allCookCount >= 1) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }

        if (queue.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.print("Liquids left: ");
            for (Integer integer : queue) {
                System.out.print(integer + ", ");
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            System.out.print("Ingredients left: ");
            for (Integer integer : stack) {
                System.out.print(integer + ", ");
            }
        }
        System.out.println();

        System.out.println("Biscuit: " + bCount);
        System.out.println("Cake: " + cCount);
        System.out.println("Pie: " + pieCount);
        System.out.println("Pastry: " + pCount);
    }
}
