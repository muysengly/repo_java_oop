import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UIService {
    private List<Package> packages;

    public UIService(List<Package> _packages) {
        packages = _packages;
    }

    public void menu() throws IOException {
        Scanner in = new Scanner(System.in);
        int option;
        do {
            System.out.println("Options: ");
            System.out.println("1) Add package ");
            System.out.println("2) Search package ");
            System.out.println("3) Delete package ");
            System.out.println("4) View all packages ");
            System.out.println("0) Exit ");
            option = in.nextInt();
            in.nextLine();

            switch (option) {
                case 1:
                    addPackage();
                    break;
                case 2:
                    searchPackage();
                    break;
                case 3:
                    deletePackage();
                    break;
                case 4:
                    listPackages();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please type again:");
                    break;
            }
        } while (option != 0);
    }

    private void addPackage() throws IOException {
        Scanner in = new Scanner(System.in);
        int option;
        String recipient_name, recipient_address;
        double weight;

        System.out.println("Type of package (1-Basic, 2-Advanced, 3-Overnight)");
        option = in.nextInt();
        in.nextLine();
        System.out.println("Recipient name: ");
        recipient_name = in.nextLine();
        System.out.println("Recipient address: ");
        recipient_address = in.nextLine();
        System.out.println("Weight (kilos):");
        weight = in.nextDouble();
        in.nextLine();

        switch (option) {
            case 1:
                packages.add(new BasePackage(recipient_name, recipient_address,
                        weight, LocalDate.now()));
                saveToFile();
                break;
            case 2:
                packages.add(new AdvancedPackage(recipient_name, recipient_address,
                        weight, LocalDate.now()));
                saveToFile();
                break;
            case 3:
                packages.add(new OvernightPackage(recipient_name, recipient_address,
                        weight, LocalDate.now()));
                saveToFile();
                break;
            default:
                break;
        }
    }

    private void searchPackage() {
        Scanner in = new Scanner(System.in);
        String recipient_name;
        System.out.println("Enter recipient name (also partial): ");
        recipient_name = in.nextLine();

        for (Package p : packages) {
            if (p.getRecipient().indexOf(recipient_name) >= 0) {
                System.out.println(p);
            }
        }
    }

    private void deletePackage() throws IOException {
        Scanner in = new Scanner(System.in);
        String recipient_name;
        System.out.print("Enter recipient name (also partial): ");
        recipient_name = in.nextLine();

        int i = 0;
        System.out.println("The following packages were found:");
        for (Package p : packages) {
            if (p.getRecipient().indexOf(recipient_name) >= 0) {
                System.out.println("Package no. " + (i + 1) + ":");
                System.out.println(p);
            }
            i++;
        }

        int option;
        System.out.println("Please enter the no. of package to delete (0 to cancel): ");
        option = in.nextInt();
        in.nextLine();

        if (option > 0) {
            packages.remove(option - 1);
            System.out.println("package deleted");
            saveToFile();
        }
    }

    private void listPackages() {
        for (Package p : packages) {
            System.out.println(p);
        }
    }

    private void saveToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("packages.txt"));
        for (Package p : packages) {
            writer.write(p.serialize());
        }
        writer.close();
    }

    public void loadFromFile() throws IOException {
        packages.clear();

        File file = new File("packages.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        String package_str = "";
        while ((line = reader.readLine()) != null) {
            if (line.indexOf("--") == 0) {
                Package p;
                if (package_str.indexOf("Base Package") == 0) {
                    p = new BasePackage();
                    p.deserialize(package_str);
                    packages.add(p);
                } else if (package_str.indexOf("Advanced Package") == 0) {
                    p = new AdvancedPackage();
                    p.deserialize(package_str);
                    packages.add(p);
                } else if (package_str.indexOf("Overnight Package") == 0) {
                    p = new OvernightPackage();
                    p.deserialize(package_str);
                    packages.add(p);
                } else {
                    System.out.println("error loading packages. Exiting..");
                    System.exit(1);
                }
                package_str = "";
            } else {
                package_str += line + "\n";
            }
        }
        reader.close();
    }
}
