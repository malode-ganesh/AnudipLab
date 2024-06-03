import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String> dictionary = new TreeMap<>();

        while (true) {
            System.out.println("1. Add a word and its definition");
            System.out.println("2. Search for a word");
            System.out.println("3. Display all words and their definitions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter definition: ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Word added to dictionary.");
                    break;
                case 2:
                    System.out.print("Enter word to search: ");
                    String searchWord = scanner.nextLine();
                    String searchResult = dictionary.get(searchWord);
                    if (searchResult != null) {
                        System.out.println("Definition: " + searchResult);
                    } else {
                        System.out.println("Word not found in dictionary.");
                    }
                    break;
                case 3:
                    System.out.println("Dictionary:");
                    for (String key : dictionary.keySet()) {
                        System.out.println(key + ": " + dictionary.get(key));
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}
