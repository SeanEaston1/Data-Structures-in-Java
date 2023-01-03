package com.questions;

//    QUES.. : GREATEST ELEMENT THAT IS SMALLER THAN OR EQUAL TO THE TARGET ELEMENT

//    STEP 1 : APPLY BINARY SEARCH
//    STEP 2 : IF YOU DON'T FIND THE ELEMENT THEN THE END IS THE PLACE YOU WILL FIND CEILING OF THE TARGET NUMBER

public class FloorOfaNumber {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;

        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid;

        while(start<=end){
            mid = start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            } else if(target>arr[mid]){
                start=mid+1;
            } else if(target==arr[mid]){
                return arr[mid];
            }
        }
        return arr[end];
    }
}