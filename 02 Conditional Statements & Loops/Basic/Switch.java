package com.tanay;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Example 1
//        System.out.print("Enter the name of the fruit: ");
//        String fruit = input.next();
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Sweet red fruit");
//            case "Orange" -> System.out.println("A round fruit");
//            case "Grapes" -> System.out.println("A small fruit");
//            default -> System.out.println("Invalid");
//        }

        // Example 2 // To check the day by giving a number //
//        System.out.print("Enter the day number: ");
//        int day = input.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        // Example 3 // To check if it is Weekend or Weekday
        System.out.println("Enter the day number: ");
        int day = input.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}
