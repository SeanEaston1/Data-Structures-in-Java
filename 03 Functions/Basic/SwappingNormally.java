package com.tanay;

import java.util.Scanner;

public class SwappingNormally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = input.nextInt();

        System.out.println("Enter number 2: ");
        int b = input.nextInt();

        // THIS IS HOW SWAPPING OF 2 NUMBERS IS DONE NORMALLY //
        int temp = a;
        a = b ;
        b = temp;
        System.out.println(a + " " + b);
    }
}
