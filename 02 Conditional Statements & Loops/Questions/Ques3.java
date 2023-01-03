// Area Of Rectangle Program

package com.basicquestions;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        float l = input.nextFloat();

        System.out.print("Enter breadth: ");
        float b = input.nextFloat();

        float area = (float)(l*b);

        System.out.println("Area is " + area);
    }
}
