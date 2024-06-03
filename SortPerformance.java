import java.util.Random;

public class SortPerformance {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arraySelectionSort = new int[1000];
        int[] arrayBubbleSort = new int[1000];
        int[] arrayInsertionSort = new int[1000];

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(1000);
            arraySelectionSort[i] = randomNumber;
            arrayBubbleSort[i] = randomNumber;
            arrayInsertionSort[i] = randomNumber;
        }

        long startTime = System.nanoTime();
        selectionSort(arraySelectionSort);
        long selectionSortTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        bubbleSort(arrayBubbleSort);
        long bubbleSortTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        insertionSort(arrayInsertionSort);
        long insertionSortTime = System.nanoTime() - startTime;

        System.out.println("Selection Sort Time: " + selectionSortTime + " nanoseconds");
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " nanoseconds");
        System.out.println("Insertion Sort Time: " + insertionSortTime + " nanoseconds");
    }
}
