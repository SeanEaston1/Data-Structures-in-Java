package com.tanay;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee ID");
        int empID = input.nextInt();
        switch (empID) {
            case 1 -> System.out.println("Tanay");
            case 2 -> System.out.println("Ashish");
            case 3 -> System.out.println("Abhishek");
            case 4 -> {
                System.out.println("Enter the department:");
                String department = input.next();
                switch (department) {
                    case "IT" -> System.out.println("Software Engineer");
                    case "Manager" -> System.out.println("Management");
                }
            }
            default -> System.out.println("Invalid");
        }
    }
}
