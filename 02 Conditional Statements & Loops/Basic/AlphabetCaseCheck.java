// Take an input character from keyboard and check weather it is Upper case alphabet or lower case alphabet

package com.tanay;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char ch = input.next().trim().charAt(0);
        /*
        trim() will just erase all the spaces
        charAt() will only input character at a given index
        */
        if (ch > 'a' && ch < 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
