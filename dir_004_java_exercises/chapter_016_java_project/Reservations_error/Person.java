public class Person {
    private int id;
    private String name;
    private String surname;
    private int birthYear;

    public Person(int id, String name, String surname, int birthYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "--Person--" +
                "\nid=" + id +
                "\nname=" + name +
                "\nsurname=" + surname +
                "\nbirthYear=" + birthYear;
    }
}
