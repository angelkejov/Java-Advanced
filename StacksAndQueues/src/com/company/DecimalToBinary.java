package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n != 0) {
            stack.push(n % 2);
            n /= 2;
        }
        for (Integer integer : stack) {
            System.out.print(integer);
        }
    }
}
