package com.tanay;

import java.util.Arrays;
import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// array of primitives
        int[] arr = new int[5];

    // INPUT OF AN ARRAY //
        // METHOD 1 // THIS IS A LENGTHY PROCESS
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 14;
        arr[3] = 13;
        arr[4] = 12;
        // METHOD 2 // USING FOR LOOP //

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

    // PRINTING AN ARRAY //
        // METHOD 1 // FOR LOOP //
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // METHOD 2 // FOR EACH LOOP //
        for (int num : arr) {
            System.out.println(num);
        }
        // METHOD 3 // to.string()  ARRAY CLASS //
        System.out.println(Arrays.toString(arr));

// array of string
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
