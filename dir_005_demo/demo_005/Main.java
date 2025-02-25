import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "";

        try {
            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement object
            Statement statement = connection.createStatement();

            // Set timeout to 30 seconds
            statement.setQueryTimeout(30);

            // Drop table if it exists
            statement.executeUpdate("DROP TABLE IF EXISTS person");

            // Create table
            statement.executeUpdate("CREATE TABLE person (id INT, name VARCHAR(100))");

            // Insert data into table person (id, name)
            statement.executeUpdate("INSERT INTO person VALUES (1, 'mr. aaa')");
            statement.executeUpdate("INSERT INTO person VALUES (2, 'mr. bbb')");

            // Query data from table person
            ResultSet resultSet = statement.executeQuery("SELECT * FROM person");

            while (resultSet.next()) {
                // Read the result set
                System.out.print("id = " + resultSet.getInt("id") + ", ");
                System.out.println("name = \"" + resultSet.getString("name") + "\"");
            }

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}