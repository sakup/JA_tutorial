package com.company;

import java.util.Scanner;

public class ReverseCharsPro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String original = scan.nextLine();

        while (original.isEmpty() || original == null) {
            System.out.println("Please enter a valid string, empty and null strings are not accepted");
            original = scan.nextLine();
        }
        scan.close();

        ReverseCharsPro output = new ReverseCharsPro();
        String reverseChars = output.reverseChars(original);
        System.out.println(reverseChars);
    }


    private String reverseChars(String text){
        String reverse = "";

        for (int i = text.length() - 1; i >=0; i--) {
            reverse = reverse + text.charAt(i);
        }
        return reverse;
    }
}
