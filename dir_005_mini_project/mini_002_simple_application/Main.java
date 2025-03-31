// mini project of solving quadratic equation 

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        System.setProperty("prism.allowhidpi", "false");
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);

        stage.getIcons().add(new Image(getClass().getResourceAsStream("itc_logo.png")));
        stage.setTitle("Mini Project");
        stage.show();

    }

}
