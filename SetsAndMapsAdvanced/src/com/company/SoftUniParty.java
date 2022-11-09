package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> people = new TreeSet<>();
        String input = sc.nextLine();
        while (!input.equals("PARTY")) {
            people.add(input);
            input = sc.nextLine();
        }
        input = sc.nextLine();
        while (!input.equals("END")) {
            people.remove(input);
            input = sc.nextLine();
        }
        System.out.println(people.size());
        System.out.println(String.join(System.lineSeparator(), people));
    }
}
