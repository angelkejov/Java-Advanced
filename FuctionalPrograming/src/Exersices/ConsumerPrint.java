package Exersices;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] names = input.split("\\s+");

        Consumer<String> printName = System.out::println;
        Arrays.stream(names).forEach(printName);
    }
}
