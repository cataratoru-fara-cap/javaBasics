public class Personne {
    private String nom, prenom;
    private int age;
    private String sexe;

    public Personne() {   
    }
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public Personne(String nom, String prenom, int age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    public String toString() {
        return ("age = " + this.age + "FullName = " + this.nom + " " + this.prenom + "sexe = " + this.sexe);
    }
    
    public String getNom() {
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public int getAge(){
        return age;
    }
    public String getSexe() {
        return sexe;
    }
    
    public void setNom(String newNom) {
        this.nom = newNom;
    }
    public void setPrenom(String newPrenom){
        this.prenom = newPrenom;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setSexe(String newSexe) {
        this.sexe = newSexe;
    }


}
