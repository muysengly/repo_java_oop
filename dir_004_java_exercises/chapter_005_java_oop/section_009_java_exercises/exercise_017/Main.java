// Movie.java

// Import the ArrayList class from the Java utility package
import java.util.ArrayList;
import java.util.Arrays;

// Define the Movie class
class Movie {

    // Private fields to store the title, director, actors, and reviews of the movie
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Review> reviews;

    // Constructor to initialize the title, director, and actors of the movie
    public Movie(String title, String director, ArrayList<String> actors) {
        this.title = title; // Set the title field to the provided title
        this.director = director; // Set the director field to the provided director
        this.actors = actors; // Set the actors field to the provided list of actors
        this.reviews = new ArrayList<Review>(); // Initialize the reviews list as an empty ArrayList
    }

    // Method to add a review to the movie
    public void addReview(Review review) {
        this.reviews.add(review); // Add the provided review to the reviews list
    }

    // Method to get the list of all reviews for the movie
    public ArrayList<Review> getReviews() {
        return this.reviews; // Return the list of reviews
    }

    // Method to get the title of the movie
    public String getTitle() {
        return this.title; // Return the value of the title field
    }

    // Method to get the director of the movie
    public String getDirector() {
        return this.director; // Return the value of the director field
    }

    // Method to get the list of actors in the movie
    public ArrayList<String> getActors() {
        return this.actors; // Return the list of actors
    }
}
// Review.java

// Define the Review class
class Review {

    // Private fields to store the review text, reviewer name, and rating
    private String reviewText;
    private String reviewerName;
    private double rating;

    // Constructor to initialize the review text, reviewer name, and rating
    public Review(String reviewText, String reviewerName, double rating) {
        this.reviewText = reviewText; // Set the reviewText field to the provided review text
        this.reviewerName = reviewerName; // Set the reviewerName field to the provided reviewer name
        this.rating = rating; // Set the rating field to the provided rating
    }

    // Method to get the review text
    public String getReviewText() {
        return reviewText; // Return the value of the reviewText field
    }

    // Method to get the reviewer name
    public String getReviewerName() {
        return reviewerName; // Return the value of the reviewerName field
    }

    // Method to get the rating
    public double getRating() {
        return rating; // Return the value of the rating field
    }
}
// Main.java
// Import the ArrayList and Arrays classes from the Java utility package

// Define the Main class
public class Main {

    // The main method - the entry point of the Java application
    public static void main(String[] args) {

        // Create a movie object for "Titanic"
        Movie movie1 = new Movie("Titanic", "James Cameron",
                new ArrayList(Arrays.asList("Leonardo DiCaprio", "Kate Winslet")));

        // Create review objects
        Review review1 = new Review("Great movie!", "Irvine Rolf", 4.5);
        Review review2 = new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Review review3 = new Review("A classic that never gets old.", "Nele Athol", 4.0);
        Review review4 = new Review("Great movie!", "Cipactli Anselma", 4.0);
        Review review5 = new Review("Highly recommended!", "Martin Nadine", 4.0);

        // Add reviews to movie1
        movie1.addReview(review1);
        movie1.addReview(review2);
        movie1.addReview(review3);
        movie1.addReview(review4);

        // Create a movie object for "The Godfather"
        Movie movie2 = new Movie("The Godfather", "Francis Ford Coppola",
                new ArrayList(Arrays.asList("Marlon Brando", "Al Pacino", "James Caan")));

        // Display all the reviews for "Titanic"
        System.out.println("\nReviews for '" + movie1.getTitle() + "':");
        for (Review review : movie1.getReviews()) {
            System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
        }

        // Add reviews to movie2
        movie2.addReview(review1);
        movie2.addReview(review4);
        movie2.addReview(review5);

        // Display all the reviews for "The Godfather"
        System.out.println("\nReviews for '" + movie2.getTitle() + "':");
        for (Review review : movie2.getReviews()) {
            System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
        }
    }
}
