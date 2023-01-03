package com.tanay;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7};

        System.out.println("Enter range 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter range 2: ");
        int num2 = input.nextInt();
        System.out.println("Enter number to search: ");
        int target = input.nextInt();

        // Search 3 in the range of index 1 to 4 //
        if (check(arr,num1,num2,target)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    static boolean check(int[] arr, int num1, int num2, int target){
        for (int i = num1; i < num2; i++) {
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }
}