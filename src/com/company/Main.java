package com.company;

public class Main {

    public static void main(String[] args) {
        int a, b, min, max, sum;
        long realSum;
        min = 10;
        max = 100;
        a = (int) (Math.random() * (max - min + 1) + min);
        b = (int) (Math.random() * (max - min + 1) + min);

        sum = a + b;
        realSum = sum;

        System.out.println(realSum);
    }
}
