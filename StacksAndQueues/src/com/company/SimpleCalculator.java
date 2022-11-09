package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stackCalculator = new ArrayDeque<>();

        String line = sc.nextLine();
        String [] lineParts  = line.split("\\s+");
        String operation = "";
        int secondOperand = 0;
        for (int i = 0; i < lineParts.length; i++) {
            String token = lineParts[i];
            if(!Character.isDigit(token.charAt(0))){
                operation = token;
            }else{
                stackCalculator.push(Integer.parseInt(token));
            }

            if (!operation.equals("") && stackCalculator.size()==2) {
                if (operation.equals("+")) {
                    secondOperand = stackCalculator.pop() + stackCalculator.pop();
                    stackCalculator.push(secondOperand);
                }
                if (operation.equals("-")) {
                    int secondNumber = stackCalculator.pop();
                    int firstNumber = stackCalculator.pop();
                    secondOperand = firstNumber - secondNumber;
                    stackCalculator.push(secondOperand);
                }
            }
        }
        System.out.println(stackCalculator.peek());
    }
}
