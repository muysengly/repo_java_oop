public class Apartment extends Property {
    private int floor;

    public Apartment(int id, int surface, Address address, int floor) {
        super(id, surface, address);
        this.floor = floor;
    }

    public Apartment() {
        super();
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "floor=" + floor +
                ", id=" + id +
                ", surface=" + surface +
                ", address=" + address +
                '}';
    }

    public double calculateTax() {
        return (1.3 * surface + 10 * floor + 150);
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
