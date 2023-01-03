package com.tanay;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "tanay";  // String is itself an 'Array of Characters' //
        char target = 'a';

        System.out.println(Search(str, target));
        System.out.println(Search2(str, target));
    }

    static boolean Search2(String str, char target) {
        if (str.length() == 0) {  // This is a 'function' not a 'variable' like 'arr.length' //
            return false;
        }
        for (char ch : str.toCharArray()) { // This will convert 'string' to 'character array' //
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean Search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {  // In place of using 'str[i]' we will use 'str.chatAt(i)' //
                return true;
            }
        }
        return false;
    }
}
