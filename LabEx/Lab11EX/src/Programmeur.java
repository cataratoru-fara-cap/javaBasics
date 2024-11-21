public class Programmeur extends Employe{
    public Programmeur(String nom, String prenom, int age, double salaireBrut, double slaireNet, double taxe){
        super(nom, prenom, age, salaireBrut, slaireNet, taxe);
    }
    public double getSalaireNet(){
        double salaire = super.getSalaireBrut();
        return salaire;
    }
}
