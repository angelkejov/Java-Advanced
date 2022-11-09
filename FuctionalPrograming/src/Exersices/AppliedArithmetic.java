package Exersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int[] numbers = Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        //add
        Function<int[], int[]> add = array ->
                Arrays
                        .stream(array)
                        .map(num -> num + 1)
                        .toArray();
        // multiply
        Function<int[], int[]> multiply = array ->
                Arrays
                        .stream(array)
                        .map(num -> num * 2)
                        .toArray();

        // subtract
        Function<int[], int[]> subtract = array ->
                Arrays
                        .stream(array)
                        .map(num -> num - 1)
                        .toArray();
        //print
        Consumer<int[]> print = array ->
                Arrays
                        .stream(array)
                        .forEach(number -> System.out.print(number + " "));

        String command = sc.nextLine();
        while (!command.equals("end")) {

            switch (command) {
                case "add":
                    numbers = add.apply(numbers);
                    break;

                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;

                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;

                case "print":
                    print.accept(numbers);
                    break;
            }
            command = sc.nextLine();
        }
    }
}
