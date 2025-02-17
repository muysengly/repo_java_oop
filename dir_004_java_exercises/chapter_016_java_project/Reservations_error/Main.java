public class Main {
    public static void main(String args[]) {
        PersistenceService ps = new PersistenceService();
        UIService ui = new UIService(ps);
        ui.menu();
    }
}
