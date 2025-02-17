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
}
