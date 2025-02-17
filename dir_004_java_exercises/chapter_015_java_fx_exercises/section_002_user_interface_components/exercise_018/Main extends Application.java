//Main.java

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Download Manager");

        ProgressBar progressBar = new ProgressBar(0);
        Button startButton = new Button("Start Download");

        startButton.setOnAction(event -> {
            // Simulate a download task.
            Task<Void> downloadTask = createDownloadTask(progressBar);
            Thread downloadThread = new Thread(downloadTask);
            downloadThread.start();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(progressBar, startButton);

        Scene scene = new Scene(root, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Task<Void> createDownloadTask(ProgressBar progressBar) {
        Task<Void> downloadTask = new Task<Void>() {
            @Override
            protected Void call() {
                for (int i = 0; i <= 100; i++) {
                    updateProgress(i, 100);
                    try {
                        Thread.sleep(100); // Simulate download delay.
                    } catch (InterruptedException e) {
                        // Handle interruption.
                        break;
                    }
                }
                return null;
            }
        };

        progressBar.progressProperty().bind(downloadTask.progressProperty());

        return downloadTask;
    }
}
