import java.sql.*;
import java.util.ArrayList;

public class PersistenceService {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public PersistenceService() {
        try {
            connection = DriverManager
                    .getConnection("jdbc:sqlite:database.db");

            connection.setAutoCommit(false);

            // create a statement object
            Statement statement = connection.createStatement();

            // set timeout to 30 sec.
            statement.setQueryTimeout(30);

            // create table Apartments
            statement.executeUpdate(
                    "create table if not exists Apartments (id integer primary key, address string, capacity integer, price integer)");

            // create table Reservations
            statement.executeUpdate(
                    "create table if not exists Reservations (id integer primary key, name string, surname string, start_date date, duration integer, cost real)");

        } catch (SQLException e) {
            System.out.println("Could not connect to database. Exiting..");
            System.exit(1);
        }
    }

    public ArrayList<Apartment> getApartments() {
        ArrayList<Apartment> result = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("SELECT * from Apartments");
            ResultSet res = preparedStatement.executeQuery();

            while (res.next()) {
                result.add(new Apartment(res.getInt("id"),
                        res.getString("address"),
                        res.getInt("capacity"),
                        res.getInt("price")));
            }
        } catch (SQLException e) {
            System.out.println("Database error. Exiting..");
            e.printStackTrace();
            close();
            System.exit(1);
        }
        return result;
    }

    public ArrayList<Reservation> getAllReservations() {
        ArrayList<Reservation> result = new ArrayList<>();
        try {
            preparedStatement = connection
                    .prepareStatement("SELECT * from Reservations");
            ResultSet res = preparedStatement.executeQuery();

            while (res.next()) {
                int day, month, year;
                Reservation resv = new Reservation(res.getInt("id"),
                        res.getString("name"),
                        res.getString("surname"),
                        res.getDate("start_date").toLocalDate(),
                        res.getInt("duration"),
                        res.getDouble("cost"));

                PreparedStatement newStatement = connection
                        .prepareStatement("SELECT * from Persons where reservation_id=?");
                newStatement.setInt(1, res.getInt("id"));

                ResultSet newRes = newStatement.executeQuery();
                while (newRes.next()) {
                    resv.addPerson(new Person(newRes.getInt("id"),
                            newRes.getString("name"),
                            newRes.getString("surname"),
                            newRes.getInt("birth_year")));
                }

                result.add(resv);
                newRes.close();
                newStatement.close();
            }
        } catch (SQLException e) {
            System.out.println("Database error. Exiting..");
            e.printStackTrace();
            close();
            System.exit(1);
        }
        return result;
    }

    public ArrayList<Reservation> getReservationsBySurname(String surname) {
        ArrayList<Reservation> result = new ArrayList<>();
        try {
            preparedStatement = connection
                    .prepareStatement("SELECT * from Reservations where surname like ?");
            preparedStatement.setString(1, "%" + surname + "%");
            ResultSet res = preparedStatement.executeQuery();

            while (res.next()) {
                result.add(new Reservation(res.getInt("id"),
                        res.getString("name"),
                        res.getString("surname"),
                        res.getDate("start_date").toLocalDate(),
                        res.getInt("duration"),
                        res.getDouble("cost")));
            }
        } catch (SQLException e) {
            System.out.println("Database error. Exiting..");
            e.printStackTrace();
            close();
            System.exit(1);
        }
        return result;
    }

    public void insertReservation(Reservation resv) {
        try {
            preparedStatement = connection
                    .prepareStatement(
                            "insert into Reservations(name, surname, start_date, duration, cost) values(?, ?, ?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, resv.getName());
            preparedStatement.setString(2, resv.getSurname());
            preparedStatement.setDate(3, Date.valueOf(resv.getStartDate()));
            preparedStatement.setInt(4, resv.getDuration());
            preparedStatement.setDouble(5, resv.getCost());

            preparedStatement.executeUpdate();
            int lastInsertedId = 0;
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedId = rs.getInt(1);
            }

            ArrayList<Person> persons = resv.getPersons();
            PreparedStatement newStatement = connection
                    .prepareStatement(
                            "insert into Persons(name, surname, birth_year, reservation_id) values(?, ?, ?, ?)");
            for (Person p : persons) {
                newStatement.setString(1, p.getName());
                newStatement.setString(2, p.getSurname());
                newStatement.setInt(3, p.getBirthYear());
                newStatement.setInt(4, lastInsertedId);
                newStatement.executeUpdate();
            }
            connection.commit();
            newStatement.close();
        } catch (SQLException e) {
            System.out.println("Database error. Exiting..");
            e.printStackTrace();
            close();
            System.exit(1);
        }
    }

    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            System.out.println("Error: Could not close connection");
            e.printStackTrace();
        }
    }
}
