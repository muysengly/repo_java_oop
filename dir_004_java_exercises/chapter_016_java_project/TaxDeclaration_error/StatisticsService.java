import java.util.ArrayList;

public class StatisticsService {
    PersistenceService ps;

    public StatisticsService(PersistenceService ps) {
        this.ps = ps;
    }

    public double getTotalTax() {
        double totalTax = 0;
        for (TaxDeclaration td : ps.getTaxDeclarations("", 0)) {
            totalTax += td.calculateTax();
        }
        return totalTax;
    }

    public TaxDeclaration getHighestDeclaration() {
        ArrayList<TaxDeclaration> declarations = ps.getTaxDeclarations("", 0);

        if (declarations.size() > 0) {
            TaxDeclaration max = declarations.get(0);
            double highestTax = 0;
            for (TaxDeclaration td : declarations) {
                if (td.calculateTax() > highestTax) {
                    max = td;
                    highestTax = td.calculateTax();
                }
            }
            return max;
        } else
            return null;
    }
}
