// Area Of Circle Java Program

package com.basicquestions;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float r = input.nextFloat();

        float area = (float)(3.14 * r * r);

        System.out.println("Area is " + area);
    }
}
