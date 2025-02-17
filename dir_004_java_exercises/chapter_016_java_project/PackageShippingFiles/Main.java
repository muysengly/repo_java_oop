import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        try {
            ArrayList<Package> list = new ArrayList<>();
            UIService ui = new UIService(list);
            ui.loadFromFile();
            ui.menu();
        } catch (IOException ioe) {
            System.out.println("IO Exception!");
            ioe.printStackTrace();
            System.exit(1);
        }
    }
}
