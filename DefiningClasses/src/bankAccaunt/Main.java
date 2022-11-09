package bankAccaunt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, BankAccaunt> bankAccaunts = new HashMap<>();

        String input = sc.nextLine();
        BankAccaunt bankAccaunt = new BankAccaunt();
        int accCounter = 0;
        while (!input.equals("End")) {
            String[] tokens = sc.nextLine().split("\\s+");

            String output = null;
            switch (tokens[0]) {
                case "Create":
                    BankAccaunt accaunt = new BankAccaunt();
                    bankAccaunts.put(accaunt.getId(), accaunt);
                    output = "Account ID" + accaunt.getId() + " created";
                    break;

                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);

                    if (!bankAccaunts.containsKey(id)) {
                        output = "Account does not exist";
                    } else {
                        bankAccaunts.get(id).deposit(amount);
                        output = "Deposited %d " + amount + "to ID" + id;
                    }
                    break;

                case "SetInterest":
                    BankAccaunt.setIntrestRate(Double.parseDouble(tokens[1]));
                    break;

                case "GetInterest":
                    int ids = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);

                    if (!bankAccaunts.containsKey(ids)) {
                        output = "Account does not exist";
                    } else {
                        double intrestRate = bankAccaunts.get(ids).getIntrestRate(years);
                        output = String.format("%.2f", intrestRate);
                    }
                    break;
            }

            if (output != null) {
                System.out.println(output);
            }
            input = sc.nextLine();
        }
    }
}
