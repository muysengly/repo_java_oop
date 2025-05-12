import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = FXMLLoader.load(getClass().getResource("./LoginView.fxml"));
        // Scene scene = FXMLLoader.load(getClass().getResource("./RegisterView.fxml"));
        // Scene scene =
        // FXMLLoader.load(getClass().getResource("./ApplicationView.fxml"));
        stage.setTitle("Project Login/Register");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("itc_logo.png")));
        stage.setScene(scene);
        stage.show();

    }
}
