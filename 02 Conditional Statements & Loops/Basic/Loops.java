package com.tanay;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
            Syntax of for loop :
            for(initialisation; condition; increment/decrement){
                   // Statement //
            }
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(num + "X" + i + "=" + num*i);
        }


        /*
            Syntax of while loop :
            while (condition){
                   // Statement //
                   // Increment or Decrement //
            }
        */
        int n = 1;
        while(n<=5)
        {
            System.out.println(n);
            n++;
        }


        /*
            Syntax of do-while loop :
            do {
                    // Statement //
                   // Increment or Decrement //
            } while (condition);
        */
        int a=1;
        do{
            System.out.println(n);
            a++;
        }  while (a<=5);
    }
}