// Assignment-1. Write a Java program that reads an input file from the file system and outputs the content 
// of the file character by character. Use FileReader.read() method to read characters from the file. At the end,
// print the total number of characters present in the file. 

package com.anudip;

import java.io.FileReader;
import java.io.IOException;

 class Lab3A1 {

	public static void main(String[] args) {
		// Path where my input file exists.
		String path = "H:\\Java\\Lab\\temp.txt";
		int charCount = 0;

		try (FileReader fileReader = new FileReader(path)) {
			int character;
			while ((character = fileReader.read()) != -1) {
				System.out.print((char) character); // Output character by character
				charCount++;
			}
		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}

		System.out.println("\nTotal number of characters in the file: " + charCount);

	}

}