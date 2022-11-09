package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        String input = sc.nextLine();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.peek());
                    queue.poll();
                }
            } else {
                queue.offer(input);
            }
            input = sc.nextLine();
        }
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
