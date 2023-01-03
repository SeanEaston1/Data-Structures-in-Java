// Take name as input and print a greeting message for that particular name.

package com.questions;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey!! What's your name ? ");
        String name = input.next();
        System.out.println("Hello " + name);
    }
}
