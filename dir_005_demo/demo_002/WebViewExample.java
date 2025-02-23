import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebViewExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create WebView and WebEngine
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        // Load a webpage
        webEngine.load("https://www.example.com");

        // Address bar (TextField)
        TextField urlField = new TextField("https://www.example.com");
        urlField.setOnAction(e -> webEngine.load(urlField.getText()));

        // Back and Forward buttons
        Button backButton = new Button("Back");
        Button forwardButton = new Button("Forward");

        backButton.setOnAction(e -> webEngine.executeScript("history.back()"));
        forwardButton.setOnAction(e -> webEngine.executeScript("history.forward()"));

        // Progress bar to track loading progress
        ProgressBar progressBar = new ProgressBar(0);
        progressBar.progressProperty().bind(webEngine.getLoadWorker().progressProperty());

        // Handle page loading events
        webEngine.getLoadWorker().stateProperty().addListener((obs, oldState, newState) -> {
            if (newState == javafx.concurrent.Worker.State.SUCCEEDED) {
                urlField.setText(webEngine.getLocation());
            }
        });

        // Layout
        ToolBar toolBar = new ToolBar(backButton, forwardButton, urlField, progressBar);
        BorderPane root = new BorderPane();
        root.setTop(toolBar);
        root.setCenter(webView);

        // Create and show scene
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("JavaFX WebView Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
