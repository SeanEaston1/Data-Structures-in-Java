package com.tanay;

import java.util.Scanner;

public class MaximumValueOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {77,56,71,4,3};

        System.out.println(max(arr));
    }
    static int max(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(array[i], max);
        }
        return max;
    }
}
