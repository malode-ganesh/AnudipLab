import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int[] arrayCopy = Arrays.copyOf(array, array.length); // Create a copy for comparison

        // Using Bubble Sort
        bubbleSort(array);
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(array));

        // Using Arrays.sort() method
        Arrays.sort(arrayCopy);
        System.out.println("Sorted array using Arrays.sort(): " + Arrays.toString(arrayCopy));
    }
}
