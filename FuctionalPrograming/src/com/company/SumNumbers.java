package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Function<String, Integer> countIntegersInString = str -> str.split(", ").length;
        Function<String, Integer> sumIntegersInString = str ->
                Arrays.stream(str.split(", "))
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println("Count = " + countIntegersInString.apply(input));
        System.out.println("Sum = " + sumIntegersInString.apply(input));
    }
}
