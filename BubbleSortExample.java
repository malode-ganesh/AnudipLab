import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Sort the array using Bubble sort
        bubbleSort(arr);
        
        // Print the sorted array using Bubble sort
        System.out.println("Sorted array using Bubble sort: " + Arrays.toString(arr));
        
        // Reinitialize the array to its original state
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        
        // Sort the array using Arrays.sort() method
        Arrays.sort(arr2);
        
        // Print the sorted array using Arrays.sort() method
        System.out.println("Sorted array using Arrays.sort(): " + Arrays.toString(arr2));
    }

    // Bubble sort algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
