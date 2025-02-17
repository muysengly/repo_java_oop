// StockTradingSimulator.java

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StockTradingSimulator extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Stock Trading Simulator");

        Stock stock = new Stock("ABC Company", 100.0);

        Trader trader1 = new Trader("Trader 1");
        Trader trader2 = new Trader("Trader 2");

        stock.setPriceChangeEventHandler(event -> {
            trader1.decideTrade(event.getPriceChange());
            trader2.decideTrade(event.getPriceChange());
        });

        Button simulateButton = new Button("Simulate Price Change");
        simulateButton.setOnAction(event -> {
            double priceChange = Math.random() * 10 - 5; // Simulate a random price change
            stock.updatePrice(priceChange);
        });

        VBox root = new VBox(simulateButton);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static class Stock {
        private String name;
        private double price;

        private EventHandler<PriceChangeEvent> priceChangeEventHandler;

        public Stock(String name, double initialPrice) {
            this.name = name;
            this.price = initialPrice;
        }

        public void setPriceChangeEventHandler(EventHandler<PriceChangeEvent> handler) {
            this.priceChangeEventHandler = handler;
        }

        public void updatePrice(double priceChange) {
            price += priceChange;
            if (priceChangeEventHandler != null) {
                PriceChangeEvent event = new PriceChangeEvent(priceChange);
                priceChangeEventHandler.handle(event);
            }
        }
    }

    public static class Trader {
        private String name;

        public Trader(String name) {
            this.name = name;
        }

        public void decideTrade(double priceChange) {
            if (priceChange > 0) {
                System.out.println(name + " buys stock.");
            } else if (priceChange < 0) {
                System.out.println(name + " sells stock.");
            } else {
                System.out.println(name + " does not trade.");
            }
        }
    }

    public static class PriceChangeEvent extends Event {
        public static final EventType<PriceChangeEvent> PRICE_CHANGE_EVENT = new EventType<>("PRICE_CHANGE");

        private double priceChange;

        public PriceChangeEvent(double priceChange) {
            super(PRICE_CHANGE_EVENT);
            this.priceChange = priceChange;
        }

        public double getPriceChange() {
            return priceChange;
        }
    }
}
