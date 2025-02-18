package dir_005_my_example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebViewWithCustomFont extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create WebView and WebEngine
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        // Load a webpage
        webEngine.load("https://www.google.com");

        // Inject custom CSS for better readability
        webEngine.documentProperty().addListener((obs, oldDoc, newDoc) -> {
            if (newDoc != null) {
                String css = """
                            var style = document.createElement('style');
                            style.innerHTML = `
                                body {
                                    font-family: Arial, sans-serif !important;
                                    font-size: 18px !important;
                                    line-height: 1.6 !important;
                                    color: #333 !important;
                                    background-color: #f8f8f8 !important;
                                }
                            `;
                            document.head.appendChild(style);
                        """;
                webEngine.executeScript(css);
            }
        });

        // Layout
        BorderPane root = new BorderPane(webView);
        Scene scene = new Scene(root, 800, 600);

        // Show Stage
        primaryStage.setTitle("WebView with Readable Font");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
