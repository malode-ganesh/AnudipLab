import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStr {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Programming");

        System.out.println("Original List: " + strings);

        // Reverse the list
        Collections.reverse(strings);

        System.out.println("Reversed List: " + strings);
    }
}
