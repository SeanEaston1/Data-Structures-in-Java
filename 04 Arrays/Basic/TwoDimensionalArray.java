package com.tanay;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
              To create a Matrix like this we need 2-D Arrays
                    1 2 3
                    4 5 6
                    7 8 9
              int[][] arr = new int[Size of Row][Size of Column];
        */
        int[][] arrays = {
                {1, 2, 3},
                {3, 4},
                {6, 7, 8, 9}
        };

        int[][] arr = new int[3][2];

        System.out.println(arr.length);  // It will only give the value of size of the row //

        // INPUT //
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = input.nextInt();
            }
        }

        // OUTPUT //
        // METHOD 1 //
        for (int r = 0; r < arr.length; r++) {  // This will specify the rows //
            for (int c = 0; c < arr[r].length; c++) { // This will print everything in that row //
                System.out.print(arr[r][c] + " ");
            }
            System.out.println(); // This will print a line after every single row is printed //
        }
        // METHOD 2 //
        for (int r = 0; r < arr.length; r++) {
            System.out.println(Arrays.toString(arr[r]));
        }
        // METHOD 3 //
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
