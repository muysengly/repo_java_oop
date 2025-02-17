import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class UIService {
    PersistenceService ps;

    public UIService(PersistenceService _ps) {
        ps = _ps;
    }

    public void menu() {
        Scanner in = new Scanner(System.in);
        int option;
        do {
            System.out.println("Options: ");
            System.out.println("1) Add reservation ");
            System.out.println("2) Search reservation ");
            System.out.println("3) View all reservations ");
            System.out.println("0) Exit ");
            System.out.print("Enter your selection:");
            option = in.nextInt();
            in.nextLine();

            switch (option) {
                case 1:
                    addReservation();
                    break;
                case 2:
                    searchReservation();
                    break;
                case 3:
                    listReservations();
                    break;
                case 0:
                    break;
                default:
                    System.out.print("Please enter selection again:");
                    break;
            }
        } while (option != 0);
    }

    private void addReservation() {
        Scanner in = new Scanner(System.in);
        int option;
        String name, surname, startDateStr;
        int duration, day, month, year;

        System.out.print("Name: ");
        name = in.nextLine();

        System.out.print("Surname: ");
        surname = in.nextLine();

        System.out.print("Start date (YYYY-MM-DD): ");
        startDateStr = in.nextLine();
        LocalDate startDate = LocalDate.parse(startDateStr);

        System.out.print("Duration: ");
        duration = in.nextInt();
        in.nextLine();

        System.out.println("Available apartments:");
        ArrayList<Apartment> apartments = ps.getApartments();
        int i = 1;
        for (Apartment a : apartments) {
            System.out.println("Apartment no." + (i++) + ":");
            System.out.println(a);
        }
        System.out.print("(Press 0 to cancel): ");
        option = in.nextInt();
        in.nextLine();

        if (option > 0 && option <= apartments.size()) {
            Reservation resv = new Reservation(0, name, surname, startDate, duration,
                    apartments.get(option - 1).getPrice());
            addPersons(resv);
            ps.insertReservation(resv);
        }
    }

    private void addPersons(Reservation resv) {
        Scanner in = new Scanner(System.in);
        String name, surname, selection;
        int birthYear;

        System.out.println("Give the persons:");
        do {
            System.out.print("Name: ");
            name = in.nextLine();
            System.out.print("Surname: ");
            surname = in.nextLine();
            System.out.print("Birth Year: ");
            birthYear = in.nextInt();
            in.nextLine();

            resv.addPerson(new Person(0, name, surname, birthYear));

            System.out.print("Add another person? (y/n): ");
            selection = in.nextLine();
        } while (!selection.equals("n") && !selection.equals("N"));
    }

    private void searchReservation() {
        Scanner in = new Scanner(System.in);
        String surname;
        System.out.print("Enter surname (also partial): ");
        surname = in.nextLine();
        ArrayList<Reservation> reservations = ps.getReservationsBySurname(surname);

        for (Reservation r : reservations) {
            System.out.println(r);
        }
    }

    private void listReservations() {
        ArrayList<Reservation> reservations = ps.getAllReservations();
        for (Reservation r : reservations) {
            System.out.println(r);
        }
    }
}
