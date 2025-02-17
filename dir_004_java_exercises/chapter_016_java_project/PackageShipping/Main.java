import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {
        Package[] packages = new Package[4];

        packages[0] = new BasePackage("John Doe", "12 Main str.", 15,
                LocalDate.of(2023, 1, 12));
        packages[1] = new BasePackage("Jane Doe", "1 High str.", 9.5,
                LocalDate.of(2022, 12, 30));
        packages[2] = new AdvancedPackage("Janet Doe", "3 Square dr.", 15,
                LocalDate.of(2023, 1, 12));
        packages[3] = new OvernightPackage("James Doe", "12 Infinite loop", 1,
                LocalDate.of(2023, 1, 20));

        int i = 1;
        for (Package p : packages) {
            System.out.println("Package no." + i++);
            System.out.println("Type: " + p.getClass());
            System.out.println("Delivery date: " + p.calculateDeliveryTime());
            System.out.println("Cost: " + p.calculateCost() + "\n");
        }
    }
}
