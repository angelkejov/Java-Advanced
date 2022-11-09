package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();
        String input = sc.nextLine();
        while (!input.equals("END")) {
            String[] tokens = input.split(", ");
            String action = tokens[0];
            String registration = tokens[1];

            if (action.equals("IN")) {
                parkingLot.add(registration);
            } else {
                parkingLot.remove(registration);
            }
            input = sc.nextLine();
        }

        String output = "";
        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            output = String.join(System.lineSeparator(), parkingLot);
            System.out.println(output);
        }
    }
}
