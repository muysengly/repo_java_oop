import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:database.db";
        String username = "admin";
        String password = "admin";

        try {

            // create a database connection and create database file
            Connection connection = DriverManager.getConnection(url, username, password);

            // create a statement object
            Statement statement = connection.createStatement();

            // set timeout to 30 sec.
            statement.setQueryTimeout(30);

            // drop table if exists
            statement.executeUpdate("drop table if exists person");

            // create table
            statement.executeUpdate("create table if not exists person (id integer, name string)");

            // insert data into table person (id, name)
            statement.executeUpdate("insert into person values(1, 'mr. aaa')");
            // insert more data
            statement.executeUpdate("insert into person values(2, 'mr. bbb')");
            // insert more data
            statement.executeUpdate("insert into person values(3, 'mr. ccc')");
            // insert more data
            statement.executeUpdate("insert into person values(4, 'mr. ddd')");
            // insert more data
            statement.executeUpdate("insert into person values(5, 'mr. eee')");

            // query data from table person
            ResultSet result_set = statement.executeQuery("select * from person");

            while (result_set.next()) {
                // read the result set
                System.out.print("id = " + result_set.getInt("id") + ", ");
                System.out.println("name = \"" + result_set.getString("name") + "\"");
            }
        } catch (SQLException exception) {
            exception.printStackTrace(System.err);
        }
    }
}