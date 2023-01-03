package com.tanay;

import java.util.Arrays;

public class ChangingValue {
    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5};
        change(arr);
        System.out.println( Arrays.toString(arr));
    }
    // IF YOU CAN MAKE A CHANGE TO THE OBJECT VIA THIS REFERENCE VARIABLE, SAME OBJECT WILL BE CHANGED
    static void change(int[] nums) {
        nums[0] = 99;
    }
}