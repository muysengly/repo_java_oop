import java.util.ArrayList;
import java.util.Scanner;

public class UIService {
    private PersistenceService ps;
    private StatisticsService ss;

    public UIService(PersistenceService ps, StatisticsService ss) {
        this.ps = ps;
        this.ss = ss;
    }

    public void menu() {
        int sel;
        Scanner in = new Scanner(System.in);
        TaxDeclaration td = new TaxDeclaration();
        do {
            System.out.println("Options: ");
            System.out.println("--Transactions--");
            System.out.println("1: Add new Tax Declaration");
            System.out.println("2: Delete Tax Declaration: ");
            System.out.println("3: Find Tax Declaration: ");
            System.out.println("--Statistics--");
            System.out.println("11: Get total tax");
            System.out.println("12: Get Tax Declaration with highest tax");
            System.out.println("0: exit");

            System.out.print("Your choice: ");
            sel = in.nextInt();
            in.nextLine();

            switch (sel) {
                case 1:
                    create();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    search();
                    break;
                case 11:
                    System.out.println("Total Tax is: " + ss.getTotalTax());
                    break;
                case 12:
                    td = ss.getHighestDeclaration();
                    System.out.println("Highest Tax Declaration is: ");
                    System.out.println(td);
                    break;
                default:
                    break;
            }
        } while (sel != 0);
    }

    private void create() {
        Scanner in = new Scanner(System.in);
        String sel = "y";
        System.out.println("Enter person details");
        TaxDeclaration tax = enterTaxDeclarationDetails();

        System.out.println("Now enter properties: ");
        while (sel.equals("y")) {
            Property p = enterProperty();
            if (p != null) {
                tax.addProperty(p);
                System.out.println("Property added");
            } else
                System.out.println("No property added (user aborted)");

            System.out.println("Would you like to add another property? (y/n)");
            sel = in.nextLine();
        }

        ps.insertTaxDeclaration(tax);
        System.out.println("Tax declaration added!");
    }

    private void remove() {
        Scanner in = new Scanner(System.in);
        String sel;
        String search_vat;
        int submissionYear;
        System.out.print("Enter VAT number for search: ");
        search_vat = in.nextLine();
        System.out.print("Enter submission year: ");
        submissionYear = in.nextInt();
        in.nextLine();
        ArrayList<TaxDeclaration> td = ps.getTaxDeclarations(search_vat, submissionYear);

        if (td.size() == 1) {
            System.out.println("Found Tax Declaration:");
            System.out.println(td.get(0).toString());
            System.out.println("Delete Tax Declaration? (y/n) ");
            sel = in.nextLine();

            if (sel.equals("y")) {
                ps.removeTaxDeclaration(td.get(0));
                System.out.println(" Tax declaration deleted");
            } else {
                System.out.println(" Tax declaration NOT deleted");
            }
        } else
            System.out.println("tax declaration not found");
    }

    private void search() {
        String sel, search_vat;
        int submissionYear;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter VAT number for search (press return for all VATs): ");
        search_vat = in.nextLine();
        System.out.print("Enter submission year (press 0 for all years): ");
        submissionYear = in.nextInt();
        in.nextLine();

        ArrayList<TaxDeclaration> td = ps.getTaxDeclarations(search_vat, submissionYear);
        System.out.println("-----Tax Declarations-----");
        for (TaxDeclaration tax : td)
            System.out.println(tax);
    }

    private TaxDeclaration enterTaxDeclarationDetails() {
        Scanner in = new Scanner(System.in);
        String name, surname, vat, tel;
        int year;
        System.out.print("Name: ");
        name = in.nextLine();
        System.out.print("\nSurname: ");
        surname = in.nextLine();
        System.out.print("\nVAT number: ");
        vat = in.nextLine();
        System.out.print("\nTelephone: ");
        tel = in.nextLine();
        System.out.print("\nFiscal Year: ");
        year = in.nextInt();
        in.nextLine();

        return new TaxDeclaration(0, name, surname, vat, tel, year);
    }

    private Address enterAddress() {
        Scanner in = new Scanner(System.in);
        String street, number, zip, city;
        System.out.print("Street: ");
        street = in.nextLine();
        System.out.println("\nNumber: ");
        number = in.nextLine();
        System.out.println("\nZip code: ");
        zip = in.nextLine();
        System.out.println("\nCity: ");
        city = in.nextLine();

        return new Address(street, number, zip, city);
    }

    private Property enterProperty() {
        String sel, inside, cultivated;
        Address address;
        int surface, floor, commerciality;

        Scanner in = new Scanner(System.in);
        System.out.print("Select 1 for Apartment, 2 for Store, 3 for Plot, any other to abort: ");
        sel = in.nextLine();

        switch (sel) {
            case "1":
                address = enterAddress();
                System.out.print("Surface: ");
                surface = in.nextInt();
                in.nextLine();
                System.out.println("Floor: ");
                floor = in.nextInt();
                in.nextLine();
                return new Apartment(0, surface, address, floor);
            case "2":
                address = enterAddress();
                System.out.print("Surface: ");
                surface = in.nextInt();
                in.nextLine();
                System.out.print("Commerciality: ");
                commerciality = in.nextInt();
                in.nextLine();
                return new Store(0, surface, address, commerciality);
            case "3":
                address = enterAddress();
                System.out.print("Surface: ");
                surface = in.nextInt();
                in.nextLine();
                System.out.print("Inside town? ");
                inside = in.nextLine();
                System.out.print("Cultivated?");
                cultivated = in.nextLine();
                return new Plot(0, surface, address, (inside.equals("y")) ? true : false,
                        (cultivated.equals("y")) ? true : false);
            default:
                return null;

        }
    }

}
