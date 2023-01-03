// Write a function to find if a number is a palindrome or not. Take number as parameter.//

package com.questions;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        System.out.println(Palindrome(n));
    }
    static String Palindrome(int n) {
        int a = 0;
        int num = n;
        while(n>0){
            int rem = n%10;
            a = rem + a*10;
            n=n/10;
        }
        if (num==a){
            return "Palindrome" ;
        } else {
            return "Not Palindrome";
        }
    }
}
