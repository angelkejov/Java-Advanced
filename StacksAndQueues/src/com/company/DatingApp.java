package com.company;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DatingApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> m = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> f = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        ArrayDeque<Integer> males = new ArrayDeque<>(m);
        ArrayDeque<Integer> females = new ArrayDeque<>(f);

        int matchCount = 0;
        int lastMale = 0;
        int firstFemale = 0;
        for (int i = 0; i < males.size(); i++) {
            for (int j = 0; j < females.size(); j++) {
                lastMale = males.peekLast();
                firstFemale = females.peek();
                if (lastMale <= 0) {
                    males.pollLast();
                } else if (firstFemale <= 0) {
                    females.pop();
                }
                if (firstFemale == lastMale) {
                    matchCount++;
                    females.pop();
                    males.pollLast();
                } else {
                    females.pop();
                    lastMale -= 2;
                }
            }
        }
        System.out.println(matchCount);
        System.out.println(males.size());
        System.out.println(females.size());
    }
}
