package com.tanay;

import java.util.Scanner;

public class Arguments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String S = input.next();

        String ans = wishing(S);
        System.out.println(ans);
    }
    // Pass the value of numbers when you are calling the method in main() //
    // wishing (data_type name)
    static String wishing(String name) {
        String greeting = "Hello " + name + "!!! Have a nice day. ";
        return greeting;
    }
}
