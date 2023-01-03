package com.questions;

//    QUES.. : SMALLEST ELEMENT THAT IS GREATER THAN OR EQUAL TO THE TARGET ELEMENT

//    STEP 1 : APPLY BINARY SEARCH
//    STEP 2 : IF YOU DON'T FIND THE ELEMENT THEN THE START IS THE PLACE YOU WILL FIND CEILING OF THE TARGET NUMBER

public class CeilingOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;

        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int middle = (start + end) / 2;
            if (target>arr[middle]){
                start = middle + 1;
            } else if (target<arr[middle]) {
                end = middle - 1;
            } else {
                return arr[middle];
            }
        }
        return arr[start];
    }
}
