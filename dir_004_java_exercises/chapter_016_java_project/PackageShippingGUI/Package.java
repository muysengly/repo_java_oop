import java.time.LocalDate;

public abstract class Package {
    protected String recipient;
    protected String address;
    protected double weight;
    protected LocalDate shipmentDate;

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

    public String getRecipient() {
        return recipient;
    }

    public String getAddress() {
        return address;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    public abstract String toString();

    public abstract String serialize();

    public abstract void deserialize(String s);

    public abstract double calculateCost();

    public abstract LocalDate calculateDeliveryTime();
}
