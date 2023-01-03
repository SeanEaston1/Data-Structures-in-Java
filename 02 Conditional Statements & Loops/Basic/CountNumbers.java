// Input two numbers, find that how many times second number digit is present in first number

package com.tanay;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = input.nextInt();

        System.out.println("Enter the number you want to count: ");
        int a = input.nextInt();

        int count = 0;

        while(n>0){
            int r = n%10;
            if (r==a){
                count++;
            }
            n = n / 10;
        }
        System.out.println("The number occurred " + count + " times");
    }
}
