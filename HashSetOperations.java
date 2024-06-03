import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> set = new HashSet<>();

        // Add the numbers 5, 10, 15, 20, and 25 to the set
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);

        // Display the elements of the set
        System.out.println("Elements in the set: " + set);

        // Check if the set contains the number 10
        boolean containsTen = set.contains(10);
        System.out.println("Does the set contain the number 10? " + containsTen);

        // Remove the number 15 from the set
        boolean removedFifteen = set.remove(15);
        System.out.println("Was the number 15 removed? " + removedFifteen);

        // Display the size of the set
        int size = set.size();
        System.out.println("Size of the set: " + size);
    }
}
