public class Store extends Property {
    private int commerciality;

    public Store(int id, int surface, Address address, int commerciality) {
        super(id, surface, address);
        this.commerciality = commerciality;
    }

    public Store() {
        super();
    }

    @Override
    public String toString() {
        return "Store{" +
                "commerciality=" + commerciality +
                ", id=" + id +
                ", surface=" + surface +
                ", address=" + address +
                '}';
    }

    public double calculateTax() {
        return (2.5 * surface + 20 * commerciality + 100);
    }

    public int getCommerciality() {
        return commerciality;
    }

    public void setCommerciality(int commerciality) {
        this.commerciality = commerciality;
    }
}
