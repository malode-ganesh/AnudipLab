import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add some integers to the ArrayList
        for(int i=1;i<=10;i++){
			numbers.add(i);
        }
		
        

        // Calculate the sum of all even numbers
        int sumOfEvenNumbers = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumOfEvenNumbers += number;
            }
        }

        // Display the sum of all even numbers
        System.out.println("The sum of all even numbers in the list is: " + sumOfEvenNumbers);
    }
}
