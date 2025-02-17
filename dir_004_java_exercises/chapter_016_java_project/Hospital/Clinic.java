
public class Clinic {
    private String name;
    private String director;

    public Clinic(String _name, String _director) {
        name = _name;
        director = _director;
    }

    public Clinic() {
        name = "N/A";
        director = "N/A";
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    public void setDirector(String _director) {
        director = _director;
    }
}
