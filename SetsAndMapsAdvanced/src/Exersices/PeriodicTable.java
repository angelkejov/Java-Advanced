package Exersices;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<String> elements = new TreeSet<>();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] inputElements = input.split("\\s+");

            // way 1
//            for (String inputElement : inputElements) {
//                elements.add(inputElement);
//            }
            // way 2
//            Collections.addAll(elements, inputElements);

            // way 3

            elements.addAll(Arrays.asList(inputElements));
        }
        elements.forEach(e -> System.out.print(e + " "));
    }
}
