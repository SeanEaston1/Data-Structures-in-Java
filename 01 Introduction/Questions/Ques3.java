package com.questions;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal, P: ");
        int P = input.nextInt();
        System.out.print("Enter Time, T: ");
        int T = input.nextInt();
        System.out.println("Enter Rate, R: ");
        int R = input.nextInt();

        int SI = (P*R*T)/100;

        System.out.println("Simple interest is " + SI);
    }
}
