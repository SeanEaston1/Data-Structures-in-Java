// Find the nth Fibonacci number

package com.tanay;

import java.util.Scanner;

public class FibonacciNumbers1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;

        // With while loop
//        int count = 2;
//        while (count <= n){
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }

        // With for loop
        for (int count = 2; count <= n; count++) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println(b);
    }
}

