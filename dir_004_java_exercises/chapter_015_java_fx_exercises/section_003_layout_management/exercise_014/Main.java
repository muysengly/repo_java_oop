//Main.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Data Table with ScrollPane Example");

        // Create a TableView to display the data
        TableView<Person> tableView = new TableView<>();

        // Create sample data (you can replace this with your own data source)
        tableView.getItems().addAll(
                new Person("Randel Italo", 24),
                new Person("Sebastian Biff", 32),
                new Person("Beata Adorinda", 20),
                new Person("Anwer Tabita", 37),
                new Person("Cheri Barra", 24));

        // Create columns for the table
        TableColumn<Person, String> nameColumn = new TableColumn<>("Name");
        TableColumn<Person, Integer> ageColumn = new TableColumn<>("Age");

        // Set up cell value factories for the columns
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));

        // Add columns to the table
        @SuppressWarnings("unchecked")
        TableColumn<Person, ?>[] columns = new TableColumn[] { nameColumn, ageColumn };
        tableView.getColumns().addAll(columns);

        // Create a VBox to hold the TableView
        VBox vbox = new VBox(tableView);

        // Create a ScrollPane and add the VBox to it
        ScrollPane scrollPane = new ScrollPane(vbox);

        // Create a scene and add it to the stage
        Scene scene = new Scene(scrollPane, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
