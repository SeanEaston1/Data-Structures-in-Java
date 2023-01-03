package com.tanay;

public class Shadowing {
    static int x = 40; // This will be shadowed at line 9 //
    // The concept is: You declare a variable once here if it is used in multiple functions and use it everywhere, now you don't have to declare it again and again in every single function. //

    public static void main(String[] args) {
        System.out.println(x); // This is not changed because variable x is not yet initialized again in this block. //
        int x = 90; // The class variable at line 4 will be shadowed by this variable //
        System.out.println(x);
        hello();
    }
    static void hello (){
        System.out.println(x);
    }
}
