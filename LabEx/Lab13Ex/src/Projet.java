public class Projet {
    private String nom;
    private int buget;

    public Projet(String nom, int buget){
        this.nom = nom;
        this.buget = buget;
    }

    public int getBuget(){
        return this.buget;
    }

    public void setBuget(int buget){
        this.buget = buget;
    }
    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Projet [nom=" + nom + ", buget=" + buget + "]";
    }
}
