package Ex2;
public abstract class Carte {
    protected String iban;
    protected double somme;

    public abstract void retirer(double somme);

    @Override
    public String toString() {
        return "Carte [iban=" + iban + ", somme=" + somme + "]";
    }

    
}
