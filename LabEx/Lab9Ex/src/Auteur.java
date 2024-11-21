import java.util.ArrayList;

public class Auteur {
    private int code;
    private String nom;
    private String prenom;
    private String pays;
    private static int counter = 0;
    public ArrayList<Livre> liste = new ArrayList<>();
    
    public Auteur(String nom, String prenom, String pays){
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
        counter++;
        code = counter;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int newCode){
        this.code = newCode;
    }
    @Override
    public String toString(){
        return this.nom + " " + this.prenom + " " + this.pays + " " + this.code;
    }
    
    public void addLivre (Livre livre) {
        liste.add(livre);
    }
    public void printLivres(){
        for (int i = 0; i < liste.size(); i++) {
            System.out.println( liste.get(i) );
        }
    }
    public boolean modifierDomaine(String domaine, String ISBN) {
        for (int i = 0; i < liste.size(); i++) {
            if ( (liste.get(i).getDomaine().equals(ISBN)) ) {
                liste.get(i).setDomaine(domaine);
                return true;
            }
        }
        return false;
    }
    public Livre mostPages(){
        int max = 0;
        Livre maxLivre = liste.get(0);
        for (Livre book : liste) {
            if (book.getNumPages() >= max) {
                maxLivre = book;
                max = book.getNumPages();
            }
        }
        return maxLivre;
    }

    public static void main(String[] args) throws Exception {
        Auteur Gabi = new Auteur(null, null, null);
        System.out.println(Gabi.toString());
    }
}
