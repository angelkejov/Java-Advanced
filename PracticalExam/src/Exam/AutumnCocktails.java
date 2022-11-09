package Exam;

import java.util.*;
import java.util.stream.Collectors;

public class AutumnCocktails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(stack::push);


        Map<String, Integer> completedDrinks = new TreeMap<>();


        int pearSourValue = 150;
        int theHarvestValue = 250;
        int appleHinnyValue = 300;
        int highFashionValue = 400;

        String hightFashion = "High Fashion";
        String appleHinny = "Apple Hinny";
        String theHarvest = "The Harvest";
        String pearSour = "Pear Sour";

        int pearSourCompleted = 0;
        int theHarvestCompleted = 0;
        int appleHinnyCompleted = 0;
        int highFashionCompleted = 0;

        while (!queue.isEmpty() && !stack.isEmpty()) {
            int queueNumber = queue.peek();
            int stackNumber = stack.peek();

            int totalFreshness = queueNumber * stackNumber;


            if (totalFreshness == pearSourValue) {
                pearSourCompleted++;
                completedDrinks.put(pearSour, pearSourCompleted);
                queue.poll();
                stack.pop();
            } else if (totalFreshness == theHarvestValue) {
                theHarvestCompleted++;
                completedDrinks.put(theHarvest, theHarvestCompleted);
                queue.poll();
                stack.pop();
            } else if (totalFreshness == appleHinnyValue) {
                appleHinnyCompleted++;
                completedDrinks.put(appleHinny, appleHinnyCompleted);
                queue.poll();
                stack.pop();
            } else if (totalFreshness == highFashionValue) {
                highFashionCompleted++;
                completedDrinks.put(hightFashion, highFashionCompleted);
                queue.poll();
                stack.pop();
            } else {
                stack.pop();
                int numberToModify = queueNumber;
                numberToModify = numberToModify + 5;
                queue.remove();
                queue.add(numberToModify);
            }
            if(!queue.isEmpty() && queue.peek() <= 0){
                queue.poll();
            }
        }
        int stackSum = 0;
        int queueSum = 0;

        while (!queue.isEmpty()){
            queueSum += queue.poll();
        }
        while (!stack.isEmpty()){
            stackSum = stack.pop();
        }

        int finalSum = stackSum + queueSum;

        if (pearSourCompleted >= 1 && theHarvestCompleted >= 1 && appleHinnyCompleted >= 1 && highFashionCompleted >= 1) {
            System.out.print("It's party time! The cocktails are ready!");
            System.out.println();
            for (String drink : completedDrinks.keySet()) {
                System.out.println(" # " + drink + " --> " + completedDrinks.get(drink));
            }
        } else {
            System.out.print("What a pity! You didn't manage to prepare all cocktails.");
            System.out.println();
            System.out.printf("Ingredients left: %d", finalSum);
            System.out.println();
            for (String drink : completedDrinks.keySet()) {
                System.out.println(" # " + drink + " --> " + completedDrinks.get(drink));
            }
        }
    }
}
