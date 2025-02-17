
// MusicLibrary.java
// Import the ArrayList class from the Java utility package
import java.util.ArrayList;
// Import the Random class from the Java utility package
import java.util.Random;

// Define the MusicLibrary class
class MusicLibrary {

  // Declare a private field to store a list of Song objects
  private ArrayList<Song> songs;

  // Constructor to initialize the songs list
  public MusicLibrary() {
    // Create a new ArrayList to hold Song objects
    songs = new ArrayList<Song>();
  }

  // Method to add a song to the library
  public void addSong(Song song) {
    // Add the provided song to the songs list
    songs.add(song);
  }

  // Method to remove a song from the library
  public void removeSong(Song song) {
    // Remove the provided song from the songs list
    songs.remove(song);
  }

  // Method to get the list of all songs in the library
  public ArrayList<Song> getSongs() {
    // Return the list of songs
    return songs;
  }

  // Method to play a random song from the library
  public void playRandomSong() {
    // Get the number of songs in the library
    int size = songs.size();

    // Check if the library is empty
    if (size == 0) {
      // Print a message if there are no songs to play
      System.out.println("No songs in the library.");
      return; // Exit the method
    }

    // Create a new Random object to generate a random number
    Random rand = new Random();

    // Generate a random index within the range of the songs list
    int index = rand.nextInt(size);

    // Print the title and artist of the randomly selected song
    System.out.println("Now playing: " + songs.get(index).getTitle() + " by " + songs.get(index).getArtist());
  }
}

// Song.java
// Define the Song class
class Song {

  // Private fields to store the title and artist of the song
  private String title;
  private String artist;

  // Constructor to initialize the title and artist fields
  public Song(String title, String artist) {
    this.title = title; // Set the title field to the provided title
    this.artist = artist; // Set the artist field to the provided artist
  }

  // Getter method to retrieve the title of the song
  public String getTitle() {
    return title; // Return the value of the title field
  }

  // Setter method to update the title of the song
  public void setTitle(String title) {
    this.title = title; // Set the title field to the provided title
  }

  // Getter method to retrieve the artist of the song
  public String getArtist() {
    return artist; // Return the value of the artist field
  }

  // Setter method to update the artist of the song
  public void setArtist(String artist) {
    this.artist = artist; // Set the artist field to the provided artist
  }
}
// Main.java
// Import the ArrayList class from the Java utility package
// import java.util.ArrayList;

// Define the Main class
public class Main {

  // The main method - the entry point of the Java application
  public static void main(String[] args) {

    // Create a new instance of the MusicLibrary class
    MusicLibrary library = new MusicLibrary();

    // Add songs to the music library
    library.addSong(new Song("Midnight Train to Georgia", "Gladys Knight & the Pips"));
    library.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));
    library.addSong(new Song("Imagine", "John Lennon"));
    library.addSong(new Song("All by Myself", "Eric Carmen"));
    library.addSong(new Song("What'd I Say", "Ray Charles"));
    library.addSong(new Song("Walking in Memphis", "Marc Cohn"));
    library.addSong(new Song("In the Air Tonight", "Phil Collins"));

    // Print all songs in the music library
    System.out.println("All songs:");

    // Iterate through each song in the library and print its title and artist
    for (Song song : library.getSongs()) {
      System.out.println(song.getTitle() + " by " + song.getArtist());
    }

    // Print a message indicating a random song will be played
    System.out.println("\n**Playing Random Song**");

    // Play and print a random song from the library three times
    library.playRandomSong();
    System.out.println();
    library.playRandomSong();
    System.out.println();
    library.playRandomSong();
  }
}
