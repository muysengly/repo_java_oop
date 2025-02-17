import java.util.ArrayList;

public interface PersistenceService {
    void insertTaxDeclaration(TaxDeclaration td);

    void removeTaxDeclaration(TaxDeclaration td);

    ArrayList<TaxDeclaration> getTaxDeclarations(String vat, int year);
}
