import java.time.LocalDate;

public abstract class Package {
    private String recipient;
    private String address;
    double weight;
    LocalDate shipmentDate;

    public Package(String _recipient, String _address, double _weight,
            LocalDate _shipmentDate) {
        recipient = _recipient;
        address = _address;
        weight = _weight;
        shipmentDate = _shipmentDate;
    }

    public Package() {
        recipient = "";
        address = "";
        weight = 0;
    }

    public abstract double calculateCost();

    public abstract LocalDate calculateDeliveryTime();
}
