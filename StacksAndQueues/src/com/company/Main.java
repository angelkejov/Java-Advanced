package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        String navigation = sc.nextLine();
        String current = null;

        while (!navigation.equals("Home")) {
            boolean hasNoURLs = false;
            if (navigation.equals("back")) {
                if (!history.isEmpty()) {
                    current = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    hasNoURLs = true;
                }
            } else {
                if (current != null) {
                    history.push(current);
                }
                current = navigation;
            }

            if (!hasNoURLs) {
                System.out.println(current);
            }
            navigation = sc.nextLine();
        }
    }
}
