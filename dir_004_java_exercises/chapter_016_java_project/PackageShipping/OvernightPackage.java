import java.time.LocalDate;

public class OvernightPackage extends Package {
    public OvernightPackage(String _recipient, String _address, double _weight,
            LocalDate _shipmentDate) {
        super(_recipient, _address, _weight, _shipmentDate);
    }

    public OvernightPackage() {
        super();
    }

    public double calculateCost() {
        return Constants.OVERNIGHT_PACKAGE_COST_FACTOR * weight;
    }

    public LocalDate calculateDeliveryTime() {
        return shipmentDate.plusDays(Constants.OVERNIGHT_PACKAGE_DAYS);
    }
}
