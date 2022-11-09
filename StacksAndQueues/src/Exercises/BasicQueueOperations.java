package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        sc.nextLine();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int integer = Integer.parseInt(sc.next());
            queue.offer(integer);
        }
        for (int i = 0; i < s; i++) {
            queue.poll();
        }
        if (queue.contains(x)) {
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                int min = Integer.MAX_VALUE;
                for (Integer integer : queue) {
                    if (min > integer) {
                        min = integer;
                    }
                }
                System.out.println(min);
            } else {
                System.out.println(0);
            }
        }

    }
}
