// Area Of Triangle

package com.basicquestions;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height: ");
        float h = input.nextFloat();

        System.out.print("Enter base: ");
        float b = input.nextFloat();

        float area = (float)((h*b)/2);

        System.out.println("Area is " + area);
    }
}
