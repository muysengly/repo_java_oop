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
}
