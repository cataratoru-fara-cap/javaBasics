public class Manager extends Employe {
    private int prime;

    public Manager(String nom, String prenom, int age, double salaireBrut, double slaireNet, double taxe, int prime) {
        super(nom, prenom, age, salaireBrut, slaireNet, taxe);
        this.prime = prime;
    }
    public double getSalaireNet(){
        double salaire = super.getSalaireBrut() + prime;
        salaire = salaire - salaire * super.getTaxe() / 100;
        salaire = salaire - salaire * super.getImpotSurRevenu();
        
        return salaire;
    }
    @Override
    public String toString(){
        return "Manager(prime=" + prime + super.toString() +")";
    }
    
}
