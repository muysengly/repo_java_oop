public class Apartment {
    private int id;
    private String address;
    private int capacity;
    private double price;

    public Apartment(int id, String address, int capacity, double price) {
        this.id = id;
        this.address = address;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "--Apartment--" +
                "\nid = " + id +
                "\naddress = " + address +
                "\ncapacity = " + capacity +
                "\nprice = " + price;
    }

    public double getPrice() {
        return price;
    }
}
