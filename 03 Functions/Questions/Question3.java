// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.//

package com.questions;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println(eligible(age));
    }

    static String eligible(int age) {
        if (age>18)
            return "Eligible";
        else
            return "Not-Eligible";
    }
}
