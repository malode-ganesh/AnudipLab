import java.util.Random;
import java.util.Arrays;

public class SortPerformance02 {
    public static void main(String[] args) {
        int size = 1000;
        int[] arrSelectionSort = generateRandomArray(size);
        int[] arrBubbleSort = arrSelectionSort.clone();
        int[] arrInsertionSort = arrSelectionSort.clone();

        // Measure and print the time taken for Selection Sort
        long startTime = System.nanoTime();
        selectionSort(arrSelectionSort);
        long selectionSortTime = System.nanoTime() - startTime;
        System.out.println("Selection Sort time: " + selectionSortTime + " nanoseconds");

        // Measure and print the time taken for Bubble Sort
        startTime = System.nanoTime();
        bubbleSort(arrBubbleSort);
        long bubbleSortTime = System.nanoTime() - startTime;
        System.out.println("Bubble Sort time: " + bubbleSortTime + " nanoseconds");

        // Measure and print the time taken for Insertion Sort
        startTime = System.nanoTime();
        insertionSort(arrInsertionSort);
        long insertionSortTime = System.nanoTime() - startTime;
        System.out.println("Insertion Sort time: " + insertionSortTime + " nanoseconds");
    }

    // Generate an array of random integers
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100); // Generates a random number between 0 and 99
        }
        return arr;
    }

    // Selection Sort algorithm
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Bubble Sort algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort algorithm
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
