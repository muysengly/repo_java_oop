import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        try {
            ArrayList<Package> list = new ArrayList<>();
            PersistenceService ps = new PersistenceService(list);
            ps.loadFromFile();
            PackagesTable pt = new PackagesTable(ps, list);
        } catch (IOException ioe) {
            System.out.println("IO Exception!");
            ioe.printStackTrace();
            System.exit(1);
        }
    }
}
