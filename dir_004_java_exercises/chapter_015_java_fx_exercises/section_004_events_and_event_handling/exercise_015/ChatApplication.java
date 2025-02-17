// ChatApplication.java

// Import required JavaFX libraries
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Create a JavaFX application class that extends Application
public class ChatApplication extends Application {
    // Main method, entry point of the application
    public static void main(String[] args) {
        launch(args);
    }

    // Override the start method of Application
    @Override
    public void start(Stage primaryStage) {
        // Set the title of the primary stage
        primaryStage.setTitle("Chat Application");

        // Create instances of ChatWindow for sender and receiver
        ChatWindow sender = new ChatWindow("Sender");
        ChatWindow receiver = new ChatWindow("Receiver");

        // Set up event handlers for sending and receiving messages between sender and
        // receiver
        sender.setSendMessageEventHandler(event -> receiver.receiveMessage(event.getMessage()));
        receiver.setReceiveMessageEventHandler(event -> sender.receiveMessage(event.getMessage()));

        // Create a VBox layout for the root of the scene
        VBox root = new VBox(sender.getUI(), receiver.getUI());

        // Create a new scene and set it on the primary stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);

        // Show the primary stage
        primaryStage.show();
    }

    // Define a custom event class for sending messages
    public static class SendMessageEvent extends Event {
        public static final EventType<SendMessageEvent> SEND_MESSAGE_EVENT = new EventType<>("SEND_MESSAGE");

        private final String message;

        public SendMessageEvent(String message) {
            super(SEND_MESSAGE_EVENT);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    // Define a custom event class for receiving messages
    public static class ReceiveMessageEvent extends Event {
        public static final EventType<ReceiveMessageEvent> RECEIVE_MESSAGE_EVENT = new EventType<>("RECEIVE_MESSAGE");

        private final String message;

        public ReceiveMessageEvent(String message) {
            super(RECEIVE_MESSAGE_EVENT);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    // Create a class for the chat window
    public class ChatWindow {
        private String name;
        private TextArea chatTextArea;
        private EventHandler<SendMessageEvent> sendMessageEventHandler;
        private EventHandler<ReceiveMessageEvent> receiveMessageEventHandler;
        private VBox ui; // Define the UI as a member variable

        // Constructor for ChatWindow
        public ChatWindow(String name) {
            this.name = name;
            this.chatTextArea = new TextArea();
            this.chatTextArea.setEditable(false);

            // Create a "Send" button and an input text area
            Button sendButton = new Button("Send");
            TextArea inputTextArea = new TextArea();

            // Define an event handler for the "Send" button
            sendButton.setOnAction(event -> {
                String message = inputTextArea.getText();
                if (!message.isEmpty() && sendMessageEventHandler != null) {
                    SendMessageEvent sendEvent = new SendMessageEvent(message);
                    sendMessageEventHandler.handle(sendEvent);
                    inputTextArea.clear();
                }
            });

            // Initialize the UI layout with chat text area, input text area, and "Send"
            // button
            ui = new VBox(chatTextArea, inputTextArea, sendButton);
        }

        // Set an event handler for sending messages
        public void setSendMessageEventHandler(EventHandler<SendMessageEvent> handler) {
            this.sendMessageEventHandler = handler;
        }

        // Set an event handler for receiving messages
        public void setReceiveMessageEventHandler(EventHandler<ReceiveMessageEvent> handler) {
            this.receiveMessageEventHandler = handler;
        }

        // Receive and display a message in the chat window
        public void receiveMessage(String message) {
            chatTextArea.appendText(name + ": " + message + "\n");
            if (receiveMessageEventHandler != null) {
                ReceiveMessageEvent receiveEvent = new ReceiveMessageEvent(message);
                receiveMessageEventHandler.handle(receiveEvent);
            }
        }

        // Get the UI layout of the chat window
        public VBox getUI() {
            return ui;
        }
    }
}
