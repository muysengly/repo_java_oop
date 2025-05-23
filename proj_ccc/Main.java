import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Scene scene = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        // Scene scene =
        // FXMLLoader.load(getClass().getResource("ApplicationView.fxml"));
        Scene scene = FXMLLoader.load(getClass().getResource("RegisterView.fxml"));
        stage.setScene(scene);
        stage.show();
    }
}