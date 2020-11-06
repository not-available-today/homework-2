package com.company;

import java.util.Scanner;

public class hw29 {
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number (25-75): ");
        a = input.nextInt();
        System.out.print("Input the second number (25-75): ");
        b = input.nextInt();

        c = a % 10;
        d = b % 10;
        e = a / 10;
        f = b / 10;

        if (a < 25 || a > 75 || b < 25 || b > 75) {
            System.out.println("Numbers outside range.");
        }else if (c == d || e == f || c == f || d == e) {
            System.out.println("Result: true");
        }
    }

}