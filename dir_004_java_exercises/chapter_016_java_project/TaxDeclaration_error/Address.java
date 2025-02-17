public class Address {
    private String street;
    private String number;
    private String zip;
    private String city;

    public Address(String street, String number, String zip, String city) {
        this.street = street;
        this.number = number;
        this.zip = zip;
        this.city = city;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
