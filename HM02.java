import java.util.HashMap;

public class HM02 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Store some elements in the HashMap
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);

        // Display the HashMap
        System.out.println("HashMap before association: " + hashMap);

        // Associate a new value with a key
        hashMap.put("D", 4);

        // Display the HashMap after association
        System.out.println("HashMap after association: " + hashMap);
    }
}
