package com.itschool.project.exceptions.practice;

public class StringExceptionHandling {

    public static void main(String[] args) {
        String input = "Hello World";
        int validIndex = 3;
        int invalidIndex = 45;
        printCharAt(input, invalidIndex);
    }

    private static void printCharAt(String input, int index) {
        try {
            System.out.println("Character at index " + index + " : " + input.charAt(index));
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println("StringIndexOutOfBound " + exception.getMessage());
        }
    }
}