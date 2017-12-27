package com.company;


public class ReverseStringChars {

    public static void main(String [] args){
        String input = "this is a test string";
        String output = reverse(input);
        System.out.println(output);
    }

    public static String reverse(String input){
        String reverse = "";

        if (input.isEmpty() || input == null){
            System.out.println("Empty and null strings are not valid");
        }

        if (input.length() <= 1) {
            reverse = input;
        }else{
            String[] originalArray = input.split("(?!^)");

            for (String item : originalArray){
                reverse = item + reverse;
            }
        }
        return reverse;

    }

}
