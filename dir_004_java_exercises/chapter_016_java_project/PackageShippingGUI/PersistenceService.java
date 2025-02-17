import java.io.*;
import java.util.List;

public class PersistenceService {
    private List<Package> packages;

    public PersistenceService(List<Package> _packages) {
        packages = _packages;
    }

    public void saveToFile() throws IOException {
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
                    System.exit(0);
                }
                package_str = "";
            } else {
                package_str += line + "\n";
            }
        }
        reader.close();
    }
}
