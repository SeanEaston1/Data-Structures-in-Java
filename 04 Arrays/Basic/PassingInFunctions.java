package com.tanay;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {23,4,3,44,22,4};
        System.out.println(Arrays.toString(arr));

        changed_array(arr);
        System.out.println(Arrays.toString(arr));

    }

    // MODIFYING ARRAY USING A FUNCTION CALL //
    static void changed_array(int[] arr) {
        arr[3] = 99;
    }
}
