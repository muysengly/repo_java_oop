import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {
    private int id;
    private String name;
    private String surname;
    private LocalDate startDate;
    private int duration;
    private double cost;
    ArrayList<Person> persons;

    public Reservation(int id, String name, String surname,
            LocalDate startDate, int duration, double cost) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.startDate = startDate;
        this.duration = duration;
        this.cost = cost;
        this.persons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getDuration() {
        return duration;
    }

    public double getCost() {
        return cost;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    @Override
    public String toString() {
        return "--Reservation--" +
                "\nid=" + id +
                "\nname=" + name +
                "\nsurname=" + surname +
                "\nstartDate=" + startDate +
                "\nduration=" + duration +
                "\ncost=" + cost +
                "\npersons=" + persons;
    }

    public void addPerson(Person p) {
        persons.add(p);
    }
}
