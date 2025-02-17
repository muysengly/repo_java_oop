import java.time.Year;
import java.util.ArrayList;

public class Movie {
    private String name;
    private int year;
    private int duration;
    private String director;
    private ArrayList<Integer> reviews;

    public Movie() {
        name = "N/A";
        year = 0;
        duration = 0;
        director = "N/A";
        reviews = new ArrayList<>();
    }

    public Movie(String _name, int _year, int _duration, String _director) {
        name = _name;
        year = _year;
        duration = _duration;
        director = _director;
        reviews = new ArrayList<>();
    }

    public Movie(Movie _movie) {
        name = _movie.name;
        year = _movie.year;
        duration = _movie.duration;
        director = _movie.director;
        reviews = new ArrayList<>(_movie.reviews);
    }

    public void setName(String _name) {
        name = _name;
    }

    public void setYear(int _year) {
        year = _year;
    }

    public void setDuration(int _duration) {
        duration = _duration;
    }

    public void setDirector(String _director) {
        director = _director;
    }

    public void addReview(int score) {
        if (score >= 0 && score <= 5)
            reviews.add(score);
        else
            System.out.println("invalid review score");
    }

    public double getReviewAverage() {
        double sum = 0.0;
        for (int i = 0; i < reviews.size(); i++) {
            sum += reviews.get(i);
        }

        if (reviews.size() > 0)
            return sum / reviews.size();
        else
            return 0;
    }

    public int getAge() {
        int current_year = Year.now().getValue();
        return current_year - year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", director='" + director + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    public static void main(String args[]) {
        Movie m1 = new Movie();
        Movie m2 = new Movie("Hunger Games", 2012, 142, "Gary Ross");
        m2.addReview(5);
        m2.addReview(4);
        m2.addReview(6);

        Movie m3 = new Movie(m2);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
};
