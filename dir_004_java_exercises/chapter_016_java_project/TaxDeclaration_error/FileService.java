import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileService implements PersistenceService {

    ArrayList<TaxDeclaration> declarations;
    String filename;

    public FileService(String filename) {
        this.filename = filename;
        this.declarations = new ArrayList<>();
        loadFromFile();
    }

    public void insertTaxDeclaration(TaxDeclaration td) {
        declarations.add(td);
        saveToFile();
    }

    public void removeTaxDeclaration(TaxDeclaration declaration) {
        for (TaxDeclaration td : declarations) {
            if (td.getVat().equals(declaration.getVat()) && td.getSubmissionYear() == declaration.getSubmissionYear()) {
                declarations.remove(td);
                break;
            }
        }
        saveToFile();
    }

    public ArrayList<TaxDeclaration> getTaxDeclarations(String vat, int submissionYear) {
        if (vat.trim().equals("") && submissionYear == 0)
            return declarations;

        ArrayList<TaxDeclaration> ret = new ArrayList<>();
        for (TaxDeclaration td : declarations) {
            if (!vat.equals("")) {
                if (submissionYear != 0) {
                    if (td.getVat().equals(vat) && td.getSubmissionYear() == submissionYear)
                        ret.add(td);
                } else {
                    if (td.getVat().equals(vat))
                        ret.add(td);
                }
            } else {
                if (submissionYear != 0) {
                    if (td.getSubmissionYear() == submissionYear)
                        ret.add(td);
                }
            }
        }
        return ret;
    }

    private void saveToFile() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File(filename), declarations);
        } catch (IOException e) {
            System.out.println("Problem writing to file. Exiting...");
            e.printStackTrace();
            System.exit(0);
        }
    }

    private void loadFromFile() {
        try {
            File file = new File(filename);
            if (!file.exists()) {
                file.createNewFile();
            }

            if (file.length() > 0) {
                ObjectMapper objectMapper = new ObjectMapper();
                ObjectReader reader = objectMapper
                        .readerFor(new TypeReference<ArrayList<TaxDeclaration>>() {
                        });
                declarations = reader.readValue(Paths.get(filename).toFile());
            } else {
                declarations = new ArrayList<>();
            }
        } catch (IOException e) {
            System.out.println("Problem reading from file. Exiting...");
            e.printStackTrace();
            System.exit(0);
        }
    }
}
