package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] females = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Deque<Integer> stackFemales = new ArrayDeque<>();
        for (int i = 0; i < females.length; i++) {
            stackFemales.push(females[i]);
        }

        int[] males = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Deque<Integer> queueMale = new ArrayDeque<>();
        for (int i = 0; i < males.length; i++) {
            queueMale.offer(males[i]);
        }

        int matchCounter = 0;
        while (queueMale.isEmpty() || stackFemales.isEmpty()) {
            for (Integer male : queueMale) {
                if (male <= 0) {
                    queueMale.poll();
                }
                for (Integer female : stackFemales) {
                    if (female <= 0) {
                        stackFemales.pop();
                    }
                    if (male.equals(female)) {
                        matchCounter++;
                        queueMale.poll();
                        stackFemales.pop();
                    } else {
                        stackFemales.pop();
                        male -= 2;
                    }
                    if (female % 25 == 0) {
                        stackFemales.pop();
                        stackFemales.pop();
                    }
                }
                if (male % 25 == 0) {
                    queueMale.poll();
                    queueMale.poll();
                }
            }
        }
        System.out.println("Matches: " + matchCounter);
        System.out.println("Males left: " + queueMale.size());
        System.out.println("Females left: " + stackFemales.size());
    }
}
