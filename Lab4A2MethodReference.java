/** write a Java program that demonstrates the use of method references for static methods.
Create a functional interface and use a method reference to call a static method that
calculates the square of a number.
*/
//package com.anudip;


@FunctionalInterface
interface SquareCalculator {		// functional interface
	int calculateSquare(int num);
}

public class Lab4A2MethodReference {

	public static int square(int num) {
		return num * num;
	}

	public static void main(String[] args) {
		// Method reference to call the static method square
		SquareCalculator squareCalculator = Lab4A2MethodReference::square;

		System.out.println("Square of 5: " + squareCalculator.calculateSquare(5));
	}
}