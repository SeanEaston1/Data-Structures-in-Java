package com.tanay;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {12, 1, 0};
        int target = 12;

        int start = 0;
        int end = arr.length-1;

        if (arr[start]<arr[end]){
            while(start<=end){
                // find the middle element
                // middle = (start + end) / 2 // might be possible (start + end) exceeds integer range
                int middle = start + (end-start)/2;

                if (target<arr[middle]){
                    end = middle + 1;
                } else if (target>arr[middle]) {
                    start = middle - 1;
                } else {
                    // answer found
                    System.out.println(middle);
                }
            }



//            for (int i = (start+end)/2; i < arr.length; i++) {
//                if (target>arr[i]){
//                    start = ((start+end)/2)+1;
//                } else if (target<arr[i]) {
//                    end = ((start+end)/2)-1;
//                } else {
//                    System.out.println("Target " + target + " found at index number " + i);
//                }
//            }
        } else if (arr[start]>arr[end]) {
            while(start>=end){
                // find the middle element
                // middle = (start + end) / 2 // might be possible (start + end) exceeds integer range
                int middle = start + (end-start)/2;

                if (target<arr[middle]){
                    start = middle + 1;
                } else if (target>arr[middle]) {
                    end = middle - 1;
                } else {
                    // answer found
                    System.out.println(middle);
                }
            }



//            for (int i = (start+end)/2; i < arr.length; i++) {
//                if (target>arr[i]){
//                    end = ((start+end)/2)-1;
//                } else if (target<arr[i]) {
//                    start = ((start+end)/2)+1;
//                } else {
//                    System.out.println("Target " + target + " found at index number " + i);
//                }
//            }
        }
    }
}
