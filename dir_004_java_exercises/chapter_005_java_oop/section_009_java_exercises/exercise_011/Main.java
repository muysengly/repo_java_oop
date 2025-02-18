import java.util.ArrayList;

// Book.java
// Define the Book class
class Book {
    // Private field to store the title of the book
    private String title;
    // Private field to store the author of the book
    private String author;

    // Constructor to initialize the title and author fields
    public Book(String title, String author) {
        // Assign the title parameter to the title field
        this.title = title;
        // Assign the author parameter to the author field
        this.author = author;
    }

    // Getter method for the title field
    public String getTitle() {
        // Return the value of the title field
        return title;
    }

    // Setter method for the title field
    public void setTitle(String title) {
        // Assign the title parameter to the title field
        this.title = title;
    }

    // Getter method for the author field
    public String getAuthor() {
        // Return the value of the author field
        return author;
    }

    // Setter method for the author field
    public void setAuthor(String author) {
        // Assign the author parameter to the author field
        this.author = author;
    }
}
// Library.java
// Import the ArrayList class from the java.util package

// Define the Library class
class Library {
    // Private field to store a list of Book objects
    private ArrayList<Book> books;

    // Constructor to initialize the books field
    public Library() {
        // Create a new ArrayList to hold Book objects
        books = new ArrayList<Book>();
    }

    // Method to add a Book to the books list
    public void addBook(Book book) {
        // Add the specified book to the books list
        books.add(book);
    }

    // Method to remove a Book from the books list
    public void removeBook(Book book) {
        // Remove the specified book from the books list
        books.remove(book);
    }

    // Method to get the list of books
    public ArrayList<Book> getBooks() {
        // Return the list of books
        return books;
    }
}

// Main.java

// Define the Main class
public class Main {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Create a new instance of the Library class
        Library library = new Library();

        // Create new Book objects with title and author
        Book book1 = new Book("Adventures of Tom Sawyer", "Mark Twain");
        Book book2 = new Book("Ben Hur", "Lewis Wallace");
        Book book3 = new Book("Time Machine", "H.G. Wells");
        Book book4 = new Book("Anna Karenina", "Leo Tolstoy");

        // Add the books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Print a message to indicate the books in the library
        System.out.println("Books in the library:");
        // Iterate through the list of books in the library
        for (Book book : library.getBooks()) {
            // Print the title and author of each book
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        // Remove a book from the library
        library.removeBook(book2);
        // Print a message to indicate the books in the library after removal
        System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
        // Iterate through the updated list of books in the library
        for (Book book : library.getBooks()) {
            // Print the title and author of each book
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
