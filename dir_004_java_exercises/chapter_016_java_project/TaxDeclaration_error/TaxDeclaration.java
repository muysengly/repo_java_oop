import java.util.ArrayList;

public class TaxDeclaration {
    private int id;
    private String name;
    private String surname;
    private String vat;
    private String phone;
    int submissionYear;
    private ArrayList<Property> properties;

    public TaxDeclaration(int id, String name, String surname, String vat, String phone, int submissionYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.vat = vat;
        this.phone = phone;
        this.submissionYear = submissionYear;
        this.properties = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "TaxDeclaration{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", vat='" + vat + '\'' +
                ", phone='" + phone + '\'' +
                ", submissionYear=" + submissionYear +
                ", properties=" + properties +
                '}';
    }

    public void addProperty(Property p) {
        this.properties.add(p);
    }

    public double calculateTax() {
        double totalTax = 0;
        for (Property prop : properties) {
            totalTax += prop.calculateTax();
        }
        return totalTax;
    }

    public TaxDeclaration() {
        this.properties = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSubmissionYear() {
        return submissionYear;
    }

    public void setSubmissionYear(int submissionYear) {
        this.submissionYear = submissionYear;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
}
