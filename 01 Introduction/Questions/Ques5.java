// Take 2 numbers as input and print the largest number.

package com.questions;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        float num1 = input.nextFloat();

        System.out.print("Enter the Second Number: ");
        float num2 = input.nextFloat();

        if(num1>num2){
            System.out.println("Largest number is " + num1);
        } else {
            System.out.println("Largest number is " + num2);
        }
    }
}
