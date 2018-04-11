
package sammlungen;

/**
 *
 * @author CC-Student
 */
public class Kunde {
    private String name;
    private double rechnungsBetrag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRechnungsBetrag() {
        return rechnungsBetrag;
    }

    public void setRechnungsBetrag(double rechnungsBetrag) {
        this.rechnungsBetrag = rechnungsBetrag;
    }

    public Kunde(String name, double rechnungsBetrag) {
        this.name = name;
        this.rechnungsBetrag = rechnungsBetrag;
    }
    
    
    
}
