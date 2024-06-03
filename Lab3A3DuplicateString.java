// Write a program that reads a list of strings and removes duplicate strings from the list using the Stream API.
// Avoid using lambda expressions for this task.

package com.anudip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab3A3DuplicateString {

	public static void main(String[] args) {
		// list with duplicate elements present
		List<String> stringList = Arrays.asList("Apple", "Banana", "Orange", "Orange", "Cherry", "Apple", "Banana");

		// removing duplicates using stream().distinct()
		List<String> uniqueStrings = stringList.stream().distinct().collect(Collectors.toList());

		System.out.println("Original list: " + stringList);
		System.out.println("List after removing duplicates: " + uniqueStrings);

	}

}