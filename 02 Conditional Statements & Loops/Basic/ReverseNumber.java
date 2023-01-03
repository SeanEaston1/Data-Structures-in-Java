// A number is input from the keyboard. Show the output as Reverse of that number

package com.tanay;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = input.nextInt();

        int a = 0;

        while(n>0){
            int r = n%10;
            a = r + a*10;
            n = n/10;
        }
        System.out.println("The number is " + a);

    }
}
