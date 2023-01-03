package com.tanay;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        System.out.print("Enter first number: ");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int sum = first + second;

        System.out.println("Sum is " + sum);
    }
}
