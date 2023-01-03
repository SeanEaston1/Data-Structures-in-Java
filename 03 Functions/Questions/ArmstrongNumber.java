package com.questions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // GIVE NUMBER AND FIND IT'S ARMSTRONG NUMBER OR NOT //
        System.out.println("Enter a Number: ");
        int n = input.nextInt();
        System.out.println(ArmNum(n));

        // ALL THE ARMSTRONG NUMBERS BETWEEN GIVEN TWO NUMBERS //
        System.out.println("Enter the First number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = input.nextInt();

        for (int i = num1; i < num2; i++) {
            if (ArmNum(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean ArmNum(int n) {
        int a = 0;
        int b = n;
        while (n > 0) {
            int rem = n % 10;
            a = rem * rem * rem + a;
            n = n / 10;
        }
        return b == a;
    }
}