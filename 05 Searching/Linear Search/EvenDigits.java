package com.tanay;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums ={437,315,322,431,686,264,442};

        // Method 1 //
//        int count = 0;
//        int total = 0;
//        for(int i=0;i<nums.length;i++){
//            while(nums[i]>0){
//                if(nums[i]<10){
//                    count++;
//                    break;
//                } else {
//                    nums[i]=nums[i]/10;
//                    count++;
//                }
//            }
//            if(count%2==0){
//                total++;
//            }
//        }
//        System.out.println(total);

        // Method 2 //
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int ans = (int)(Math.log10(nums[i]))+1;
            if(ans%2==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
