package com.tanay;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // *** TYPE CONVERSION *** //
        System.out.print("Enter a number: ");
        float num1 = input.nextInt(); // It will convert the given 'Integer' value (input) into a 'Float' value (output)
        System.out.println(num1);

        int a = 'A'; // It will convert a 'char' value into an 'Integer' value (it's ascii value)
        System.out.println(a);


        // *** TYPE CASTING *** //
        System.out.print("Enter a number: ");
        int num2 =  (int)(input.nextFloat()); // It will convert any input into 'Integer' value, but the condition is it must be compatible
        System.out.println(num2);


        // *** TYPE PROMOTION IN EXPRESSION *** //
        byte b = 40;
        byte c = 50;
        byte d = 100;
        int e = (b*c)/d; // It is just promoting the data type when going in the expression
        System.out.println(e);


        // JAVA IS UNICODE i.e. YOU CAN PRINT ANYTHING IN JAVA //
        System.out.println("नमस्ते");


    }
}
