// Write a function to check if a given triplet is a Pythagorean triplet or not.//

package com.questions;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = input.nextInt();

        System.out.println(pythagorean(num1,num2,num3));
    }
    static String pythagorean(int num1, int num2, int num3) {
        if (num1*num1 == num2*num2 + num3*num3){
            return "Pythagorean Triplet";
        } else if (num2*num2 == num1*num1 + num3*num3) {
            return "Pythagorean Triplet";
        } else if (num3*num3 == num1*num1 + num2*num2) {
            return "Pythagorean Triplet";
        } else {
            return "Not a Pythagorean Triplet";
        }
    }
}
