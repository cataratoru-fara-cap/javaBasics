public class Item {
    private char[] nom;
    private String description;
    private double prix;
    private long id;

    public Item(String nom, String description, long id, double prix) {
        this.nom = nom.toCharArray();
        this.description = description;
        this.id = id;
        this.prix = prix;
    }

    public Item(String nom, long id, double prix) {
        this.nom = nom.toCharArray();
        this.id = id;
        this.prix = prix;
    }
    
    public double getPrix() {
        return prix;
    }

    public double getPrix(int q) {
        if (q >= 5)
            return prix * 0.95;
        return prix;
    }
    
    public String toString() {
        if (description == null)
            return new String(nom) + " " + id + " " + prix;
        return new String(nom) + " " + description + " " + id + " " + prix;
    }
}
