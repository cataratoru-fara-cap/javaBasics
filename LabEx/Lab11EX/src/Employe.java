public class Employe {
    private int id;
    private static int comp = 0;
    private String nom;
    private String prenom;
    private int age;
    private double salaireBrut;
    private double slaireNet;
    static private double impotSurRevenu = 10;
    private double taxe;

    public Employe(String nom, String prenom, int age, double salaireBrut, double slaireNet, double taxe) {
        
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaireBrut = salaireBrut;
        this.slaireNet = slaireNet;
        this.taxe = taxe;
        comp ++;
        this.id = comp;
    }
    
    public int getId(){
        return this.id;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaireBrut() {
        return salaireBrut;
    }

    public void setSalaireBrut(double salaireBrut) {
        this.salaireBrut = salaireBrut;
    }

    public double getSlaireNet() {
        return slaireNet;
    }

    public void setSlaireNet(double slaireNet) {
        this.slaireNet = slaireNet;
    }

    public static double getImpotSurRevenu() {
        return impotSurRevenu;
    }

    public double getTaxe() {
        return taxe;
    }

    public void setTaxe(double taxe) {
        this.taxe = taxe;
    }
}


