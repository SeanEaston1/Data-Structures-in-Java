// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.//

package com.questions;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = input.nextInt();

        System.out.println("Maximum is = " + checkmax(num1,num2,num3));
        System.out.println("Minimum is = " + checkmin(num1,num2,num3));

    }

    static int checkmax(int num1, int num2, int num3) {
        if(num1>num2){
            if (num1>num3){
                return num1;
            } else {
                return num3;
            }
        } if (num2>num3){
            return num2;
        } else {
            return num3;
        }
    }

    static int checkmin(int num1, int num2, int num3) {
        if(num1<num2){
            if (num1<num3){
                return num1;
            } else {
                return num3;
            }
        } if (num2<num3){
            return num2;
        } else {
            return num3;
        }
    }
}
