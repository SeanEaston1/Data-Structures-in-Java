package com.questions;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();
        // DISPLAYING THE RESULT //
        check(num);
        // CHECKING AND RETURNING //
        System.out.println(isPrime(num));
    }

    // CHECKING AND RETURNING //
    static boolean isPrime(int num) {
        if (num<=1){
            return false;
        }
        int n = 2;
        while (num>=n*n){
            if (num%n==0){
                return false;
            }
            n++;
        }
        if (num < n * n) {
            return true;
        }
        else {
            return false;
        }
    }

    // DISPLAYING THE RESULT //
    static void check(int num){
        if (num<=1){
            System.out.println("Neither Prime nor Composite");
        }
        else if (num>1){
            int n = 2;
            while (num>= n*n){
                if (num%n==0){
                    System.out.println("Not a Prime Number");
                    break;
                }
                n = n+1;
            }
            if (num<n*n){
                System.out.println("This is a Prime Number");
            }
        }
    }
}
