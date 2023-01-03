// Write a program to print whether a number is even or odd, also take input from the user.

package com.questions;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if (num%2==0){
            System.out.println("This is an Even number.");
        } else {
            System.out.println("This is an Odd number.");
        }
    }
}
