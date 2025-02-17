public class Main {
    public static void main(String args[]) {
        PersistenceService ps = new DBService();
        // PersistenceService ps = new FileService("td.json");
        StatisticsService ss = new StatisticsService(ps);
        UIService ui = new UIService(ps, ss);
        ui.menu();
    }
}
