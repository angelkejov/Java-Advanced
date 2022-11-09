package Exercises;

import java.util.*;
import java.util.regex.Pattern;

public class BasicStackOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        sc.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int integer = Integer.parseInt(sc.next());
            stack.push(integer);
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if (stack.contains(x)) {
            System.out.println("true");
        } else {
            if (!stack.isEmpty()) {
                int min = Integer.MAX_VALUE;
                for (Integer integer : stack) {
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
