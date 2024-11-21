import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Livre {
    private String titre;
    private int nombrePages;
    private String isbn;
    private GregorianCalendar annee;
    private static int TVA;
    private double  prixUnitaire;
    private double prixVente;
    public ArrayList <Personne> auteurs;
    @SuppressWarnings("unused")
    private GregorianCalendar anneApparence;

    public Livre(String titre,int nombrePages, String isbn, GregorianCalendar anneApparence, double prixUnitaire, ArrayList<Personne> auteurs){
        this.titre = titre;
        this.nombrePages = nombrePages;
        this.isbn = isbn;
        this.anneApparence = anneApparence;
        this.prixUnitaire = prixUnitaire;
        this.auteurs = auteurs;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static int getTVA() {
        return TVA;
    }

    public static void setTVA(int tVA) {
        TVA = tVA;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public GregorianCalendar getAnnee() {
        return annee;
    }

    public void setAnnee(GregorianCalendar annee) {
        this.annee = annee;
    }

    public ArrayList<Personne> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(ArrayList<Personne> newAuteurs){
        this.auteurs = newAuteurs;
    }
    
    public double calculerPrixVente() {
        prixVente = prixUnitaire + prixUnitaire * TVA / 100;
        return prixVente;
    }

    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yy");
        @SuppressWarnings("unused")
        String date = formatter.format(annee.getTime());

        return "Livre" + "tittre = " + titre + ", nombrePages = " + nombrePages + "date";
    }
    public static void main(String[] args) {
        
    }
}
