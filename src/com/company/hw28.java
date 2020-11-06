package com.company;

import java.util.Scanner;

public class hw28 {
    public static void main(String[] args) {
        double radius, perimeter, area;
        int userInput;
        Scanner input = new Scanner(System.in);


        radius = 5.0;
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;

        System.out.println("------------MENU-----------\n" +
                "-- enter 1 for calculating area of the circle\n" +
                "-- enter 2 for calculating perimeter of the circle\n" +
                "-- enter 3 for exit.");
        userInput = input.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("The area of the circle is " + area);
                break;
            case 2:
                System.out.println("The perimeter of the cirlce is " + perimeter);
                break;
            default:
                System.out.println("Good bye!");
        }
        }
    }
