package com.tanay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 11;

        System.out.println(binarySearch(arr,target));

    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = 0;

        while(start<=end){
            // Find the middle element
            // Middle = (start + end) / 2 // might be possible (start + end) exceeds integer range
            int middle = start + (end-start)/2;

            if (target<arr[middle]){
                end = middle - 1;
            } else if (target>arr[middle]) {
                start = middle + 1;
            } else {
                // answer found
                return middle;
            }
        }
        return -1;
    }
}
