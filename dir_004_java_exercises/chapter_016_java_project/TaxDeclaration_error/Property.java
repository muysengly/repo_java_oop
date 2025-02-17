import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Apartment.class, name = "Apartment"),
        @JsonSubTypes.Type(value = Store.class, name = "Store"),
        @JsonSubTypes.Type(value = Plot.class, name = "Plot")
})
public abstract class Property {
    protected int id;
    protected int surface;
    protected Address address;

    public Property(int id, int surface, Address address) {
        this.id = id;
        this.surface = surface;
        this.address = address;
    }

    public Property() {
    }

    public abstract double calculateTax();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
