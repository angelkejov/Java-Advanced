package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        int startIndex = Integer.parseInt(input[0]);
        int endIndex = Integer.parseInt(input[1]);
        String oddOrEven = sc.nextLine();

//        Predicate<String[]> res = strings -> {
//            Arrays.stream(strings).map(Integer::parseInt);
//            retu
//        };
    }
}
