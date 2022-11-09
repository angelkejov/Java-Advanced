package com.company;

import java.util.*;

public class AverageStudentsGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, ArrayList<Double>> grades = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            if (!grades.containsKey(name)) {
                grades.put(name, new ArrayList<>());
            } else {
                grades.get(name).add(grade);
            }
        }
        for (Map.Entry<String, ArrayList<Double>> stringListEntry : grades.entrySet()) {
            System.out.printf("%s -> ", stringListEntry.getKey());
            for (Double value : stringListEntry.getValue()) {
                System.out.printf("%.2f %n", value);
            }
        }
    }
}
