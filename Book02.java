import java.util.ArrayList;

class Book02 {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor to initialize the Book object
    public Book02(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getters for the fields
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName;
    }

    public static void main(String[] args) {
        // Create an ArrayList of type Book
        ArrayList<Book02> bookList = new ArrayList<>();

        // Add Book objects to the ArrayList
        bookList.add(new Book02(1, "SCJP", "Kathy Sierra"));
        bookList.add(new Book02(2, "1984", "George Orwell"));
        bookList.add(new Book02(3, "The Great Gatsby", "F. Scott Fitzgerald"));

        // Display all book details using an advanced for loop
        for (Book02 book : bookList) {
            System.out.println(book);
        }
    }
}
