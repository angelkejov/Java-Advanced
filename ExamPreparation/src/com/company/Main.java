package com.company;

import java.util.*;

public class Main {

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

        int firstEl = 0;
        int lastEl = 0;

        int sum = 0;

        List<Integer> claimedItems = new ArrayList<>();
        while (true) {
            firstEl = queue.peek();
            lastEl = stack.peek();

            sum = firstEl + lastEl;
            if (isEven(sum)) {
                claimedItems.add(sum);
                stack.pop();
                queue.poll();
            } else {
                stack.pop();
                queue.offer(lastEl);
            }

            if (queue.isEmpty()) {
                System.out.println("First magic box is empty.");
                break;
            } else if (stack.isEmpty()) {
                System.out.println("Second magic box is empty.");
                break;
            }
        }
        int sumOfClaimedItems = 0;
        for (Integer claimedItem : claimedItems) {
            sumOfClaimedItems += claimedItem;
        }
        if (sumOfClaimedItems >= 90) {
            System.out.println("Wow, your prey was epic! Value: " + sumOfClaimedItems);
        } else {
            System.out.println("Poor prey... Value: " + sumOfClaimedItems);
        }
    }

    private static boolean isEven(int sum) {
        boolean isEven = false;
        if (sum % 2 == 0) {
            isEven = true;
        }

        return isEven;
    }
}
