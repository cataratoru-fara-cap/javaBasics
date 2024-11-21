import java.util.ArrayList;

public abstract class Employe {
    private String nom;
    private int nombreDeProjets;
    private ArrayList<Projet> projects;

    public Employe(String nom){
        this.nom = nom;
    }

    public int getNombreDeProjets(){
        return projects.size();
    }

    public void addProjet(Projet p){
        this.projects.add(p);
    }

    public void addProjets(ArrayList <Projet> p){
        this.projects = p;
    }

    public int calculerBugetTotal(){
        int buget = 0;
        for (Projet p : projects)
            buget += p.getBuget();
        return buget;
    }

    public void afficherProjets(){
        for (Projet projet : projects)
            System.out.println(projet.toString());
    }

    public abstract double calculerSalaire();
}
