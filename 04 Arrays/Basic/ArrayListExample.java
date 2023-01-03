package com.tanay;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// 1D ARRAYLIST //
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34) ;
        list.set(0, 33);

        // Input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // Output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

// 2D ARRAYLIST //
        ArrayList<ArrayList<Integer>> list_new = new ArrayList<>();
        
        // Initialize this  // without initialising, value of every single index would be null
        for (int i = 0; i < 3; i++) {
            list_new.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list_new.get(i).add(input.nextInt());
            }
        }
        System.out.println(list_new);
    }
}
