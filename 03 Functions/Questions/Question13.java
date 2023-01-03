// Write a function that returns all prime numbers between two given numbers.//

package com.questions;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();

        for (int i = num1; i < num2; i++) {
            if (prime(i)){
                System.out.println(i);
            }
        }

    }
    static boolean prime(int i){
        int n=2;
        while (i>n){
            if(i%n==0){
                return false;
            }
            n++;
        }
        return true;
    }
}
