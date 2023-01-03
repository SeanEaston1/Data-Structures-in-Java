// Find all the number til the nth Fibonacci number

package com.tanay;

import java.util.Scanner;

public class FibonacciNumbers2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(a);
            System.out.println(b);
        } else {
            int count = 2;
            System.out.println(a);
            System.out.println(b);
            while (count <= n) {
                    int temp = b;
                    b = a + b;
                    a = temp;
                    System.out.println(b);
                    count++;
            }
        }

    }
}

