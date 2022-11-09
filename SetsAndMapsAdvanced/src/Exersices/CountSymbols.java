package Exersices;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        TreeMap<Character, Integer> symbolCount = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (symbolCount.containsKey(currentSymbol)) {
                int currentCount = symbolCount.get(currentSymbol);
                symbolCount.put(currentSymbol, currentCount + 1);
            } else {
                symbolCount.put(currentSymbol, 1);
            }
        }
        symbolCount.forEach((key, value) -> System.out.println(key + ": " + value + " time/s"));
    }
}
