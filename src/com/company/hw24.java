package com.company;

import java.util.Scanner;

public class hw24 {
    public static void main(String[] args) {
        int num, randomGt, randomLt;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input a number: ");

        num = userInput.nextInt();
        if (num > 100) {
            int min = 50;
            randomGt = (int) (Math.random() * (num - min + 1) + min);
            String greaterThan = String.valueOf(randomGt);
            System.out.println(greaterThan);
        } else if (num < 100) {
            int min = 0, max = 50;
            randomLt = (int) (Math.random() * (max - min + 1) + min);
            String lessThan = String.valueOf(randomLt);
            System.out.println(lessThan);
        }


    }
}
