import java.util.Arrays;

public class BubbleSortStringsExample {
    public static void main(String[] args) {
        // Initialize an array of strings
        String[] arr = {"banana", "apple", "cherry", "date", "grape"};
        
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Sort the array using Bubble sort
        bubbleSort(arr);
        
        // Print the sorted array using Bubble sort
        System.out.println("\nSorted array using Bubble sort: " + Arrays.toString(arr));
        
        // Reinitialize the array to its original state
        String[] arr2 = {"banana", "apple", "cherry", "date", "grape"};
        
        // Sort the array using Arrays.sort() method
        Arrays.sort(arr2);
        
        // Print the sorted array using Arrays.sort() method
        System.out.println("\nSorted array using Arrays.sort(): " + Arrays.toString(arr2));
    }

    // Bubble sort algorithm for strings
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
