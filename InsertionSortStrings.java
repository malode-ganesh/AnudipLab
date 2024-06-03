import java.util.Scanner;
import java.util.Arrays;

public class InsertionSortStrings {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // user input number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        //an array to store the strings
        String[] arr = new String[n];

        // user input strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Sort the array using Insertion Sort
        insertionSort(arr);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        
        scanner.close();
    }

    // Insertion Sort algorithm for strings
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
