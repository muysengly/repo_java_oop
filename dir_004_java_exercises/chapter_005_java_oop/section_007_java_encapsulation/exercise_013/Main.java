public class Main {
    // Main method to test the Movie class
    public static void main(String[] args) {
        // Create a new Movie object
        Movie movie = new Movie();

        // Set the title, director, and duration of the movie
        movie.setTitle("Arrival");
        movie.setDirector("Christopher Nolan");
        movie.setDuration(146);

        // Print the details of the movie
        System.out.println(movie.getMovieDetails());
    }
}

// Define the Movie class
class Movie {
    // Private instance variables
    private String title;
    private String director;
    private int duration; // duration in minutes

    // Public getter for the title variable
    public String getTitle() {
        return title;
    }

    // Public setter for the title variable
    public void setTitle(String title) {
        this.title = title;
    }

    // Public getter for the director variable
    public String getDirector() {
        return director;
    }

    // Public setter for the director variable
    public void setDirector(String director) {
        this.director = director;
    }

    // Public getter for the duration variable
    public int getDuration() {
        return duration;
    }

    // Public setter for the duration variable
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Method to get the movie details as a formatted string
    public String getMovieDetails() {
        return "Title: " + title + ", Director: " + director + ", Duration: " + duration + " minutes";
    }
}
