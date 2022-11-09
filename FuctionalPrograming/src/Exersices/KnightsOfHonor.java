package Exersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class KnightsOfHonor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> names = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Consumer<String> sirNames = name -> {
            System.out.println("Sir " + name);
        };
        for (String name : names) {
            sirNames.accept(name);
        }
    }
}
