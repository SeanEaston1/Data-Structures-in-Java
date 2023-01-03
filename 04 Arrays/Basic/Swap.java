// SWAPPING VALUES IN AN ARRAY //

package com.tanay;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        swap(array, 1,2);

        System.out.println(Arrays.toString(array));
    }
    static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
