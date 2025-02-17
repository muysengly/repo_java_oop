import java.time.LocalDate;

public class BasePackage extends Package {
    public BasePackage(String _recipient, String _address, double _weight,
            LocalDate _shipmentDate) {
        super(_recipient, _address, _weight, _shipmentDate);
    }

    public BasePackage() {
        super();
    }

    public double calculateCost() {
        return Constants.BASE_PACKAGE_COST_FACTOR * weight;
    }

    public LocalDate calculateDeliveryTime() {
        if (weight <= Constants.BASE_PACKAGE_MAX_WEIGHT)
            return shipmentDate.plusDays(Constants.BASE_PACKAGE_DAYS);
        else
            return shipmentDate.plusDays(Constants.BASE_PACKAGE_DAYS + 1);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n--Base Package--");
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
        str.append("Base Package\n");
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
