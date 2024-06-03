import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        
        // Add some strings to the List
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("elderberry");

        // Display the original list
        System.out.println("Original List: " + stringList);

        // Reverse the list
        Collections.reverse(stringList);

        // Display the reversed list
        System.out.println("Reversed List: " + stringList);
    }
}
