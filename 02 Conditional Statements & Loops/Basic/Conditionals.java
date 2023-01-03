package com.tanay;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        /*
            Syntax of if/else statements :
            if (boolean expression T and F) {
                   // Statement //
            } else {
                   // Statement //
            }
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        int salary = input.nextInt();

        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}