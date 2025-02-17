import java.sql.*;
import java.util.ArrayList;

public class DBService implements PersistenceService {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public DBService() {
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost/tax?"
                            + "user=root&password=root1234");

            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("Could not connect to database. Exiting..");
            System.exit(0);
        }
    }

    public void insertTaxDeclaration(TaxDeclaration td) {
        try {
            preparedStatement = connection
                    .prepareStatement(
                            "insert into TaxDeclarations(name, surname, vat, phone, submissionYear) values(?, ?, ?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, td.getName());
            preparedStatement.setString(2, td.getSurname());
            preparedStatement.setString(3, td.getVat());
            preparedStatement.setString(4, td.getPhone());
            preparedStatement.setInt(5, td.getSubmissionYear());

            preparedStatement.executeUpdate();

            int lastInsertedId = 0;
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedId = rs.getInt(1);
            }

            ArrayList<Property> properties = td.getProperties();
            for (Property p : properties) {
                if (p instanceof Apartment) {
                    Apartment temp = (Apartment) p;
                    PreparedStatement newStatement = connection
                            .prepareStatement(
                                    "insert into Apartments(surface, floor, taxDeclarationId) values(?, ?, ?)",
                                    Statement.RETURN_GENERATED_KEYS);

                    newStatement.setInt(1, temp.getSurface());
                    newStatement.setInt(2, temp.getFloor());
                    newStatement.setInt(3, lastInsertedId);
                    newStatement.executeUpdate();

                    int lastInsertPropertyId = 0;
                    ResultSet rs1 = newStatement.getGeneratedKeys();
                    if (rs1.next()) {
                        lastInsertPropertyId = rs1.getInt(1);
                    }

                    PreparedStatement newStatement1 = connection
                            .prepareStatement(
                                    "insert into Addresses(street, number, zip, city, propertyId) values(?, ?, ?, ?, ?)");

                    newStatement1.setString(1, temp.getAddress().getStreet());
                    newStatement1.setString(2, temp.getAddress().getZip());
                    newStatement1.setString(3, temp.getAddress().getZip());
                    newStatement1.setString(4, temp.getAddress().getCity());
                    newStatement1.setInt(5, lastInsertPropertyId);
                    newStatement1.executeUpdate();
                } else if (p instanceof Store) {
                    Store temp = (Store) p;
                    PreparedStatement newStatement = connection
                            .prepareStatement(
                                    "insert into Stores(surface, commerciality, taxDeclarationId) values(?, ?, ?)",
                                    Statement.RETURN_GENERATED_KEYS);

                    newStatement.setInt(1, temp.getSurface());
                    newStatement.setInt(2, temp.getCommerciality());
                    newStatement.setInt(3, lastInsertedId);
                    newStatement.executeUpdate();

                    int lastInsertPropertyId = 0;
                    ResultSet rs1 = newStatement.getGeneratedKeys();
                    if (rs1.next()) {
                        lastInsertPropertyId = rs1.getInt(1);
                    }

                    PreparedStatement newStatement1 = connection
                            .prepareStatement(
                                    "insert into Addresses(street, number, zip, city, propertyId) values(?, ?, ?, ?, ?)");

                    newStatement1.setString(1, temp.getAddress().getStreet());
                    newStatement1.setString(2, temp.getAddress().getZip());
                    newStatement1.setString(3, temp.getAddress().getZip());
                    newStatement1.setString(4, temp.getAddress().getCity());
                    newStatement1.setInt(5, lastInsertPropertyId);
                    newStatement1.executeUpdate();
                }
                if (p instanceof Plot) {
                    Plot temp = (Plot) p;

                    PreparedStatement newStatement = connection
                            .prepareStatement(
                                    "insert into Plots(surface, cultivated, withinCityLimits, taxDeclarationId) values(?, ?, ?, ?)",
                                    Statement.RETURN_GENERATED_KEYS);

                    newStatement.setInt(1, temp.getSurface());
                    newStatement.setBoolean(2, temp.isCultivated());
                    newStatement.setBoolean(3, temp.isWithinCityLimits());
                    newStatement.setInt(4, lastInsertedId);
                    newStatement.executeUpdate();

                    int lastInsertPropertyId = 0;
                    ResultSet rs1 = newStatement.getGeneratedKeys();
                    if (rs1.next()) {
                        lastInsertPropertyId = rs1.getInt(1);
                    }

                    PreparedStatement newStatement1 = connection
                            .prepareStatement(
                                    "insert into Addresses(street, number, zip, city, propertyId) values(?, ?, ?, ?, ?)");

                    newStatement1.setString(1, temp.getAddress().getStreet());
                    newStatement1.setString(2, temp.getAddress().getZip());
                    newStatement1.setString(3, temp.getAddress().getZip());
                    newStatement1.setString(4, temp.getAddress().getCity());
                    newStatement1.setInt(5, lastInsertPropertyId);
                    newStatement1.executeUpdate();
                }
            }
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException se) {
                System.out.println("Database error. Exiting..");
                e.printStackTrace();
                System.exit(0);
            }
            System.out.println("Database error. Exiting..");
            e.printStackTrace();
            close();
            System.exit(0);
        }
    }

    public void removeTaxDeclaration(TaxDeclaration td) {
        try {
            preparedStatement = connection
                    .prepareStatement(
                            "delete from Addresses where propertyId in (select id from Apartments where taxDeclarationId = ?");

            preparedStatement.setInt(1, td.getId());
            preparedStatement.executeUpdate();

            preparedStatement = connection
                    .prepareStatement("delete from Apartments where taxDeclarationId = ?");

            preparedStatement.setInt(1, td.getId());
            preparedStatement.executeUpdate();

            preparedStatement = connection
                    .prepareStatement(
                            "delete from Addresses where propertyId in (select id from Stores where taxDeclarationId = ?");

            preparedStatement.setInt(1, td.getId());
            preparedStatement.executeUpdate();

            preparedStatement = connection
                    .prepareStatement("delete from Stores where taxDeclarationId = ?");

            preparedStatement.setInt(1, td.getId());
            preparedStatement.executeUpdate();

            preparedStatement = connection
                    .prepareStatement(
                            "delete from Addresses where propertyId in (select id from Plots where taxDeclarationId = ?");

            preparedStatement.setInt(1, td.getId());
            preparedStatement.executeUpdate();

            preparedStatement = connection
                    .prepareStatement("delete from Plots where taxDeclarationId = ?");

            preparedStatement.setInt(1, td.getId());
            preparedStatement.executeUpdate();

            preparedStatement = connection
                    .prepareStatement("delete from TaxDeclarations where id = ?");

            preparedStatement.setInt(1, td.getId());
            preparedStatement.executeUpdate();

            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException se) {
                System.out.println("Database error. Exiting..");
                e.printStackTrace();
                System.exit(0);
            }
            System.out.println("Database error. Exiting..");
            e.printStackTrace();
            close();
            System.exit(0);
        }
    }

    public ArrayList<TaxDeclaration> getTaxDeclarations(String vat, int year) {
        ArrayList<TaxDeclaration> result = new ArrayList<>();
        try {
            String query;
            if (vat != "") {
                if (year != 0) {
                    preparedStatement = connection
                            .prepareStatement("SELECT * from TaxDeclarations WHERE vat = ? and submissionYear = ?");

                    preparedStatement.setString(1, vat);
                    preparedStatement.setInt(2, year);
                } else {
                    preparedStatement = connection
                            .prepareStatement("SELECT * from TaxDeclarations WHERE vat = ?");

                    preparedStatement.setString(1, vat);
                }
            } else {
                if (year != 0) {
                    preparedStatement = connection
                            .prepareStatement("SELECT * from TaxDeclarations WHERE submissionYear = ?");

                    preparedStatement.setInt(1, year);
                } else {
                    preparedStatement = connection
                            .prepareStatement("SELECT * from TaxDeclarations");

                }
            }

            ResultSet res = preparedStatement.executeQuery();

            while (res.next()) {
                TaxDeclaration td = new TaxDeclaration(
                        res.getInt("id"),
                        res.getString("name"),
                        res.getString("surname"),
                        res.getString("vat"),
                        res.getString("phone"),
                        res.getInt("submissionYear"));

                PreparedStatement newStatement = connection
                        .prepareStatement("SELECT * from Apartments where taxDeclarationId = ?");

                newStatement.setInt(1, res.getInt("id"));
                ResultSet newRes = newStatement.executeQuery();

                while (newRes.next()) {
                    PreparedStatement newStatement2 = connection
                            .prepareStatement("SELECT * from Addresses where propertyId = ?");

                    newStatement2.setInt(1, newRes.getInt("id"));
                    ResultSet newRes2 = newStatement2.executeQuery();

                    if (newRes2.next()) {
                        Address addr = new Address(
                                newRes2.getString("street"),
                                newRes2.getString("number"),
                                newRes2.getString("zip"),
                                newRes2.getString("city"));

                        Apartment ap = new Apartment(
                                newRes.getInt("id"),
                                newRes.getInt("surface"),
                                addr,
                                newRes.getInt("floor"));

                        td.addProperty(ap);
                    } else {
                        System.out.println("error");
                        System.exit(0);
                    }
                }

                newStatement = connection
                        .prepareStatement("SELECT * from Stores where taxDeclarationId = ?");

                newStatement.setInt(1, res.getInt("id"));
                newRes = newStatement.executeQuery();

                while (newRes.next()) {
                    PreparedStatement newStatement2 = connection
                            .prepareStatement("SELECT * from Addresses where propertyId = ?");

                    newStatement2.setInt(1, newRes.getInt("id"));
                    ResultSet newRes2 = newStatement2.executeQuery();

                    if (newRes2.next()) {
                        Address addr = new Address(
                                newRes2.getString("street"),
                                newRes2.getString("number"),
                                newRes2.getString("zip"),
                                newRes2.getString("city"));

                        Store st = new Store(
                                newRes.getInt("id"),
                                newRes.getInt("surface"),
                                addr,
                                newRes.getInt("commerciality"));

                        td.addProperty(st);
                    } else {
                        System.out.println("error");
                        System.exit(0);
                    }
                }

                newStatement = connection
                        .prepareStatement("SELECT * from Plots where taxDeclarationId = ?");

                newStatement.setInt(1, res.getInt("id"));
                newRes = newStatement.executeQuery();

                while (newRes.next()) {
                    PreparedStatement newStatement2 = connection
                            .prepareStatement("SELECT * from Addresses where propertyId = ?");

                    newStatement2.setInt(1, newRes.getInt("id"));
                    ResultSet newRes2 = newStatement2.executeQuery();

                    if (newRes2.next()) {
                        Address addr = new Address(
                                newRes2.getString("street"),
                                newRes2.getString("number"),
                                newRes2.getString("zip"),
                                newRes2.getString("city"));

                        Plot pl = new Plot(
                                newRes.getInt("id"),
                                newRes.getInt("surface"),
                                addr,
                                newRes.getBoolean("cultivated"),
                                newRes.getBoolean("withinCityLimits"));

                        td.addProperty(pl);
                    } else {
                        System.out.println("error");
                        System.exit(0);
                    }
                }
                result.add(td);
            }
        } catch (SQLException e) {
            System.out.println("Database error. Exiting..");
            e.printStackTrace();
            close();
            System.exit(0);
        }
        return result;
    }

    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            System.out.println("Error: Could not close connection");
            e.printStackTrace();
        }
    }
}
