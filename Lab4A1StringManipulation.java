/**
Assignment 1. Write a Java program that uses lambda expressions to manipulate strings. 
Create lambda expressions to perform the following operations on a given string: 
 Convert the string to uppercase 
 Convert the string to lowercase 
 Reverse the string
**/

//package com.anudip;
import java.util.function.Function;

public class Lab4A1StringManipulation {

    public static void main(String[] args) {
        String input = "Hello, World!";
        
        // Lambda expression to convert the string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        String upperCaseString = toUpperCase.apply(input);
        System.out.println("Uppercase: " + upperCaseString);

        // Lambda expression to convert the string to lowercase
        Function<String, String> toLowerCase = str -> str.toLowerCase();
        String lowerCaseString = toLowerCase.apply(input);
        System.out.println("Lowercase: " + lowerCaseString);

        // Lambda expression to reverse the string
        Function<String, String> reverseString = str -> {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        };
        String reversedString = reverseString.apply(input);
        System.out.println("Reversed: " + reversedString);
    }
}
