package com.company;

import java.util.Scanner;

public class hw26 {
    public static void main(String[] args) {
        int day;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a day of the week (1-7)");
        day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday >:(");
                break;
            case 2:
                System.out.println("Tuesday :(");
                break;
            case 3:
                System.out.println("Wednesday :/");
                break;
            case 4:
                System.out.println("Thursday :|");
                break;
            case 5:
                System.out.println("Friday :)");
                break;
            case 6:
                System.out.println("Saturday! >:D");
                break;
            case 7:
                System.out.println("Sunday -_-");
                break;
            default:
                System.out.println("Ты чё несёшь пидр, это разви день недели?");
        }

    }
}
