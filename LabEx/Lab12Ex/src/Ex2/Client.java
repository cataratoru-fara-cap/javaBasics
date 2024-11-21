package Ex2;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Client{
    private String nom;
    private GregorianCalendar aniversaire;
    private String cnp;
    private Adresse adresse;
    ArrayList<Carte> cartes = new ArrayList<>();
    
    public Client(String nom, GregorianCalendar aniversaire, String cnp, Adresse addresse){
         this.nom = nom;
         this.aniversaire = aniversaire;
         this.cnp = cnp;
         this.adresse = addresse;
    }

    public boolean ajouterCarte(Carte c){
        return cartes.add(c);
    }

    public Carte supprimerCarte (String iban){
        Carte returnable = null;
        for (Carte c : cartes) {
            if (c.iban.equals(iban)) {
                returnable = c;
                cartes.remove(c);
            }
            break;
        }
        return returnable;
    }

    @Override
    public String toString() {
        return "Client [nom=" + nom + ", aniversaire=" + aniversaire + ", cnp=" + cnp + ", adresse=" + adresse
                + ", cartes=" + cartes + "]";
    }

    
}
