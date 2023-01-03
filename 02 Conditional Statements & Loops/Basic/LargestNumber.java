// Take 3 integer input from keyboard. Find the largest numbers among them

package com.tanay;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Enter 3 numbers: ");

        // METHOD 1 (normal)
//        if(a>b){
//            if (a>c){
//                System.out.println("The largest number is " + a);
//            } else {
//                System.out.println("The largest number is " + c);
//            }
//        } else if (b>c) {
//            System.out.println("The largest number is " + b);
//        } else {
//            System.out.println("The largest number is " + c);
//        }

        // METHOD 2 (more optimized)
//        int max = a;
//        if (b>max){
//            max = b;
//        }
//        if (c>max){
//            max = c;
//        }
//        System.out.println("The largest number is " + max);
//
        // METHOD 3 (more optimized)
          int max = Math.max(c, Math.max(a,b));
          System.out.println("The largest number is " + max);
    }
}
