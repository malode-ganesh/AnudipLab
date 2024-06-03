import java.util.LinkedList;
import java.util.Queue;

public class HotPotatoGame {
    public static void main(String[] args) {
        // Create a queue to represent the circle of players
        Queue<String> players = new LinkedList<>();
        
        // Enqueue player names
        players.add("Alice");
        players.add("Bob");
        players.add("Charlie");
        players.add("David");
        players.add("Eve");

        // Simulate passing the potato until only one player remains
        String eliminatedPlayer;
        while (players.size() > 1) {
            // Pass the potato (dequeue and enqueue the first player)
            for (int i = 0; i < 5; i++) {
                players.add(players.remove());
            }
            
            // Eliminate the player holding the potato when the music stops
            eliminatedPlayer = players.remove();
            System.out.println(eliminatedPlayer + " is out!");
        }
        
        // Display the winner
        String winner = players.peek();
        System.out.println("The winner is: " + winner);
    }
}
