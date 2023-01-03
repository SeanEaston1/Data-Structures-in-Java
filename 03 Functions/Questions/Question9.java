// Write a program to print the factorial of a number by defining a method named 'Factorial'.//

package com.questions;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = input.nextInt();

        System.out.println(n + "! = " + Factorial(n));
    }

    static int Factorial(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num = num * i;
        }
        return num;
    }
}

