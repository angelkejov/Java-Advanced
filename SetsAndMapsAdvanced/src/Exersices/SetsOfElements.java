package Exersices;

import java.util.*;

public class SetsOfElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        List<Integer> repeatingIntegers = new ArrayList<>();
        int u = n + m;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < n; j++) {
                set1.add(number);
            }
        }
        for (int j = 0; j < m; j++) {
            int number = Integer.parseInt(sc.nextLine());
            set2.add(number);
        }

        for (Integer integer : set1) {

            for (Integer integer1 : set2) {
                if (integer == integer1) {
                    repeatingIntegers.add(integer);
                }
            }
        }

        repeatingIntegers
                .forEach(integer -> System.out.print(integer + " "));
    }
}
