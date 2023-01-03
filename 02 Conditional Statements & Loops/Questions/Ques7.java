// Area Of Equilateral Triangle

package com.basicquestions;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side: ");
        float a = input.nextFloat();

        float area = (float)((1.732 * a * a)/4);

        System.out.println("Area is " + area);
    }
}
