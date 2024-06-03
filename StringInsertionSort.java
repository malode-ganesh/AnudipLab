import java.util.Scanner;

public class StringInsertionSort {
    public static void insertionSort(String[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] array = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        insertionSort(array);

        System.out.println("Sorted strings:");
        for (String str : array) {
            System.out.println(str);
        }
    }
}
