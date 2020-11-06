package com.company;

public class Hw22 {

    public static void main(String[] args) {
        int a, b, min, max, product;
        long even;
        double odd;
        min = 10;
        max = 100;
        a = (int) (Math.random() * (max - min + 1) + min);
        b = (int) (Math.random() * (max - min + 1) + min);

       product = a * b;
       if(product % 2 == 0) {
           even = product;
           System.out.println("The product of these two random numbers is even. " + even);

       }else if(product % 2 != 0) {
           odd = product;
           System.out.println("The product of these two random numbers is odd. " + odd);
       }
    }
}
