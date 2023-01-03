package com.tanay;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        System.out.print("Please enter some input: "); // displaying question or output

        Scanner input = new Scanner(System.in); // scanning the input by the user
        int rollno = input.nextInt();  // assigning a value to the input i.e. rollno

        System.out.println("Your roll no is " + rollno); // giving output with scanned input
    }
}