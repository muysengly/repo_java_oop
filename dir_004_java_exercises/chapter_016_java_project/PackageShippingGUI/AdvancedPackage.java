import java.time.LocalDate;

public class AdvancedPackage extends Package {
    public AdvancedPackage(String _recipient, String _address, double _weight,
            LocalDate _shipmentDate) {
        super(_recipient, _address, _weight, _shipmentDate);
    }

    public AdvancedPackage() {
        super();
    }

    public double calculateCost() {
        return Constants.ADVANCED_PACKAGE_COST_FACTOR * weight
                + Constants.ADVANCED_PACKAGE_COST_SUPPL;
    }

    public LocalDate calculateDeliveryTime() {
        return shipmentDate.plusDays(Constants.ADVANCED_PACKAGE_DAYS);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n--Advanced Package--");
        str.append("\nRecipient: " + recipient);
        str.append("\nAddress: " + address);
        str.append("\nWeight: " + weight);
        str.append("\nShipment date:" + shipmentDate);
        str.append("\nExpected delivery date:" + calculateDeliveryTime());
        str.append("\nCost:" + calculateCost());
        str.append("\n---------------------");
        return str.toString();
    }

    public String serialize() {
        StringBuilder str = new StringBuilder();
        str.append("Advanced Package\n");
        str.append(recipient + "\n");
        str.append(address + "\n");
        str.append(weight + "\n");
        str.append(shipmentDate + "\n");
        str.append("--" + "\n");
        return str.toString();
    }

    public void deserialize(String s) {
        String[] lines = s.split("\\R");
        String package_type;

        recipient = lines[1];
        address = lines[2];
        weight = Double.parseDouble(lines[3]);
        shipmentDate = LocalDate.parse(lines[4]);
    }
}
