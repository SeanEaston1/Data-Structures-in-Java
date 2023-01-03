package com.tanay;

import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {

        //    THE PRIMITIVE DATA TYPES   //

        int roll_no = 64; // Contains 4 bytes
        char letter = 'r'; // Contains 2 bytes
        float marks = 98.65f; // Contains 4 bytes
        double largeDecimalNumbers = 4567676.87878; // Contains 8 bytes
        long largeInteger = 3463753786783L; // Contains 8 bytes
        boolean check = false; // Contains 2 bytes

        //    INPUT/OUTPUT OF DATA TYPES    //
        Scanner input = new Scanner(System.in);

        System.out.println("Enter some number ");
        int reg_no = input.nextInt();   // For integers
        System.out.println(reg_no);

        System.out.println("Enter some name ");
        String name = input.next();   // For strings
        System.out.println(name);

        System.out.println("Enter some decimal ");
        float student_marks = input.nextFloat();   // For floats
        System.out.println(student_marks);

        // You can do more with just input.next____ (anything) //
    }
}
