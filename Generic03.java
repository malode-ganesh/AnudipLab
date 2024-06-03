public class Generic03 {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 5, 3, 9, 7};
        Double[] doubleArray = {1.5, 3.8, 2.1, 5.6};
        String[] stringArray = {"apple", "banana", "orange", "kiwi"};

        System.out.println("Maximum integer: " + findMax(intArray));
        System.out.println("Maximum double: " + findMax(doubleArray));
        System.out.println("Maximum string: " + findMax(stringArray));
    }
}
