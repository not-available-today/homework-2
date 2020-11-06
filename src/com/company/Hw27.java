package com.company;

import java.util.Scanner;

public class Hw27 {
    public static void main(String[] args) {
        String monthName;
        Scanner input = new Scanner(System.in);

        System.out.println("Which month would you like to see? Input month name (e.g. \"January\"): ");
        monthName = input.nextLine();

        switch (monthName) {
            case "January":
                System.out.println("January has 31 days.");
                break;
            case "February":
                System.out.println("Depending on the year, February can have 28 or 29 days.");
                break;
            case "March":
                System.out.println("March has 31 days.");
                break;
            case "April":
                System.out.println("April has  30 days.");
                break;
            case "May":
                System.out.println("May has 31 days.");
                break;
            case "June":
                System.out.println("June has 30 days.");
                break;
            case "July":
                System.out.println("July has 31 days.");
                break;
            case "August":
                System.out.println("August has 31 days.");
                break;
            case "September":
                System.out.println("September has 30 days.");
                break;
            case "October":
                System.out.println("October has 31 days.");
                break;
            case "November":
                System.out.println("November has 30 days.");
                break;
            case "December":
                System.out.println("December has 31 days.");
                break;
            default:
                System.out.println("Either capitalize the name or top smoking crack, there is no month with a name like that.");
        }

    }
}
