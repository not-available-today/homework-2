package com.company;

public class hw23 {
    public static void main(String[] args) {
        int randomNum, square, min, max;

        min = 10;
        max = 100;

        randomNum = (int)(Math.random() * (max - min + 1) + min);
        square = (int) Math.pow(randomNum, 2);

        String sqstr = String.valueOf(square);

        System.out.println(sqstr);
    }
}
