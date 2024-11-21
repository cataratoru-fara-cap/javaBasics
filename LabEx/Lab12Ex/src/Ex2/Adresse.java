package Ex2;
public class Adresse {
    private String ville;
    private String rue;
    private int numeoro;

    public Adresse(String ville, String rue, int numeoro){
        this.ville = ville;
        this.rue = rue;
        this.numeoro = numeoro;
    }

    @Override
    public String toString() {
        return "Adresse [ville=" + ville + ", rue=" + rue + ", numeoro=" + numeoro + "]";
    }

    
}
