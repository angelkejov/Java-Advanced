package company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ingredientsArray = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        for (int i = 0; i < ingredientsArray.length; i++) {
            ingredients.offer(ingredientsArray[i]);
        }

        ArrayDeque<Integer> freshness = new ArrayDeque<>();

        int[] freshnessArray = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < freshnessArray.length; i++) {
            freshness.push(freshnessArray[i]);
        }

        int pearSourCount = 0;
        int theHarvest = 0;
        int appleHinny = 0;
        int hightFashion = 0;

        for (int i = 0; i < ingredients.size(); i++) {
            for (int j = 0; j < freshness.size(); j++) {
                int ingredient = ingredients.getFirst();
                int freshnes = freshness.getFirst();

                if (ingredient == 0) {
                    ingredients.poll();
                }

                if (ingredient * freshnes == 150) {
                    ingredients.poll();
                    freshness.pop();
                    pearSourCount++;
                } else if (ingredient * freshnes == 250) {
                    ingredients.poll();
                    freshness.pop();
                    theHarvest++;
                } else if (ingredient * freshnes == 300) {
                    ingredients.poll();
                    freshness.pop();
                    appleHinny++;
                } else if (ingredient * freshnes == 400) {
                    ingredients.poll();
                    freshness.pop();
                    hightFashion++;
                } else {
                    freshness.pop();
                    ingredient += 5;

                    ingredients.poll();
                    ingredients.offer(ingredient);

                }
            }
        }

        if (ingredients.isEmpty()) {
            System.out.println("It's party time! The cocktails are ready!");

            System.out.printf("# Apple Hinny --> %d%n", appleHinny);
            System.out.printf("# High Fashion --> %d%n", hightFashion);
            System.out.printf("# Pear Sour --> %d%n", pearSourCount);
            System.out.printf("# The Harvest --> %d%n", theHarvest);
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
            System.out.println("Ingredients left: " + ingredients.size());
        }
    }
}
