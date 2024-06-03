import java.util.HashMap;
import java.util.Map;

public class HMScore {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and scores
        Map<String, Integer> scoresMap = new HashMap<>();

        // Store some cricketer names and their scores
        scoresMap.put("Virat Kohli", 100);
        scoresMap.put("Rohit Sharma", 50);
        scoresMap.put("MS Dhoni", 75);

        // Search for a batsman name and display his score
        String batsmanName = "Virat Kohli";
        if (scoresMap.containsKey(batsmanName)) {
            int score = scoresMap.get(batsmanName);
            System.out.println(batsmanName + "'s score: " + score);
        } else {
            System.out.println("Batsman not found in the map.");
        }
    }
}
