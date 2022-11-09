package Exersices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FindTheSmallestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Consumer<List<Integer>> printMinIndexOfMinElement = list -> {
            int min = Collections.min(numbers);
            System.out.println(numbers.lastIndexOf(min));
        };
        printMinIndexOfMinElement.accept(numbers);
    }
}
