// Perimeter Of Circle

package com.basicquestions;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float r = input.nextFloat();

        float perimeter = (float)(2*3.14*r);

        System.out.println("Perimeter is " + perimeter);
    }
}
