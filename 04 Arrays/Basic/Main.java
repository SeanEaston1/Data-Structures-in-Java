package com.tanay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
             SYNTAX OF AN ARRAY //
             datatype[] variable_name = new datatype[size];
        */

        int[] rollno; // DECLARATION : rollno is getting defined in the stack //

        rollno = new int[5]; // INITIALIZATION : actually here object is being created in the memory (heap) //

        System.out.println(rollno[0]); // It will print '0' as there is no value defined //


        int[] rno = {23,34,3,4,5,}; // DECLARING and INITIALIZING AT THE SAME TIME //

        System.out.println(rno[3]); // It will print '4' as the value is defined //
    }
}
