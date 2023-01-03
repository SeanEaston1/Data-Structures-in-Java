package com.tanay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Enter target: ");
        int n = input.nextInt();

        int target = n;

        System.out.println(linearSearch(arr,n));

    }
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]==target){
                return index;
            }
        }
        return -1;
    }

}

