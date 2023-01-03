package com.tanay;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {

        // EITHER YOU CAN HAVE DIFFERENT DATA TYPE //
        fun("Tanay");
        fun(2);

        // EITHER YOU CAN HAVE DIFFERENT NUMBERS OF ARGUMENTS //
        sum(1,2);
        System.out.println("The First sum is: " + sum(1,2));
        sum(3,4,5);
        System.out.println("The Second sum is: " + sum(3,4,5));

        // METHOD OVERLOADING ON VARARGS //
        demo(2,3,4,5,6,7,8);
        demo("Tanay", "Hello", "Rahul");

        // ERROR WILL COME HERE //
//        demo();
    }

    static void fun(String name) {
        System.out.println("Hello " + name);
    }

    static void fun(int a) {
        System.out.println("The number is " + a);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
