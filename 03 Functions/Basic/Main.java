package com.tanay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum1();

        int ans = sum2();
        System.out.println(ans);
    }

    /*
        SYNTAX OF METHODS/FUNCTIONS :-
        access modifier ()    return_type   name() {
               // body
               // return statement;
        }
    */

    // It will just PRINT the value of the function in the main function //
    static void sum1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    // It will RETURN the value of the function in the main function //
    static int sum2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        return sum;
    }
}
