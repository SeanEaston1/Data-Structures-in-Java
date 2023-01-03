// Area Of Rhombus

package com.basicquestions;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter diagonal1: ");
        float d1 = input.nextFloat();

        System.out.print("Enter diagonal2: ");
        float d2 = input.nextFloat();

        float area = (float)(d1*d2);

        System.out.println("Area is " + area);
    }
}
