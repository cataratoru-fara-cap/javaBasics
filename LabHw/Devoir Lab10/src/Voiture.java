import java.util.GregorianCalendar;

public class Voiture {
    private static int counter = 0;
    private int codeUnique;
    private String marquete;
    private String modele; 
    private double prix;
    private String paysProduction;
    private GregorianCalendar dateFabrication;
    
    public Voiture(String marquete, String modele, double prix, String paysProduction, GregorianCalendar dateFabrication) {
        this.marquete = marquete;
        this.modele = modele;
        this.prix = prix;
        this.paysProduction = paysProduction;
        this.dateFabrication = dateFabrication;
        counter++;
        this.codeUnique = counter;
    }

    public String getMarquete() {
        return marquete;
    }

    public void setMarquete(String marquete) {
        this.marquete = marquete;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getPaysProduction() {
        return paysProduction;
    }

    public void setPaysProduction(String paysProduction) {
        this.paysProduction = paysProduction;
    }

    public GregorianCalendar getDateFabrication() {
        return dateFabrication;
    }

    public void setDateFabrication(GregorianCalendar dateFabrication) {
        this.dateFabrication = dateFabrication;
    }

    public int getCodeUnique() {
        return codeUnique;
    }

    public void setCodeUnique(int codeUnique) {
        this.codeUnique = codeUnique;
    }

    @Override
    public String toString() {
        return "Voiture [codeUnique=" + codeUnique + ", marquete=" + marquete + ", modele=" + modele + ", prix=" + prix
                + ", paysProduction=" + paysProduction + ", dateFabrication=" + dateFabrication + "]";
    }
    
    }

