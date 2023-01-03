package com.tanay;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {

        fun(1,2,3,4,5,6,7); // AS MANY VARIABLES AS YOU WANT, YOU CAN PUT HERE //

        multiple(2, 3, "Wicked", "Tanay", "Yo"); // THIS WILL ADD MULTIPLE TYPES OF ARGUMENTS //
    }
    private static void fun(int ...v) {       // fun(declare ...name) : VarArgs //
        System.out.println(Arrays.toString(v));
    }
    private static void multiple(int a, int b, String ...v) { // VARARGS MUST BE AT THE LAST IN THE ARGUMENTS //
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
