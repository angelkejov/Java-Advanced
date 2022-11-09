package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }

        int n = Integer.parseInt(sc.nextLine());

        int counter = 1;

        while (queue.size() > 1){
            if (counter == n) {
                System.out.println("Removed " + queue.poll());
                counter = 0;
            }
            counter++;
        }

        System.out.println("Last us " + queue.poll());
    }
}
