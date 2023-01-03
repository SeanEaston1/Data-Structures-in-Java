// Input currency in rupees and output in USD.

package com.questions;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        float amount = input.nextFloat();

        System.out.println("Amount in Dollars: " + amount/79.95 );
    }
}
