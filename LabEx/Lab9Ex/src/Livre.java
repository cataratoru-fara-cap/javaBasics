public class Livre {
    private String titre;
    private double prix;
    private int annee;
    private int numPages;
    private String ISBN;
    String domaine;

    public Livre(String titre, double prix, int annee, int numPages, String ISBN, String domaine){
    this.titre = titre;
    this.prix = prix;
    this.annee = annee;
    this.numPages = numPages;
    this.ISBN = ISBN;
    this.domaine = domaine;
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public static void main(String[] args) {
        
    }
}
