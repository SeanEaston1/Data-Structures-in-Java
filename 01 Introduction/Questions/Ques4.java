// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
// Nice question

package com.questions;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        float a = input.nextFloat();

        System.out.print("Enter the Second Number: ");
        float b = input.nextFloat();

        System.out.println("Enter add for addition: ");
        System.out.println("Enter sub for subtraction: ");
        System.out.println("Enter div for division: ");
        System.out.println("Enter mul for multiplication: ");
        String operator = input.next();

        if (operator.equals("add")){
            float result = a + b;
            System.out.println("You will get " + result);
        } else if (operator.equals("sub")){
            float result = a - b;
            System.out.println("You will get " + result);
        } else if (operator.equals("mul")) {
            float result = a * b;
            System.out.println("You will get " + result);
        } else if (operator.equals("div")) {
            float result = a/b;
            System.out.println("You will get " + result);
        } else{
            System.out.println("Incorrect operator");
        }
    }
}
