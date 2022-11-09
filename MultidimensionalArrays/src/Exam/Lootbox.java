package Exam;

import java.util.*;

public class Lootbox {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] queueInput = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> firstLootBox = new ArrayDeque<>();
        for (int i = 0; i < queueInput.length; i++) {
            firstLootBox.offer(queueInput[i]);
        }
        int[] stackInput = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> secondLootBox = new ArrayDeque<>();
        for (int i = 0; i < stackInput.length; i++) {
            secondLootBox.push(stackInput[i]);
        }

        int firstItem = 0;
        int lastItem = 0;
        int sum = 0;

        List<Integer> summonedItems = new ArrayList<>();
        while (true) {
            if (firstLootBox.size() <= 0 || secondLootBox.size() <= 0) {
                if (firstLootBox.isEmpty()) {
                    System.out.println("First lootbox is empty");
                } else {
                    System.out.println("Second lootbox is empty");
                }
                int summonedSum = 0;
                for (Integer summonedItem : summonedItems) {
                    summonedSum += summonedItem;
                }
                if (summonedSum >= 100) {
                    System.out.printf("Your loot was epic! Value: %d", summonedSum);
                } else {
                    System.out.printf("Your loot was poor... Value: %d", summonedSum);
                }
                break;
            }
            firstItem = firstLootBox.peek();
            lastItem = secondLootBox.peek();
            sum = firstItem + lastItem;

            if (sum % 2 == 0) {
                summonedItems.add(sum);
                firstLootBox.poll();
                secondLootBox.pop();
            } else {
                firstLootBox.offer(lastItem);
                secondLootBox.poll();
            }
        }
    }
}
