// Class Library
public class Library {

  // Instance variable libraryName
  private String libraryName;

  // Constructor to initialize libraryName
  public Library(String libraryName) {
    this.libraryName = libraryName;
  }

  // Inner class Book
  public class Book {

    // Method getLibraryName that returns the name of the library
    public String getLibraryName() {
      // Accessing the outer class's instance variable libraryName
      return libraryName;
    }
  }

  // Main method to demonstrate inner class accessing outer class members
  public static void main(String[] args) {
    // Creating an instance of Library
    Library myLibrary = new Library("Central Library");

    // Creating an instance of the inner class Book
    Library.Book myBook = myLibrary.new Book();

    // Calling the getLibraryName method and printing the result
    System.out.println("Library Name: " + myBook.getLibraryName());
  }
}
