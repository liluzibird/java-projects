package m11;


import java.util.*;
import java.lang.*;
import java.io.*;

class Display {

    public static void displayCharacter(String s) {
        if (s.length() == 0) {
            return;
        } else {
            System.out.println(s.charAt(0));
            displayCharacter(s.substring(1));
        }
    }

    public static void displayCharacterReverse(String s) {
        if (s.length() == 0) {
            return;
        } else {
            displayCharacter(s.substring(1));
            System.out.println(s.charAt(0));
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("Enter a word: ");
        String input;
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextLine();

        displayCharacter(input);
        displayCharacterReverse(input);
    }
}
