public class Plot extends Property {
    private boolean withinCityLimits;
    private boolean cultivated;

    public Plot(int id, int surface, Address address, boolean withinCityLimits, boolean cultivated) {
        super(id, surface, address);
        this.withinCityLimits = withinCityLimits;
        this.cultivated = cultivated;
    }

    public Plot() {
        super();
    }

    @Override
    public String toString() {
        return "Plot{" +
                "withinCityLimits=" + withinCityLimits +
                ", cultivated=" + cultivated +
                ", id=" + id +
                ", surface=" + surface +
                ", address=" + address +
                '}';
    }

    public double calculateTax() {
        return (0.3 * surface + 100 * (cultivated ? 1 : 0) + 200 * (withinCityLimits ? 1 : 0));
    }

    public boolean isWithinCityLimits() {
        return withinCityLimits;
    }

    public void setWithinCityLimits(boolean withinCityLimits) {
        this.withinCityLimits = withinCityLimits;
    }

    public boolean isCultivated() {
        return cultivated;
    }

    public void setCultivated(boolean cultivated) {
        this.cultivated = cultivated;
    }
}
