
//Book.java
// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Define the Book class
class Book {
    // Declare a private variable to store the title of the book
    private String title;
    // Declare a private variable to store the author of the book
    private String author;
    // Declare a private variable to store the ISBN of the book
    private String ISBN;
    // Declare a static ArrayList to store the collection of Book objects
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    // Constructor for the Book class that initializes the title, author, and ISBN
    // variables
    public Book(String title, String author, String ISBN) {
        // Set the title variable to the provided title parameter
        this.title = title;
        // Set the author variable to the provided author parameter
        this.author = author;
        // Set the ISBN variable to the provided ISBN parameter
        this.ISBN = ISBN;
    }

    // Method to retrieve the title of the book
    public String get_Title() {
        // Return the value of the title variable
        return title;
    }

    // Method to set the title of the book
    public void set_Title(String title) {
        // Set the title variable to the provided title parameter
        this.title = title;
    }

    // Method to retrieve the author of the book
    public String get_Author() {
        // Return the value of the author variable
        return author;
    }

    // Method to set the author of the book
    public void set_Author(String author) {
        // Set the author variable to the provided author parameter
        this.author = author;
    }

    // Method to retrieve the ISBN of the book
    public String get_ISBN() {
        // Return the value of the ISBN variable
        return ISBN;
    }

    // Method to set the ISBN of the book
    public void set_ISBN(String ISBN) {
        // Set the ISBN variable to the provided ISBN parameter
        this.ISBN = ISBN;
    }

    // Static method to add a book to the book collection
    public static void add_Book(Book book) {
        // Add the provided book object to the bookCollection ArrayList
        bookCollection.add(book);
    }

    // Static method to remove a book from the book collection
    public static void remove_Book(Book book) {
        // Remove the provided book object from the bookCollection ArrayList
        bookCollection.remove(book);
    }

    // Static method to retrieve the entire book collection
    public static ArrayList<Book> get_BookCollection() {
        // Return the bookCollection ArrayList
        return bookCollection;
    }
}

// Define the Main class
public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the Book class with the title "The C Programming
        // Language", author "Dennis Ritchie, Brian Kernighan", and ISBN "9780131101630"
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        // Create another instance of the Book class with the title "An Introduction to
        // Python", author "Guido van Rossum", and ISBN "9355423489"
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");

        // Add book1 to the book collection
        Book.add_Book(book1);
        // Add book2 to the book collection
        Book.add_Book(book2);

        // Retrieve the book collection and store it in an ArrayList named
        // bookCollection
        ArrayList<Book> bookCollection = Book.get_BookCollection();

        // Print a heading for the list of books
        System.out.println("List of books:");

        // Iterate over each book in the bookCollection
        for (Book book : bookCollection) {
            // Print the title, author, and ISBN of each book
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }

        // Remove book1 from the book collection
        Book.remove_Book(book1);

        // Print a message indicating that book1 has been removed
        System.out.println("\nAfter removing " + book1.get_Title() + ":");

        // Print a heading for the updated list of books
        System.out.println("List of books:");

        // Iterate over each book in the bookCollection
        for (Book book : bookCollection) {
            // Print the title, author, and ISBN of each book
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }
    }
}
