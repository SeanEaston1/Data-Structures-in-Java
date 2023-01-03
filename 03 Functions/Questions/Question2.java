// Define a program to find out whether a given number is even or odd. //

package com.questions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println(check(num));
    }

    static String check(int num) {
        if (num%2==0){
            return "Even";
        } else {
            return "Odd";
        }
    }
}
