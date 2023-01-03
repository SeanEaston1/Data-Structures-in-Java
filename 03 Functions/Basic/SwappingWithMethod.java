package com.tanay;

import java.util.Scanner;

public class SwappingWithMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = input.nextInt();

        System.out.println("Enter number 2: ");
        int b = input.nextInt();

        change(a,b);

        // BUT THE PROBLEM IS VALUE OF A AND B IS YET NOW CHANGED
        System.out.println(a);
        System.out.println(b);
    }
    // THI IS HOW SWAPPING IS DONE BY A METHOD //
    static void change (int x, int y) {
        int temp = x;
        x = y ;
        y = temp;
        System.out.println(x + " " + y);
    }
}