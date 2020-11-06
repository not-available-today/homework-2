package com.company;

import java.util.Random;
import java.util.Scanner;

public class Hw25 {
    public static void main(String[] args) {
        int rand1, rand2, max;
        String operator;

        max = 100;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        rand1 = rand.nextInt(max);
        rand2 = rand.nextInt(max);

        System.out.println("Chose an operator: +, -, *, /");
        operator = input.next();

        switch (operator) {
            case "+":
                System.out.println(rand1 + rand2);
                break;
            case "-":
                System.out.println(rand1 - rand2);
                break;
            case "*":
                System.out.println(rand1 * rand2);
                break;
            case "/":
                System.out.println(rand1 / rand2);
            default:
                System.out.println("That won't work.");
        }


    }
}

