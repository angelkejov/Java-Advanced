package Exersices;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Set<String> input = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            input.add(str);
        }
        input.forEach(System.out::println);
    }
}
