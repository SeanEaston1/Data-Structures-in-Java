package com.tanay;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {77,56,4,3,2};

        for (int i = 0; i < arr.length/2; i++) {
            int start = arr[i];
            int end = arr[(arr.length-1)-(i)];
            int temp = start;
            start = end;
            end = temp;
            arr[i] = start;
            arr[(arr.length-1)-(i)] = end;
        }
        System.out.println(Arrays.toString(arr));
    }
}
