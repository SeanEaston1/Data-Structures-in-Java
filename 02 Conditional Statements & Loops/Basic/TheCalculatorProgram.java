// The Calculator Program

package com.tanay;

import java.util.Scanner;

public class TheCalculatorProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from the user till user does not press x or X //

        int ans = 0;

        while (true){
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                System.out.print("Enter the first number: ");
                int a = input.nextInt();
                System.out.print("Enter the second number: ");
                int b = input.nextInt();

                if (op == '+'){
                    ans = a + b;
                }
                if (op == '-'){
                    ans = a - b;
                }
                if (op == '*'){
                    ans = a * b;
                }
                if (op == '/'){
                    if (b!=0){
                        ans = a / b;
                    }
                }
                if (op == '%'){
                    ans = a % b;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid operation ");
            }
            System.out.println(ans);
        }
    }
}
