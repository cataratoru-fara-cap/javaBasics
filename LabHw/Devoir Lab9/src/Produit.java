import java.util.GregorianCalendar;

public class Produit {
    private static int counter = 0; 
    protected double prix;
    protected String dateProduction;
    protected int validite;
    protected String categorie;
    protected int id;

    public Produit(double prix, GregorianCalendar dateProduction, int validite, String categorie) {
        this.prix = prix;
        this.dateProduction = dateProduction.toString(); // Convert GregorianCalendar to String
        this.validite = validite;
        this.categorie = categorie;
        counter++;
        id = counter;
    }

    public String toString() {
        return id + " " + categorie + " " + prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDateProduction() {
        return dateProduction;
    }

    public void setDateProduction(String dateProduction) {
        this.dateProduction = dateProduction;
    }

    public int getValidite() {
        return validite;
    }

    public void setValidite(int validite) {
        this.validite = validite;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
